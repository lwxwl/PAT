#include <stdio.h>
#include <iostream>
#include <vector>
#include <algorithm>
#include <iterator>
#include <utility>
using namespace std;

typedef pair<int, int> P;

vector<P> coll(100000);

struct node{
    int address;
    int data;
    int next;
    node(int a, int b, int c): address(a), data(b), next(c) {};
};

vector<node> vec;

int main() {
    
    int address, data, next;
    int n, k, first;
    cin >> first >> n >> k;
    int num = n;
    
    while(n--) {
        cin >> address >> data >> next;
        P p;
        p.first = data;
        p.second = next;
        coll[address] = p;
    }
    
    int index = first;
    int cnt = 0;
    
    while(index != -1){
        cnt++;
        vec.push_back(node(index, coll[index].first, coll[index].second));
        index = coll[index].second;
    }
    
    int t = cnt / k;
    for (int i = 0; i < t; i++) std::reverse(vec.begin() + i * k, vec.begin() + (i+1) * k);
    for (int i = 0; i < vec.size() - 1; i++) {
        printf("%05d %d %05d\n", vec[i].address, vec[i].data, vec[i+1].address);
    }
    printf("%05d %d %d\n", vec[vec.size()-1].address, vec[vec.size()-1].data, -1);
    return 0;
}
