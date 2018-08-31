#include <iostream>
#include <cstdio>

int main(int argc, char const *argv[]) {
    int size;
    std::cin >> size;
    int num[size], wight[size];
    for (size_t i = 0; i < size; i++) {
        std::cin >> num[i];
    }

    double wsum = 0.0;
    for (size_t i = 0; i < size; i++) {
        std::cin >> wight[i];
        wsum += wight[i];
    }

    double nsum = 0.0;
    for (size_t i = 0; i < size; i++) {
        nsum += num[i] * wight[i];
    }
    printf("%.1f\n",(double) nsum/wsum);

    return 0;
}
