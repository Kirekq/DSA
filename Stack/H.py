from collections import deque
import sys

input_data = sys.stdin.read().split()
if input_data:
    n = int(input_data[0])

    left = deque()
    right = deque()
    out = []

    idx = 1
    for _ in range(n):
        cmd = input_data[idx]

        if cmd == '+':
            right.append(int(input_data[idx + 1]))
            idx += 2
        elif cmd == '*':
            right.appendleft(int(input_data[idx + 1]))
            idx += 2
        elif cmd == '-':
            out.append(left.popleft())
            idx += 1

        if len(right) > len(left):
            left.append(right.popleft())
        elif len(left) > len(right) + 1:
            right.appendleft(left.pop())

    print('\n'.join(map(str, out)))
