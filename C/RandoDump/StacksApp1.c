//Infix to Postfix
#include <stdio.h>
#include <ctype.h>
char stack[100];
int top = -1;

void push(char ch){
    top++;
    stack[top]=ch;
}

char pop(){
    if(top==-1)
        return -1;
    else
        return stack[top--];
}

int pio(char ch){
    if(ch=='^')
        return 3;
    else if(ch=='*' || ch=='/')
        return 2;
    else if(ch=='+' || ch=='-')
        return 1;
    else
        return 0;
}

void convert(char ch[]){
    for(int i=0;ch[i]!='\0';i++){
        if(isalnum(ch[i]))
            printf("%c",ch[i]);
        else if(ch[i]=='(')
            push(ch[i]);
        else if(ch[i]==')'){
            char x;
            while((x=pop())!='(')
                printf("%c",x);
        }
        else{
            while(pio(stack[top])>=pio(ch[i]))
                printf("%c",pop());
            push(ch[i]);
        }
    }
    while(top!=-1)
        printf("%c",pop());
}

int main(){
    char s[100];
    printf("Enter Expression:");
    scanf("%s",s);
    convert(s);
}