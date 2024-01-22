total = int(input())
n = int(input())
answer = 0
for i in range(n):
    price, count = map(int, input().split())
    answer += price * count

if total == answer:
    print("Yes")
else:
    print("No")