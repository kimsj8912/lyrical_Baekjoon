answer = int(input())
num = 1

for i in range(8):
    tmp = int(input())
    if(tmp > answer):
        answer = tmp
        num = i+2

print(answer)
print(num)