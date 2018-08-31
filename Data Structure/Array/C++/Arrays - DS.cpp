#include <iostream>
#include <vector>
#include <algorithm>
int main(int argc, char const *argv[]) {
    int n;
    std::cin >> n;
    std::vector<int> a[n];
    for (size_t i = 0; i < n; i++)
        std::cin >> a[i];
    std::reverse(a.begin(), a.end());
    for (size_t i = 0; i < n-1; i++)
        std::cout << a[i] << " ";
    std::cout << a[n-1] << '\n';
    return 0;
}
