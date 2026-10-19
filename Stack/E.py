import sys
from collections import deque


def main():
    deq = deque()

    for line in sys.stdin:
        parts = line.strip().split()
        if not parts:
            continue

        command = parts[0]

        if command == 'push_front':
            num = parts[1]
            deq.appendleft(num)
            print('ok')

        elif command == 'push_back':
            num = parts[1]
            deq.append(num)
            print('ok')

        elif command == 'pop_front':
            if len(deq) > 0:
                print(deq.popleft())
            else:
                print('error')

        elif command == 'pop_back':
            if len(deq) > 0:
                print(deq.pop())
            else:
                print('error')

        elif command == 'front':
            if len(deq) > 0:
                print(deq[0])
            else:
                print('error')

        elif command == 'back':
            if len(deq) > 0:
                print(deq[-1])
            else:
                print('error')

        elif command == 'size':
            print(len(deq))

        elif command == 'clear':
            deq.clear()
            print('ok')

        elif command == 'exit':
            print('bye')
            break


if __name__ == '__main__':
    main()
