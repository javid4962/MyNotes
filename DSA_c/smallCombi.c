#include<stdio.h>

void main(){
    int n, zc=0, dig, i;
    scanf("Enter a number : %d",&n);
    int temp = n;

    while(n){
        dig = n % 10;
        if(dig == 0){
            zc=zc+1;
        }
        n = n / 10;
    }
    printf("%d",zc);

}
