import sys


def is_correct_bracket_sequence(s):
    stack = []
    mapping = {')': '(', ']': '[', '}': '{'}

    for char in s:
        if char in '([{':
            stack.append(char)
        elif char in ')]}':
            if not stack or stack[-1] != mapping[char]:
                return False
            stack.pop()

    return len(stack) == 0


def main():
    s = sys.stdin.read().strip()

    if is_correct_bracket_sequence(s):
        print('yes')
    else:
        print('no')


if __name__ == '__main__':
    main()
