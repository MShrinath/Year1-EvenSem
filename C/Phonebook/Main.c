#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct contact{
    char name[30];
    char sex;
    long int phno;
    char email[30];
    char address[50];
};

struct contact pb;
char filename[] = "phonebook.txt";
FILE *fpb;

void add(){
    printf("Enter Name: ");
    scanf(" %s",pb.name);
    printf("Enter Gender:");
    scanf(" %c",&pb.sex);
    printf("Enter Phone number: ");
    scanf("%ld",&pb.phno);
    printf("Enter Email: ");
    scanf("%s",pb.email);
    printf("Enter Address: ");
    scanf("%s",pb.address);
    fprintf(fpb,"%s,%c,%ld,%s,%s\n",pb.name,pb.sex,pb.phno,pb.email,pb.address); 
}

void del(){

    int f=0;
    char search[30];
    printf("Enter name to search: ");
    scanf("%s",search);

    char sname[30];
    char ssex;
    long int sphno;
    char semail[30];
    char saddress[50];

    FILE *ftemp ;
    ftemp= fopen("temp.txt","a+");
    
    while(fscanf(fpb,"%[^,],%c,%ld,%[^,],%[^\n] ",sname,&ssex,&sphno,semail,saddress)!=EOF){
        if(strcmp(search,sname)!=0){
            fprintf(ftemp,"%s,%c,%ld,%s,%s\n",sname,ssex,sphno,semail,saddress);
        }
        else
            f=1;
    }
    if(f==0)
        printf("\nContact not found\n\n");
    else
        printf("\nContact deleted\n\n");
    fclose(fpb);
    fclose(ftemp);
    remove(filename);
    rename("temp.txt", filename);
    fpb = fopen(filename,"a+");
}

void search(){
    char search[30];
    printf("Enter name to search: ");
    scanf("%s",search);

    char sname[30];
    char ssex;
    long int sphno;
    char semail[30];
    char saddress[50];

    while(fscanf(fpb,"%[^,],%c,%ld,%[^,],%[^\n] ",sname,&ssex,&sphno,semail,saddress)!=EOF){
        if(strcmp(search,sname)==0){
            printf("\nName: %s\n",sname);
            printf("Gender: %c\n",ssex);
            printf("Phone number: %ld\n",sphno);
            printf("Email: %s\n",semail);
            printf("Address: %s\n\n",saddress);
            return;
        }
    }
    printf("\nContact not found\n\n");
}

int main(){
    while(1){
        fpb = fopen(filename,"a+");
        printf("Phonebook\n");
        printf("1.Add a contact\n2.Delete a contact\n3.Search a contact\n4.Exit\n");
        printf("Enter your choice: ");
        int ch;
        scanf("%d",&ch);
        switch(ch){
            case 1:
                add();
                fclose(fpb);
                break;
            case 2:
                del();
                fclose(fpb);
                break;
            case 3:
                search();
                fclose(fpb);
                break;
            case 4:
                fclose(fpb);
                return 0;
        }
    }
}
