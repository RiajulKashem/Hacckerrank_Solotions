#include <iostream>

int main(int argc, char const *argv[]) {
    int x1, x2, v1, v2;
    std::cin >> x1 >> v1 >> x2 >> v2;
    if (v1 > v2 && (x2-x1)%(v1-v2) == 0)
    std::cout << "YES" << '\n';
    else std::cout << "NO" << '\n';
    return 0;
}
