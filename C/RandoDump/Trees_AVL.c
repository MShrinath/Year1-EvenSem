#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *left;
    struct node *right;
    int height;
};

struct node *root = NULL,*newnode;

int getHeight(struct node *n){
    if(n == NULL)
        return 0;
    else
        return n->height;
}

int max(int a, int b){
    return a > b? a:b;
}

int getBalance(struct node *n){
    if(n == NULL)
        return 0;
    else
        return getHeight(n->left) - getHeight(n->right);
}

void inorder(struct node *root){
    if(root != NULL){
        inorder(root->left);
        printf("%d ",root->data);
        inorder(root->right);
    }
}

void preorder(struct node *root){
    if(root != NULL){
        printf("%d ",root->data);
        preorder(root->left);
        preorder(root->right);
    }
}

void postorder(struct node *root){
    if(root != NULL){
        postorder(root->left);
        postorder(root->right);
        printf("%d ",root->data);
    }
}

struct node* leftrotate(struct node* x){
    struct node *y = x->right;
    struct node *T2 = y->left;
    y->left = x;
    x->right = T2;
    x->height = max(getHeight(x->left),getHeight(x->right)) + 1;
    y->height = max(getHeight(y->left),getHeight(y->right)) + 1;
    return y;
}

struct node* rightrotate(struct node* y){
    struct node *x = y->left;
    struct node *T2 = x->right;
    x->right = y;
    y->left = T2;
    y->height = max(getHeight(y->left),getHeight(y->right)) + 1;
    x->height = max(getHeight(x->left),getHeight(x->right)) + 1;
    return x;
}

struct node* insert(struct node* node, int data){
    if(node == NULL){
        newnode = (struct node*)malloc(sizeof(struct node));
        newnode->data = data;
        newnode->left = NULL;
        newnode->right = NULL;
        newnode->height = 1;
        return newnode;
    }
    if(data < node->data)
        node->left = insert(node->left,data);
    else if(data > node->data)
        node->right = insert(node->right,data);
    else
        return node;
    node->height = 1 + max(getHeight(node->left),getHeight(node->right));
    int balance = getBalance(node);
    if(balance > 1 && data < node->left->data)
        return rightrotate(node);
    if(balance < -1 && data > node->right->data)
        return leftrotate(node);
    if(balance > 1 && data > node->left->data){
        node->left = leftrotate(node->left);
        return rightrotate(node);
    }
    if(balance < -1 && data < node->right->data){
        node->right = rightrotate(node->right);
        return leftrotate(node);
    }
    return node;
}

int main(){
    while(1){
        printf("AVL\n");
        printf("1.Insert\n2.Inorder\n3.Preorder\n4.Postorder\n5.Exit");
        printf("Enter your choice: ");
        int ch,data;
        scanf("%d",&ch);
        switch(ch){
            case 1:
                printf("Enter the data: ");
                scanf("%d",&data);
                root = insert(root,data);
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
                return 0;
        }
    }
}