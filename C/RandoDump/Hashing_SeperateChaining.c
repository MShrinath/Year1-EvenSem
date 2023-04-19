#include <stdio.h>
#include <stdlib.h>
#define size 10
struct node{
    int data;
    struct node *next;
};
struct node *ht[size],*p,*newnode;

void insert(int v){
    int index = v%size;
    newnode = malloc(sizeof(struct node));
    newnode->data = v;
    newnode->next = NULL;
    if(ht[index]==NULL)
        ht[index] = newnode; 
    else{
        p = ht[index];
        while(p->next!=NULL)
            p = p->next;
        p->next = newnode;
    }
}
void display(){
    for(int i=0;i<size;i++){
        p=ht[i];
        if(p==NULL)
            printf("NULL\n");
        else{
            while(p!=NULL){
                printf("%d->",p->data);
                p = p->next;
            }
        }
    }
}
int main(){
    while(1){
        printf("1.Insert\n2.Display\n3.Exit\n");
        int ch;
        scanf("%d",&ch);
        switch(ch){
            case 1:
                printf("Enter value: ");
                int v;
                scanf("%d",&v);
                insert(v);
                break;
            case 2:
                display();
                break;
            case 3:
                exit(0);
        }
    }
}