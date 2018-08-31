a = [int(x) for x in input().strip().split(' ')]
b = [int(x) for x in input().strip().split(' ')]

# 1 is a point for Alice, -1 a point for Bob
score = [1 if x > y else 0 if x == y else -1 for x, y in zip(a, b)]

print (score.count(1), score.count(-1)) 
