//Balanced Brackets
#include <stdio.h>
int top=-1;
char stack[100];

void push(char x){
    stack[++top]=x;
}

char pop(){
    if(top==-1)
        return -1;
    else
        return stack[top--];
}

void balance(char ch[]){
    int i;
    for(i=0;ch[i]!='\0';i++)
    {
        if(ch[i]=='('||ch[i]=='{'||ch[i]=='[')
            push(ch[i]);
        else if(ch[i]==')'||ch[i]=='}'||ch[i]==']'){
            if(top==-1)
                break; 
            else if(ch[i]==')'&&(pop()=='('))
                continue;
            else if(ch[i]=='}'&&(pop()=='{'))
                continue;
            else if(ch[i]==']'&&(pop()=='['))
                continue;
            else
                break;
        }
        
    }
    if(top==-1)
        printf("Balanced");
    else
        printf("Unbalanced");
}

int main(){
    char ch[100];
    printf("Enter the char");
    scanf("%s",ch);
    balance(ch);
}