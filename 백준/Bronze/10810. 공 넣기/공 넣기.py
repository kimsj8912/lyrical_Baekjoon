n, m = map(int, input().split())

a = [0 for i in range(n)]

for i in range(m):
    start, end, num = map(int, input().split())
    for j in range(start-1, end):
        a[j] = num

for i in a:
    print(i, end=" ")