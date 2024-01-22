n = int(input())
num = 1
for i in range(n):
    for j in range(n-num):
        print(" ", end="")
    for k in range(num):
        print("*", end="")
    print("")
    num += 1