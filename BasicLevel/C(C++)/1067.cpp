#include <iostream>
#include <string>
using namespace std;

int main() {
    string password;
    int n;
    cin >> password >> n;
    getchar();

    while (true) {
        string temp;
        getline(cin, temp);
        if (temp == "#") {
            break;
        }
        if (temp == password) {
            cout << "Welcome in" << endl;
            break;
        } else {
            cout << "Wrong password: " << temp << endl;
            n--;
            if (n == 0) {
                cout << "Account locked" << endl;
                break;
            }
        }
    }
    return 0;
}

