#include <iostream>
#include <algorithm>
using namespace std;

struct yueBing {
    float unitPrice;   // 单价
    float inventory;   // 库存量
    float totalPrice;  // 总售价
};

bool compare(yueBing a, yueBing b) {
    return a.unitPrice > b.unitPrice;
}

int main() {
    int n, d;
    cin >> n >> d;

    yueBing *yueBing1 = new yueBing[n];
    for (int i = 0; i < n; i++) {
        cin >> yueBing1[i].inventory;
    }
    for (int i = 0; i < n; i++) {
        cin >> yueBing1[i].totalPrice;
        yueBing1[i].unitPrice = yueBing1[i].totalPrice / yueBing1[i].inventory;
    }
    sort(yueBing1, yueBing1 + n, compare);

    float sum = 0;
    for (int i = 0; i < n; i++) {
        if (d - yueBing1[i].inventory >= 0) {
            sum += yueBing1[i].totalPrice;
            d -= yueBing1[i].inventory;
        } else {
            sum += yueBing1[i].unitPrice * d;
            break;
        }
    }
    printf("%.2f", sum);
}



