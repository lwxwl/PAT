#include <iostream>
#include <map>
#include <cstring>
using namespace std;

int m, n, s;
string name[1001];
map<string, int> count;

int main() {
    cin >> m >> n >> s;

    for (int i = 0; i < m; i++) {
        cin >> name[i];
        count[name[i]] = 0;
    }

    int flag = 1;
    for (int i = s - 1; i < m; ) {
        if (count[name[i]] == 0) {
            flag = 0;
            cout << name[i] <<endl;
            count[name[i]] = 1;
            i += n;
        } else {
            i += 1;
        }
    }

    if(flag){
        cout << "Keep going...";
    }
    return 0;
}