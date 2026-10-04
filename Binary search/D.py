def function(x, a, b, c, d):
    return a * x ** 3 + b * x ** 2 + c * x + d

def root(a, b, c, d):
    left = -2000
    right = 2000

    for _ in range(100):
        mid = (left + right) / 2
        if function(mid, a, b, c, d) * function(left, a, b, c, d) > 0:
            left = mid
        else:
            right = mid
    return left


a, b, c, d = map(int, input().split())
x = root(a, b, c, d)
print(f'{x:.9f}')