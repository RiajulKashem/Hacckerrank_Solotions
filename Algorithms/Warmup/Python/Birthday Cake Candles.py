n = int(input())
lst = list(map(int, input().split(' ')))
lst = sorted(lst)
# print(lst, lst[n-1])
counter = 0
for i in range(n):
    if lst[i] == lst[n-1]:
        counter += 1
print(counter)
