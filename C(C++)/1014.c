#include <stdio.h>

int main() {
    char week1[61], week2[61], time1[61], time2[61];
    int i, pos, h;
    char w2, w1, t;
    char *week[7] = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    scanf("%s%s%s%s", week1, week2, time1, time2);

    for (i = 0; week1[i] != '\0'; i++) {
        w1 = week1[i];
        if (w1 >= 65 && w1 <= 71) {
            if (w1 == week2[i])
                break;
        }
    }

    for (i = i + 1; week1[i] != '\0'; i++) {
        w2 = week1[i];
        if (w2 - 'A' >= 0 && w2 - 'N' <= 0 || w2 - '0' >= 0 && w2 - '9' <= 0) {
            if (w2 == week2[i])
                break;
        }
    }

    for (i = 0; time1[i] != '\0'; i++) {
        t = time1[i];
        if (t - 'A' >= 0 && t - 'Z' <= 0 || t - 'a' >= 0 && t - 'z' <= 0) {
            if (t == time2[i]) {
                pos = i;
                break;
            }
        }
    }

    h = w2 - 'A';
    if (h >= 0)
        h += 10;
    else
        h = w2 - '0';

    char *week_result = week[w1 - 'A'];

    printf("%s %02d:%02d\n", week_result, h, pos);
    return 0;
}

