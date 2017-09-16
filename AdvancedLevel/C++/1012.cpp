#include<iostream>
#include<string>
#include<algorithm>
#include<queue>
#include<vector>
#include<unordered_map>
using namespace std;

struct student {
    string id;
    int c;
    int m;
    int e;
    int a;
    char sub;
    int best;
};

void getBest(vector<student>& map) {

    char ans[4] = {'A','C','M','E'};
    int len = map.size();

    for (int i = 0; i < len; i++) {
        int count[4] = {1,1,1,1};

        for (int j = 0; j < len; j++) {
            if (map[j].a > map[i].a) {
                count[0]++;
            }
            if (map[j].c > map[i].c) {
                count[1]++;
            }
            if (map[j].m > map[i].m) {
                count[2]++;
            }
            if (map[j].e > map[i].e) {
                count[3]++;
            }
        }

        for (int k = 0; k < 4; k++) {
            int u = k + 1;

            for (; u < 4; u++) {
                if (count[k] > count[u]) {
                    break;
                }
            }

            if (u >= 4) {
                map[i].sub = ans[k];
                map[i].best = count[k];
                break;
            }
        }
    }
}

int main() {
    int N, M, n;
    cin >> N >> M;
    n = N;
    vector<student> map;
    while (N--) {
        student s;
        cin >> s.id >> s.c >> s.m >> s.e;
        s.a = (s.c + s.m + s.e) / 3;
        map.push_back(s);
    }
    getBest(map);

    string tempId;
    while (M--) {
        cin >> tempId;
        int i = 0;
        for (; i < n; i++) {
            if (map[i].id == tempId) {
                cout << map[i].best << " " << map[i].sub << endl;
                break;
            }
        }
        if (i >= n)
            cout << "N/A" << endl;
    }
    return 0;
}
