#include <bits/stdc++.h>
#include <vector>
int main(int argc, char const *argv[]) {
    int input_number, input;
    int hight = -1;
    std::cin >> input_number;
    std::vector<int> v;
    for (size_t i = 0; i < input_number; i++) {
        std::cin >> input;
        if ( input >= hight)v.push_back(hight = input);
    }

    int counter = 0;

    for (size_t i = 0; i < v.size(); i++) {
        if(v[i] == hight)counter++;
    }
    std::cout << counter << '\n';
    return 0;
}
