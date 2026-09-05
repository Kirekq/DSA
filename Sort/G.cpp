#include <iostream>
#include <vector>

using namespace std;

void CountSort(vector<int>& arr) {
    int count[101] = {0};

    for (int num : arr) {
        count[num]++;
    }

    int index = 0;

    for (int num = 0; num <= 100; num++) {
        while (count[num] > 0) {
            arr[index] = num;
            index++;
            count[num]--;
        }
    }
}

int main() {
    vector<int> arr;
    int num;
    while (cin >> num) {
        arr.push_back(num);
    }

    CountSort(arr);

    for (size_t i = 0; i < arr.size(); i++) {
        if (i > 0) {
            cout << " ";
        }
        cout << arr[i];
    }
    cout << endl;

    return 0;
}
