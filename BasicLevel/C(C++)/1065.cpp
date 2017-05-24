#include <iostream>
#include <vector>
#include <set>
#include <iomanip>
using namespace std;

int main() {

    int n, m, a, b;
    cin >> n;
    vector<int> couple(100000, -1);
    for (int i = 0; i < n; i++) {
        cin >> a >> b;
        couple[a] = b;
        couple[b] = a;
    }

    cin >> m;
    vector<int> guest(m), isExist(100000);
    for (int i = 0; i < m; i++) {
        cin >> guest[i];
        if (couple[guest[i]] != -1) {
            isExist[couple[guest[i]]] = 1;
        }
    }

    set<int> set;
    for (int i = 0; i < m; i++) {
        if (!isExist[guest[i]])
            set.insert(guest[i]);
    }

    cout << set.size() << endl;
    for (auto it = set.begin(); it != set.end(); it++) {
        if (it != set.begin()) {
            cout << " ";
        }
        // printf("%05d", *it);
        cout << setw(5) << setfill('0') << *it;
    }
    return 0;
}


