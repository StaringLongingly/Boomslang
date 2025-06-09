# Beginning of Boomslang Tabloid Source to Python 3 source compiler: sample1.tbd
# Beginning of the python program

def fibonacci(a, b, n):
    if n < 1:
        return b
    else:
        print(b)
        return fibonacci(b, a + b, n - 1)
limit = 10
print("First 10 Fibonacci numbers")
nothing = fibonacci(0, 1, limit)

# End of the python program
