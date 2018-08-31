#include <iostream>
#include <vector>

using namespace std;
int main(int argc, char const *argv[]) {
    std::vector<int> alice;
    std::vector<int> bob;
    int input;
    for (size_t i = 0; i < 3; i++) {
        std::cin >> input;
        alice.push_back(input);
    }
    for (size_t i = 0; i < 3; i++) {
        std::cin >> input;
        bob.push_back(input);
    }
    std::vector<int> count_one;
    std::vector<int> count_minus_one;
    for (size_t i = 0; i < 3; i++) {
        if (alice[i] > bob[i]) count_one.push_back(1);
        if (alice[i] < bob[i]) count_minus_one.push_back(-1);
    }
    std::cout << count_one.size() << " " << count_minus_one.size() << '\n';
    return 0;
}
