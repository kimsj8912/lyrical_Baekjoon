import sys
testCases = int(input())

for i in range(testCases):
    a, b = map(int, sys.stdin.readline().split())
    print(a+b)