def binary_search(arr1, arr2, n, k):
    for i in range(k):
        left = 0
        right = n - 1
        while left <= right:
            middle = (left + right) // 2
            if arr1[middle] > arr2[i]:
                right = middle - 1
            elif arr1[middle] < arr2[i]:
                left = middle + 1
            else:
                print("YES")
                break
        else:
            print("NO")

n, k = map(int, input().split())
arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))
binary_search(arr1, arr2, n, k)