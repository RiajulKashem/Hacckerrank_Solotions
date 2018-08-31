#include <iostream>
#include <vector>
#include <algorithm>
#include <cstdio>
using namespace std;

double median(std::vector<int> v){
    int l = v.size();
    if (!(l & 1)){
        return (double)(v[l/2] + v[(l/2)-1])/2;
    }
    return (double) v[l/2];
}
int main(int argc, char const *argv[]) {
    int numlen, index;
    // Input array size
    std::cin >> numlen;
    // Input data and save
    int elements[numlen];
    int frequency[numlen];

    for (size_t i = 0; i < numlen; i++) {
        std::cin >> elements[i];
    }
    for (size_t i = 0; i < numlen; i++) {
        std::cin >> frequency[i];
    }

    // Formating data with frequency
    std::vector<int> v;

    for (size_t i = 0; i < numlen; i++) {
        index = frequency[i];
        for (size_t j = 0; j < index; j++) {
            v.push_back(elements[i]);
        }
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

    double result = median(high) - median(low);
    printf("%.1f\n",result);
    return 0;
}
