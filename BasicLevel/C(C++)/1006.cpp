#include <iostream>
using namespace std;

int main(){
    int n;
    cin >> n;
    int i = 0;
    int m[3] = {0};
    while(n != 0){
        m[i++] = n % 10;
        n = n / 10;
    }
    for(int j = 0; j < m[2]; j++) {
        cout << "B";
    }
    for(int j = 0; j < m[1]; j++) {
        cout << "S";
    }
    for(int j = 0; j < m[0]; j++) {
        cout << j + 1;
    }
    return 0;

}

