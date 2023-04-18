#include <stdio.h>
#include<stdlib.h>
void push();
void pop();
void display();
struct node{
    int data;
    struct node *next;
};
struct node *top=NULL,*newnode,*p,*q;
int main()
{
    int ch;
    while(1){
        printf("1.Push\n2.Pop\n3.Display\n4.Exit\n");
        printf("Enter your choice:");
        scanf("%d",&ch);
        switch(ch){
            case 1:push();
            break;
            case 2:pop();
            break;
            case 3:display();
            break;
            case 4:exit(0);
            break;
            default:printf("Invalid choice\n");
        }
    }
}
void push(){
    newnode=(struct node*)malloc(sizeof(struct node));
    printf("Enter the data:");
    scanf("%d",&newnode->data);
    newnode->next=NULL;
    if(top==NULL){
        top=newnode;
    }
    else{
        newnode->next=top;
        top=newnode;
    }
}
void pop(){
    if(top==NULL){
        printf("Stack is empty\n");
    }
    else{
        p=top;
        top=top->next;
        free(p);
    }
}
void display(){
    if(top==NULL){
        printf("Stack is empty\n");
    }
    else{
        p=top;
        while(p!=NULL){
            printf("%d-->",p->data);
            p=p->next;
        }
        printf("NULL\n");
    }
}