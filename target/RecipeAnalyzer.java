import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.InputStream;

public class Recipinator {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];

        InputStream instream;

        if (inputFile != null)
            instream = new FileInputStream(inputFile);
        else
            instream = System.in;

        CharStream charStream = CharStreams.fromStream(instream);
        recipeLexer lexer = new recipeLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        recipeParser parser = new recipeParser(tokens);

        ParseTree tree = parser.recipe();

        // 0: Print Recipe Name
        String recipeName = tree.getChild(0).getChild(1).getText();
        System.out.println("Recipe Name: " + recipeName);

        // 1: Print Total Time Needed
        ParseTree timeTree = tree.getChild(1);

        ParseTree prepDurationTree = timeTree.getChild(0).getChild(1);
        String prepUnit = prepDurationTree.getChild(prepDurationTree.getChildCount() - 1).getText();
        String prepValueText = prepDurationTree.getChild(0).getText();
        Integer prepTime = parseJint(prepValueText, prepUnit);
        /*
         * System.out.println("Prep:");
         * System.out.println("    Text Value: " + prepValueText);
         * System.out.println("    Unit: " + prepUnit);
         * System.out.println("    Time in mins: " + prepTime);
         */

        Integer cookTime = 0;
        if (timeTree.getChild(2) != null) {
            ParseTree cookDurationTree = timeTree.getChild(2).getChild(1);
            String cookUnit = cookDurationTree.getChild(cookDurationTree.getChildCount() - 1).getText();
            String cookValueText = cookDurationTree.getChild(0).getText();
            cookTime = parseJint(cookValueText, cookUnit);
        }
        /*
         * System.out.println("Cook:");
         * System.out.println("    Text Value: " + cookValueText);
         * System.out.println("    Unit: " + cookUnit);
         * System.out.println("    Time in mins: " + cookTime);
         */

        Integer totalTime = cookTime + prepTime;
        System.out.println("Total time needed: " + totalTime + " min");

        // 2: Get Ingredient Count
        int ingredientCount = tree.getChild(3).getChildCount() - 3;
        System.out.println("Ingredient Count: " + ingredientCount);

        // 3: Check if all ingredients are used
        ArrayList<String> ingredientNames = new ArrayList<String>();
        for (int i = 3; i < ingredientCount + 3; i++) {
            ParseTree ingredientsTree = tree.getChild(3);
            ParseTree currentIngredientTree = ingredientsTree.getChild(i);
            int currentIngredientCount = currentIngredientTree.getChildCount();
            String ingredientName = currentIngredientTree.getChild(currentIngredientCount - 2).getText();
            ingredientNames.add(ingredientName);
        }

        int instructionCount = tree.getChild(4).getChildCount() - 3;
        for (int i = 3; i < instructionCount + 3; i++) {
            ParseTree instructionTree = tree.getChild(4);
            ParseTree currentSentenceTree = instructionTree.getChild(i).getChild(2);
            int wordCount = currentSentenceTree.getChildCount();
            for (int j = 0; j < wordCount; j++) {
                String word = currentSentenceTree.getChild(j).getText();
                if (ingredientNames.contains(word)) {
                    ingredientNames.remove(word);
                }
            }
        }

        if (!ingredientNames.isEmpty())
            System.out.println("WARNING! WARNING! WARNING!!! INGREDIENT NOT!! FOUND!!!: " + ingredientNames);
    }

    static Integer parseJint(String s, String u) {
        Integer mult = 1;
        if (u.contains("hr")) {
            mult = 60;
        }

        Integer sum = 0;
        String[] split = s.split("\\s+");
        sum += Integer.parseInt(split[0]) * mult;

        if (split.length == 1) {
            return sum;
        }

        String[] split2 = split[1].split("/");
        Integer fraction = Integer.parseInt(split2[0]) * mult / Integer.parseInt(split2[1]);
        if (fraction != null)
            sum += fraction;
        return sum;
    }
}
