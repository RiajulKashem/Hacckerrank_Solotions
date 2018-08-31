s, t = map(int, input().split())
a, b = map(int, input().split())
m, n = map(int, input().split())
apple = [int(x) for x in input().split()]
orange = [int(x) for x in input().split()]
print(sum([1 for x in apple if (x+a) >= t and (x+a) <= s]))
print(sum([1 for x in orange if (x+b) >= t and (x+b) <= s]))
