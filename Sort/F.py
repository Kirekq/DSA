def quicksort(arr, n):
    if n <= 1:
        return arr
    pivot = arr[n // 2]

    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]

    return quicksort(left, len(left)) + middle + quicksort(right, len(right))

n = int(input())
arr = list(map(int, input().split()))
arr = quicksort(arr, n)
print(*arr)
