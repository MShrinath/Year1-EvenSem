#include <stdio.h>
#include <stdlib.h>

struct tree{
    int data;
    struct tree *left;
    struct tree *right;
};

struct tree *root = NULL,*newnode;
void insert(struct tree ** root,int data){
    newnode = (struct tree*)malloc(sizeof(struct tree));
    newnode->data = data;
    newnode->left = NULL;
    newnode->right = NULL;
    if(*root == NULL)
        *root = newnode;
    else{
        if(data < (*root)->data)
            insert(&(*root)->left,data);
        else
            insert(&(*root)->right,data);
    }
}

void inorder(struct tree *root){
    if(root != NULL){
        inorder(root->left);
        printf("%d ",root->data);
        inorder(root->right);
    }
}

void preorder(struct tree *root){
    if(root != NULL){
        printf("%d ",root->data);
        preorder(root->left);
        preorder(root->right);
    }
}

void postorder(struct tree *root){
    if(root != NULL){
        postorder(root->left);
        postorder(root->right);
        printf("%d ",root->data);
    }
}

void deletenode(struct tree **root,int data){
    if(*root == NULL)
        printf("Not Found\n");
    else{
        if(data<(*root)->data)
            deletenode(&(*root)->left,data);
        else if(data>(*root)->data)
            deletenode(&(*root)->right,data);
        else{
            if((*root)->left == NULL && (*root)->right == NULL)
                *root = NULL;
            else if((*root)->left == NULL)
                *root = (*root)->right;
            else if((*root)->right == NULL)
                *root = (*root)->left;
            else{
                struct tree *temp = (*root)->right;
                while(temp->left != NULL)
                    temp = temp->left;
                (*root)->data = temp->data;
                deletenode(&(*root)->right,temp->data); 
            }
        }
    }
}

void search(struct tree *root,int data){
    if(root == NULL)
        printf("Not Found\n");
    else{
        if(data<root->data)
            search(root->left,data);
        else if(data>root->data)
            search(root->right,data);
        else
            printf("Found\n");
        }
}

int main(){
    while(1){
        printf("Binary Search Tree\n");
        printf("1.Insert\n2.Inorder\n3.Preorder\n4.Postorder\n5.Delete\n6.Search\n7.Exit\n");
        printf("Enter your choice: ");
        int ch,data;
        scanf("%d",&ch);
        switch(ch){
            case 1:
                printf("Enter the data: ");
                
                scanf("%d",&data);
                insert(&root,data);
                break;
            case 2:
                inorder(root);
                printf("\n");
                break;
            case 3:
                preorder(root);
                printf("\n");
                break;
            case 4:
                postorder(root);
                printf("\n");
                break;
            case 5:
                printf("Enter the data: ");
                scanf("%d",&data);
                deletenode(&root,data);
                break;
            case 6:
                printf("Enter the data: ");
                scanf("%d",&data);
                search(root,data);
                break;
            case 7:
                return 0; 
        }
    }
}
