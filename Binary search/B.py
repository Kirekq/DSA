def binary_search(arr1, arr2, n, k):
    for i in range(k):
        target = arr2[i]
        left = 0
        right = n - 1
        diff_best = float("inf")
        answer = float("inf")

        while left <= right:
            middle = (left + right) // 2
            current_val = arr1[middle]
            diff = abs(current_val - target)
            if diff < diff_best:
                diff_best = diff
                answer = current_val
            elif diff == diff_best and current_val < answer:
                answer = current_val
            if current_val > target:
                right = middle - 1
            elif current_val < target:
                left = middle + 1
            else:
                break

        print(answer)


n, k = map(int, input().split())
arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))
binary_search(arr1, arr2, n, k)