#include <iostream>
#include <algorithm>

using namespace std;

bool check(long long t, long long n, long long x, long long y) {
    return (t / x) + (t / y) >= n - 1;
}

int main() {
    long long n, x, y;
    if (!(cin >> n >> x >> y)) return 0;

    long long l = 0, r = (n - 1) * min(x, y), ans = 0;

    while (l <= r) {
        long long m = (l + r) / 2;
        if (check(m, n, x, y)) {
            ans = m;
            r = m - 1;
        } else {
            l = m + 1;
        }
    }

    cout << min(x, y) + ans << "\n";
    return 0;
}
