n = int(input())
left = 0
right = 0
for i in range(n):
    li = list(map(int, input().split(' ')))
    left += li[i]
    right += li[len(li)-(i+1)]
print(abs(left-right))
