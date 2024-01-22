import sys
n = int(input())
a = list(map(int, sys.stdin.readline().split()))
answer = int(input())
count = 0

for x in a:
    if x == answer:
        count += 1

print(count)