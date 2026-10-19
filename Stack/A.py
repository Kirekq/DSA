import sys

def main():
    stack = []
    for line in sys.stdin:
        parts = line.strip().split()
        if not parts:
            continue
        command = parts[0]

        if command == 'push':
            stack.append(parts[1])
            print('ok')

        elif command == 'pop':
            if len(stack) > 0:
                print(stack.pop())
            else:
                print('error')

        elif command == 'back':
            if len(stack) > 0:
                print(stack[-1])
            else:
                print('error')

        elif command == 'size':
            print(len(stack))

        elif command == 'clear':
            stack.clear()
            print('ok')

        elif command == 'exit':
            print('bye')
            break


if __name__ == '__main__':
    main()
