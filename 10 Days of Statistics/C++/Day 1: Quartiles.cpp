#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int median(std::vector<int> v){
    int l = v.size();
    if (!(l & 1)){
        return (v[l/2] + v[(l/2)-1])/2;
    }
    return v[l/2];
}
int main(int argc, char const *argv[]) {
    int numlen, input;
    std::cin >> numlen;
    std::vector<int> v;
    while (numlen--){
        std::cin >> input;
        v.push_back(input);
    }
    sort(begin(v), end(v));

    std::vector<int> low;
    std::vector<int> high;
    for (int i = 0; i < v.size()/2; i++)low.push_back(v[i]);
    if (v.size()&1){
        for (int j = (v.size()/2)+1; j < v.size(); j++){
            high.push_back(v[j]);
        }
    }else{
        for (int i = v.size()/2; i < v.size(); i++){
            high.push_back(v[i]);
        }
    }
    std::cout << median(low) << '\n';
    std::cout << median(v) << '\n';
    std::cout << median(high) << '\n';
    return 0;
}
