#include <iostream>
#include <cstdio>
#include <cmath>
#include <vector>
using namespace std;

int main(int argc, char const *argv[]) {
    int n, t;
    double mean = 0;
    std::vector<int> v;
    std::cin >> n;
    for (size_t i = 0; i < n; i++) {
        std::cin >> t;
        mean += (double) t;
        v.push_back(t);
    }

    mean /= n;
    double sum = 0.0;
    for (size_t i = 0; i < n; i++)
        sum += pow(((double)v[i] - mean), 2);
    printf("%.1f\n",sqrt(sum/n));
    return 0;
}
