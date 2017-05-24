#include <iostream>
#include <cstring>

typedef struct {
    int score;       // 题目的满分值
    int correct;     // 正确选项个数
    char choices[5]; // 所有正确选项
}question;

int main() {
    char c, answer[250];
    int n, m, num, score, max = 0, wrong = 0;
    int wrongList[101] = {0};
    scanf("%d %d", &n, &m);
    question questionList[m];
    memset(questionList, 0, sizeof(question) * m);

    // 题目的正确答案
    for (int i = 0; i < m; i++) {
        scanf("%d %*d %d %[^\n]", &questionList[i].score, &questionList[i].correct, answer);
        for (int j = 0; answer[j] != 0 ; j++) {
            if ('a' <= answer[j] && answer[j] <= 'e') {
                // 在正确选项上标记1
                questionList[i].choices[answer[j] - 'a'] = 1;
            }
        }
    }
    // 读取学生的答案，并判断对错
    for (int i = 0; i < n; i++) {
        score = 0;
        for (int j = 0; j < m; j++, wrong = 0, num = 0) {
            while ((c = getchar()) != '(');  // 去掉'('
            scanf("%d %[^)]", &num, answer);
            // 选项数量与正确答案不同，则一定错误
            if (num != questionList[j].correct) {
                wrong = 1;
            } else {
                for (int k = 0; answer[k] != 0 ; k++) {
                    if (answer[k] >= 'a' && answer[k] <= 'e') {
                        if ((wrong = !questionList[j].choices[answer[k] - 'a'])) {
                            break;
                        }
                    }
                }
            }
            if(wrong) {
                wrongList[j] += 1;
            } else {
                score += questionList[j].score;
            }
        }
        printf("%d\n", score);
    }
    for (int i = 0; i < m; i++) {
        if (wrongList[i] > max) {
            max = wrongList[i];
        }
    }
    if (max != 0) {
        printf("%d", max);
        for (int i = 0; i < m; i++) {
            if (wrongList[i] == max) {
                printf(" %d", i + 1);
            }
        }
    } else {
        printf("Too simple");
    }
    return 0;
}
