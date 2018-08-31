#include <iostream>
using namespace std;

int main() {
    int s,t,a,b,m,n, fruit, counter = 0;
    cin >> s >> t >> a >> b >> m >> n;
    while (m--) {
        cin >> fruit;
        if(fruit+a >= s && fruit+a <= t)counter++;
    }
    cout << counter << '\n';
    counter = 0;
    while (n--) {
        cin >> fruit;
        if(fruit+b >= s && fruit+b <= t)counter++;
    }
    cout << counter << '\n';
    return 0;
}
