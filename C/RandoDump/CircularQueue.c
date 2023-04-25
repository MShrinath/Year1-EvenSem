#include <stdio.h>
#define size 3
int q[size],front=-1,rear=-1;

void enqueue(){
    if((rear +1) %size == front ){
        printf("FULL");
    }
    else if(front== -1 && rear== -1){
        int data;
        scanf("%d",&data);
        front=rear=0;
        q[rear]=data;
    }
    else{
        int data;
        scanf("%d",&data);
        rear=(rear+1) %size;
        q[rear]=data;
    }
}

void dequeue(){
    if(front==-1){
        printf("EMPTY");
    }
    else if(front == rear){
        front=rear=-1;
    }
    else{
        front=(front+1) % size;
    }
}

void display(){
    if(rear==-1)
        printf("EMPTY");
    else{
        for(int i=front+1;i<=rear;i=i+1 % size)
            printf("%d ",q[i]);
        printf("\n");
    }
}

int main(){
    while(1){    
        printf("1.Enqueue\n2.Dequeue\n3.Display\n4.Exit\n");
        int ch;
        scanf("%d",&ch);
        switch(ch){
            case 1: enqueue();
                break;
            case 2: dequeue();
                break;
            case 3: display();
                break;
            default:
                return 0;
        }
    }
}
