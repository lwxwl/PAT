#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> origin(n), target(n);
    for(int i = 0; i < n; ++i){
        cin >> origin[i];
    }
    for(int i = 0; i < n; ++i){
        cin >> target[i];
    }
    int index = -1;
    for(int i = 1; i < n; ++i){
        if(target[i] < target[i - 1]){
            index = i;
            break;
        }
    }
    int flag = 0;
    for(int i = index; i < n; ++i){
        if(target[i] != origin[i]){
            flag = 1;
            break;
        }
    }
    if(flag == 0){
        cout << "Insertion Sort" << endl;
        sort(target.begin(), target.begin() + index + 1);
        cout << target[0];
        for(int i = 1; i < n; ++i){
            cout << " " << target[i];
        }
    } else if(flag == 1){
        cout << "Merge Sort" << endl;
        int k = 1;
        bool isEqual = false;
        while(!isEqual){
            isEqual = true;
            if(!equal(origin.begin(), origin.end(), target.begin())){
                isEqual = false;
            }
            k *= 2;
            for(int i = 0; i < n / k; ++i){
                sort(origin.begin() + i * k, origin.begin() + (i + 1) * k);
            }
            sort(origin.begin() + k * (n / k), origin.end());
        }
        cout << origin[0];
        for(int i = 1; i < n; ++i){
            cout << " " << origin[i];
        }
    }
    cout << endl;
    return 0;
}
