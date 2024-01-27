import sys
n = int(input())
a = list(map(int, sys.stdin.readline().split()))
a.sort()

print(f"{a[0]} {a[n-1]}")