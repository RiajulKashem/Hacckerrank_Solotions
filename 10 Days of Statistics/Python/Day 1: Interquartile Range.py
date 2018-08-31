def median(nums):
    if len(nums)%2 == 0:
        return float(sum(nums[len(nums)//2-1:len(nums)//2+1])/2)
    else:
        return float(nums[len(nums)//2])

def quartiles(N,nums):
    Q1 = float(median(nums[:len(nums)//2]))
    if N%2 == 0:
        Q3 = float(median(nums[len(nums)//2:]))
    else:
        Q3 = float(median(nums[len(nums)//2+1:]))
    return Q1,Q3

N = int(input())
elements = [int(num) for num in input().split()]
frequency = [int(num) for num in input().split()]
data = []

for i in range(N):
    t = frequency[i]
    for j in range(t):
        data.append(elements[i])

data = sorted(data)
q1, q2 = quartiles(N, data)
print("%.1f",float(q2 - q1))
