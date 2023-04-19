#include <stdio.h>
#define size 10

int a[size];

void insert(int v){
    
    for(int i=0;i<size;i++){
        int ind = ((v % size) + (i*i)) % size;
        if(a[ind] == -1){
            a[ind] = v;
            return;
        }
    }
}

void display(){
    for(int i=0;i<size;i++)
        printf("%d\n",a[i]);
    printf("\n");
}

int main(){
    for(int i=0;i<size;i++)
        a[i] = -1;
    while(1){
        printf("1.Insert\n2.Display\n3.Exit\n");
        printf("Enter your choice: ");
        int ch;
        scanf("%d",&ch);
        switch(ch){
            case 1: printf("Enter the value: ");
                    int v;
                    scanf("%d",&v);
                    insert(v);
                    break;
            case 2: display();
                    break;
            case 3: 
                return 0;
        }
    }
}