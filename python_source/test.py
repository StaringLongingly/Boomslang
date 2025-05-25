# Beginning of Boomslang Tabloid Source to Python 3 source compiler: factorial.tbd
# Beginning of the python program
print("Hello, World!")
def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)
result = factorial(10)
print("Result is")
print(result)

# End of the python program

