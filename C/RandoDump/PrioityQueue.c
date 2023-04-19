#include <stdio.h>
#include<stdlib.h>
struct node{
    int priority;
    int info;
    struct node *next;
};
struct node *front=NULL,*newnode,*p;
void insert(int data,int pio){
    newnode=malloc(sizeof(struct node));
    newnode->info=data;
    newnode->priority=pio;
    if(front==NULL || pio < front->priority){
        newnode->next=front;
        front=newnode;
    }
    else{
        p=front;
        while(p->next!=NULL && p->next->priority <=pio){
            p=p->next;
            newnode->next=p->next;
            p->next=newnode;
        }
    }
}
void delete(){
    if(front==NULL)
        printf("EMPTY");
    else{
        p=front;
        front=front->next;
        free(p);
    }
}
void display(){
    if(front==NULL)
        printf("EMPTY");
    else{
        p=front;
        while(p!=NULL){
            printf("%d ",p->info);
            p=p->next;
        }
        printf("\n");
    }
}

int main(){
        while(1){
        printf("Prioity Queue\n");
        printf("1.Insert\n2.Delete\n3.Display\n4.Exit\n");
        printf("Enter your choice: ");
        int ch,data,pio;
        scanf("%d",&ch);
        switch(ch){
            case 1: printf("Enter data: ");
                scanf("%d",&data);
                printf("Enter priority: ");
                scanf("%d",&pio);
                insert(data,pio);
                break;
            case 2: delete();
                break;
            case 3: display();
                break;
            default:
                return 0;
        }
    }
}