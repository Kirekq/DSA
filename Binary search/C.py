import math
def root(c):
    left = 0.0
    right = c
    for _ in range(1000):
        mid = (left + right) / 2
        ans = mid ** 2 + math.sqrt(mid)
        if ans < c:
            left = mid
        else:
            right = mid
    return left

c = float(input())
x = root(c)
print(x)