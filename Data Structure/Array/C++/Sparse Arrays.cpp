#include<iostream>
#include<vector>
#include<string>
using namespace std;

int main(){
    int sn, qn, counter;
    std::string s;
    std::cin >> sn;
    std::vector<std::string> str;

    for (size_t i = 0; i < sn; i++){
        std::cin >> s;
        str.push_back(s);
    }

    std::cin >> qn;
    for (size_t i = 0; i < qn; i++) {
        std::cin >> s;
        counter = 0;
        for(std::string n: str){
            if (n == s) counter++;
        }
        std::cout << counter << '\n';
    }
}
