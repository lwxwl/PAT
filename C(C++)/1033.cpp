#include <iostream>
#include <string>
#include <set>
using namespace std;

int main() {
	string useless, input;
    getline(cin, useless);
	getline(cin, input);
    bool shift = false;
	set<char> set;
	for (int i = 0; i < useless.length(); i++) {
		char c = useless[i];
		if (c == '+') {
			shift = true;
		}
		set.insert(c);
		set.insert(tolower(c));
	}

	if (shift) {
        for (int i = 0; i < input.length(); i++) {
            char c = input[i];
            if (!isupper(c)) {
                if (set.count(c) == 0) {
                    cout << c;
                }
            }
        }
	} else {
        for (int i = 0; i < input.length(); i++) {
            char c = input[i];
            if (set.count(c) == 0) {
                cout << c;
            }
        }
	}
    return 0;
}
