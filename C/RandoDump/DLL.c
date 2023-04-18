#include <stdio.h>
#include<stdlib.h>
void addbeg();
void addmid();
void addend();

void delbeg();
void delmid();
void delend();

void display();
int length();
void search();
struct node{
    int data;
    struct node *next;
    struct node *prev;
};
struct node *head=NULL,*newnode,*p,*q;
int main(){
    while(1){
        int ch;
        printf("1.Add at beginning\n2.Add at middle\n3.Add at end\n4.Delete at beginning\n5.Delete at middle\n6.Delete at end\n7.Display\n8.Length\n9.Search\n10.Exit\nEnter your choice:");
        scanf("%d",&ch);
        switch(ch){
            case 1:addbeg();
            break;
            case 2:addmid();
            break;
            case 3:addend();
            break;
            case 4:delbeg();
            break;
            case 5:delmid();
            break;
            case 6:delend();
            break;
            case 7:display();
            break;
            case 8:printf("Length of the list is %d",length());
            break;
            case 9:search();
            break;
            case 10:exit(0);
            break;
            default:printf("Invalid choice\n");
        }
    }
}
void addbeg(){
    newnode=(struct node*)malloc(sizeof(struct node));
    printf("Enter the data:");
    scanf("%d",&newnode->data);
    newnode->next=NULL;
    newnode->prev=NULL;
    if(head==NULL){
        head=newnode;
    }
    else{
        newnode->next=head;
        head->prev=newnode;
        head=newnode;
    }
}
void addmid(){
    int pos,i=1;
    printf("Enter the position:");
    scanf("%d",&pos);
    if(pos>length()){
        printf("Invalid position\n");
    }
    else{
        newnode=(struct node*)malloc(sizeof(struct node));
        printf("Enter the data:");
        scanf("%d",&newnode->data);
        newnode->next=NULL;
        newnode->prev=NULL;
        p=head;
        while(i<pos-1){
            p=p->next;
            i++;
        }
        newnode->next=p->next;
        p->next->prev=newnode;
        p->next=newnode;
        newnode->prev=p;
    }
}
void addend(){
    newnode=(struct node*)malloc(sizeof(struct node));
    printf("Enter the data:");
    scanf("%d",&newnode->data);
    newnode->next=NULL;
    newnode->prev=NULL;
    if(head==NULL){
        head=newnode;
    }
    else{
        p=head;
        while(p->next!=NULL){
            p=p->next;
        }
        p->next=newnode;
        newnode->prev=p;
    }
}
void delbeg(){
    if(head==NULL){
        printf("List is empty\n");
    }
    else{
        p=head;
        head=head->next;
        head->prev=NULL;
        free(p);
    }
}
void delmid(){
    int pos,i=1;
    printf("Enter the position:");
    scanf("%d",&pos);
    if(pos>length()){
        printf("Invalid position\n");
    }
    else{
        p=head;
        while(i<pos-1){
            p=p->next;
            i++;
        }
        q=p->next;
        p->next=q->next;
        q->next->prev=p;
        free(q);
    }
}
void delend(){
    if(head==NULL){
        printf("List is empty\n");
    }
    else{
        p=head;
        while(p->next!=NULL){
            p=p->next;
        }
        p->prev->next=NULL;
        free(p);
    }
}
void display(){
    if(head==NULL){
        printf("List is empty\n");
    }
    else{
        p=head;
        while(p!=NULL){
            printf("%d<->",p->data);
            p=p->next;
        }
        printf("NULL\n");
    }
}
int length(){
    int count=0;
    p=head;
    while(p!=NULL){
        count++;
        p=p->next;
    }
    return count;
}
void search(){
    int item,found=0;
    printf("Enter the item to be searched:");
    scanf("%d",&item);
    p=head;
    while(p!=NULL){
        if(p->data==item){
            found=1;
            printf("Item found\n");
            break;
        }
        p=p->next;
    }
    if(!found){
        printf("Item not found\n");
    }
}