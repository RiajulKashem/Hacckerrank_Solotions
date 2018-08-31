#include <iostream>
#include <cstdio>
#include <string>

int main(int argc, char const *argv[]) {
    int n;
    std::string s = "#";
    std::string space = "";
    std::cin >> n;
    for (size_t i = 0; i < n; i++) {
        for (size_t j = n-(i+1); j > 0; j--) {
            space += " ";
        }
        std::cout << space << s << '\n';
        s += "#";
        space = "";
    }

    return 0;
}
