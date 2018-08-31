#include<cstdio>

using namespace std;
int main(){
    int ar_size, i, sum = 0;
    scanf("%d",&ar_size);

    int arr[ar_size];

    for (i = 0; i < ar_size; i++){
        scanf("%d",&arr[i]);
        sum += arr[i];
    }

    printf("%d\n",sum);

    return 0;
}
