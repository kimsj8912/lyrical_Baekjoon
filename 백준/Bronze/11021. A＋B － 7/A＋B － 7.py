import sys
testCases = int(input())
num = 1
for i in range(testCases):
    a, b = map(int, sys.stdin.readline().split())
    print(f"Case #{num}: {a+b}")
    num += 1