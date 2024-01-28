n, m = map(int, input().split())

a = [i+1 for i in range(n)]

for i in range(m):
    start, end = map(int, input().split())
    tmp = a[start-1]
    a[start-1] = a[end-1]
    a[end-1] = tmp

for i in a:
    print(i, end=" ")