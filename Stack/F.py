from collections import deque
import sys

input_data = sys.stdin.read().split()
n, k = int(input_data[0]), int(input_data[1])
arr = [int(x) for x in input_data[2 : 2 + n]]

dq = deque()
result = []

for i in range(n):
    while dq and arr[dq[-1]] >= arr[i]:
        dq.pop()
    dq.append(i)
    if dq[0] < i - k + 1:
        dq.popleft()

    if i >= k - 1:
        result.append(str(arr[dq[0]]))

print('\n'.join(result))

