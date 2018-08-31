import math
n = int(input())
num = [float(i) for i in input().split()]
mean = sum(num)/n
distanceSum = 0
for i in range(n):
    distanceSum += math.pow((abs(num[i] - mean)), 2)

print("%.1f"%(math.sqrt(distanceSum/n)))
