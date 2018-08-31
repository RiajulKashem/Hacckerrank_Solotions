#include <iostream>
#include <vector>
using namespace std;

int main(int argc, char const *argv[]) {
    int s, d, i, c = 0;
    cin >> s >> d;
    vector<int> v(s);
    while (s--)std::cin >> v.push_back((cin >> i));
    for (size_t i = 0; i < s; i++) {
        for (size_t j = 0; j < s; j++) {
            if (v[i] + v[j] == d) c++;
        }
    }
    cout << c << '\n';
    return 0;
}
