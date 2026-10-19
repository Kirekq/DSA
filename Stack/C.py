import sys


def evaluate_postfix(expression):
    stack = []
    tokens = expression.strip().split()

    for token in tokens:
        if token in ('+', '-', '*'):
            b = stack.pop()
            a = stack.pop()

            if token == '+':
                stack.append(a + b)
            elif token == '-':
                stack.append(a - b)
            elif token == '*':
                stack.append(a * b)
        else:
            stack.append(int(token))
    return stack[0]


def main():
    expression = sys.stdin.read()
    if expression.strip():
        print(evaluate_postfix(expression))


if __name__ == '__main__':
    main()

