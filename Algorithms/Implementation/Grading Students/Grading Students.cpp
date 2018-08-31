#include <iostream>
#include <cstdio>
using namespace std;

int main(int argc, char const *argv[]) {
    int tc, grade;
    std::cin >> tc;
    while (tc--) {
        std::cin >> grade;
        if (grade >= 38 && grade % 5 >= 3) printf("%d\n",(grade + (5 - (grade % 5))));
        else printf("%d\n",(grade));
    }
    return 0;
}
