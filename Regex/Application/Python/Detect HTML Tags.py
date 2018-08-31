a, n = map(int, input().split(' '))
l = list(map(int, input().split(' ')))
for i in l[n:]:
    print(i, end=' ')
for i in l[:n]:
    print(i, end=' ')