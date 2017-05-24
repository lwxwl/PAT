#include <iostream>
#include <string>
using namespace std;

int main() {
    int array[6] = {0};
    string str;
    cin >> str;
    for (int i = 0; i < str.size(); i++) {
        switch (str[i]) {
            case 'P':
                array[0]++;
                break;
            case 'A':
                array[1]++;
                break;
            case 'T':
                array[2]++;
                break;
            case 'e':
                array[3]++;
                break;
            case 's':
                array[4]++;
                break;
            case 't':
                array[5]++;
                break;
            default:
                break;
        }
    }
    while (array[0] + array[1] + array[2] + array[3] + array[4] + array[5] != 0) {
        if (array[0] != 0) {
            cout << 'P';
            array[0]--;
        }
        if (array[1] != 0) {
            cout << 'A';
            array[1]--;
        }
        if (array[2] != 0) {
            cout << 'T';
            array[2]--;
        }
        if (array[3] != 0) {
            cout << 'e';
            array[3]--;
        }
        if (array[4] != 0) {
            cout << 's';
            array[4]--;
        }
        if (array[5] != 0) {
            cout << 't';
            array[5]--;
        }
    }
    return 0;
}


