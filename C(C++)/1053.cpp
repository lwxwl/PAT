#include <iostream>
using namespace std;

int main() {

    int n = 0, d = 0, may = 0, must = 0;
    double e = 0;
    cin >> n >> e >> d;

    for (int i = 0; i < n; i++) {
        int k = 0, count = 0;
        cin >> k;
        for (int j = 0; j < k; j++) {
            double ei = 0;
            cin >> ei;
            if (ei < e) {
                count++;
            }
        }
        if (k / 2 < count) {
            if (k > d) {
                must++;
            } else {
                may++;
            }
        }
    }
    printf("%.1f%% %.1f%%", may * 1.0 / n * 100, must * 1.0 / n * 100);
    return 0;
}
