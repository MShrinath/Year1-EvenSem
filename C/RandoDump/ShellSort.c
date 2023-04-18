#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }

    for(int gap=n/2;gap>0;gap/=2){
        for(int i=gap;i<n;i++){
            for(int j=i;j>=gap;j-=gap){
                if(a[j]<a[j-gap]){
                    int t=a[j];
                    a[j]=a[j-gap];
                    a[j-gap]=t;
                }
            }
        }
    }

    printf("Sorted\n");
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
}