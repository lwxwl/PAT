#include <iostream>
using namespace std;

int city[500][500], teams[500], isVisited[500], routes, max_team, min_len = 10000;

void method(int dep, int des, int len, int team, int n) {
    if (dep == des) {
        if (min_len > len) {
            min_len = len;
            max_team = team;
            routes = 1;
        } else if (min_len == len) {
            routes += 1;
            max_team = (max_team > team ? max_team : team);
        }
        return;
    }

    for (int i = 0; i < n; i++) {
        if (!isVisited[i] && city[dep][i] != 0) {
            isVisited[i] = 1;
            method(i, des, len + city[dep][i], team + teams[i], n);
            isVisited[i] = 0;
        }
    }
}

int main() {
    int n, m, c1, c2;
    cin >> n >> m >> c1 >> c2;

    for (int i = 0; i < n; i++) {
        cin >> teams[i];
    }

    for (int i = 0; i < m; i++) {
        int a, b, l;
        cin >> a >> b >> l;
        city[a][b] = city[b][a] = l;
    }

    isVisited[c1] = 1;
    method(c1, c2, 0, teams[c1], n);
    cout << routes << " " << max_team;

}

