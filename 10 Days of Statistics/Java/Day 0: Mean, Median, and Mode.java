#include <iostream>
#include <vector>
#include <algorithm>
#include <cstdio>

// Mean
double getMean(std::vector<int> array){
    double mean = 0.0;
    for (size_t i = 0; i < array.size(); i++)
        mean += (double) array[i];
    return (double) mean / array.size();
}

double getMedian(std::vector<int> array, int len){
    double median = array[len/2];
    if (!(len & 1))
        median = ((double)array[(len/2)-1] + (double) array[len/2]) / 2;
    return median;
}

int getMode(std::vector<int> array, int len){
    int max = 0,mode = 0, counter = 0, current = array[0];
    for (size_t i = 0; i < len; i++) {
        if (array[i] == current) counter++;
        else{
            current = array[i];
            counter = 1;
        }
        if (counter > max) {
            mode = array[i];
            max = counter;
        }
    }
    return mode;
}

int main(int argc, char const *argv[]) {
    int arraySize;
    std::cin >> arraySize;
    std::vector<int> array(arraySize);
    for (size_t i = 0; i < arraySize; i++) {
        std::cin >> array[i];
    }
    std::sort(begin(array), end(array));
    printf("%.1f\n",getMean(array));
    printf("%.1f\n",getMedian(array, arraySize));
    printf("%d\n",getMode(array, arraySize));
    return 0;
}
