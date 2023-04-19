#include <stdio.h>
#define size 100
int front = -1, rear = -1;
int queue[size];
void insertFront(int x){
    if(front == -1 && rear == -1){
        front = rear = 0;
        queue[front] = x;
    }
    else if((rear +1) %size == front )
        printf("Queue is full");
    
    else if(front == 0){
        front = size-1;
        queue[front] = x;
    }
    else{
        front--;
        queue[front] = x;
    }
}

void insertRear(int x){
    if(front == -1 && rear == -1){
        front = rear = 0;
        queue[rear] = x;
    }
    else if((rear +1) %size == front )
        printf("Queue is full");
    
    else if(rear == size-1){
        rear = 0;
        queue[rear] = x;
    }
    else{
        rear++;
        queue[rear] = x;
    }
}

void deleteFront(){
    if(front == -1 && rear == -1)
        printf("Queue is empty");
    else if(front == rear)
        front = rear = -1;
    else if(front == size-1)
        front = 0;
    else
        front++;
}

void deleteRear(){
    if(front == -1 && rear == -1)
        printf("Queue is empty");
    else if(front == rear)
        front = rear = -1;
    else if(rear == 0)
        rear = size-1;
    else
        rear--;
}

void display(){
    if(front == -1 && rear == -1)
        printf("Queue is empty");
    else{
        int i = front;
        while(i != rear){
            printf("%d ", queue[i]);
            i = (i+1)%size;
        }
        printf("%d", queue[rear]);
    } 
    printf("\n");
}  

int main(){
    while(1){
        int ch;
        printf("1.Insert Front\n2.Insert Rear\n3.Delete Front\n4.Delete Rear\n5.Display\n6.Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: printf("Enter the element to be inserted: ");
                    int x;
                    scanf("%d", &x);
                    insertFront(x);
                    break;
            case 2: printf("Enter the element to be inserted: ");
                    int x;
                    scanf("%d", &x);
                    insertRear(x);
                    break;
            case 3: deleteFront();
                    break;
            case 4: deleteRear();
                    break;
            case 5: display();
                    break;
            case 6: return 0;
            default: printf("Invalid choice");
        }
    }
}