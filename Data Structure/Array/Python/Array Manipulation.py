n, m = map(int, input().split())
a = [0]*(n+1)
for _ in range(m):
    start, end, value = map(int, input().split())
    a[start-1] += value
    a[end] -= value
max = x = 0
for i in a:
    x += i
    if x > max:
        max = x
print(max)
