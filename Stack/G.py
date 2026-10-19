n = int(input())
wagons = list(map(int, input().split()))

dead_end = []
expected = 1

for wagon in wagons:
    dead_end.append(wagon)

    while dead_end and dead_end[-1] == expected:
        dead_end.pop()
        expected += 1

if not dead_end:
    print("YES")
else:
    print("NO")
