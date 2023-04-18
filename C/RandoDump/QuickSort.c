#include <stdio.h>
void qsort(int a[],int f,int l){
    if(f<l){
        int i,j,temp,piv;
        i=piv=f;
        j=l;
        while(i<j){
            while(a[i]<=a[piv])
                i++;
            while(a[j]>a[piv])
                j--;
            if(i<j){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        temp=a[j];
        a[j]=a[piv];
        a[piv]=temp;

        qsort(a,f,j-1);
        qsort(a,j+1,l);
    }
}
int main(){
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }

    qsort(a,0,n-1);

    printf("Sorted\n");
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
}