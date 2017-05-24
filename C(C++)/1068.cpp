#include <cstdio>
#include <iostream>
#include <map>
#include <cmath>
using namespace std;

map<int, int> location;
int s[1001][1001];
int n, m ,tol;
int dir[8][2] = {1,0, -1,0, 0,1, 0,-1, 1,1, 1,-1, -1,1, -1,-1};

bool limit(int x, int y) {
    for (int i = 0; i < 8; i++) {
        int xx = x + dir[i][0];
        int yy = y + dir[i][1];
        if(xx >= 0 && xx < n && yy < m && yy >= 0 && abs(s[xx][yy] - s[x][y]) <= tol ) {
            return false;
        }
    }
    return true;
}

int main() {
    cin >> m >> n >> tol;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> s[i][j];
            location[s[i][j]]++;
        }
    }

    int count = 0;
    int x, y;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (location[s[i][j]] == 1 && limit(i, j)) {
                count++;
                x = i;
                y = j;
            }
        }
    }

    if (count == 1) {
        printf("(%d, %d): %d\n", y + 1, x + 1, s[x][y]);
    } else if (count > 1) {
        printf("Not Unique");
    } else {
        printf("Not Exist");
    }
    return 0;
}
