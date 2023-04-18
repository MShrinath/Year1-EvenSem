//Evaluation of Postfix expression 
#include<stdio.h>
#include<ctype.h>
#include<math.h>
int stack[100];
int top=-1;

void push(int val){
    top++;
    stack[top]=val;
}

int pop(){
    if(top==-1)
        return -1;
    else
        return stack[top--];
}

void evaluate(char ch[]){
    int a,b;
    for(int i=0;ch[i]!='\0';i++){
        if(isdigit(ch[i]))
            push(ch[i]-'0');
        else{
            char op=ch[i];
            a=pop();
            b=pop();
            switch(op){
                case '+':push(b+a);
                        break;
                case '-':push(b-a);
                        break;
                case'*':push(b*a);
                        break;
                case'/':push(b/a);
                        break;
                case'^':push(pow(b,a));
                        break;
            }
        }
    }
    printf("%d",pop());
}

int main(){
    char ch[100];
    printf("Enter the char");
    scanf("%s",ch);
    evaluate(ch);
}