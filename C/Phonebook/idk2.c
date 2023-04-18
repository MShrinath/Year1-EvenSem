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

struct contact pb[5];
int c=0;
char filename[] = "phonebook.txt";
FILE *fpb;

void add(){
    if(c==5){
        printf("Phonebook is full");
        return;
    }
    else{
        printf("Enter Name: ");
        scanf(" %s",pb[c].name);
        printf("Enter Gender:");
        scanf(" %c",&pb[c].sex);
        printf("Enter Phone number: ");
        scanf("%ld",&pb[c].phno);
        printf("Enter Email: ");
        scanf("%s",pb[c].email);
        printf("Enter Address: ");
        scanf("%s",pb[c].address);
        fprintf(fpb,"%s,%c,%ld,%s,%s\n",pb[c].name,pb[c].sex,pb[c].phno,pb[c].email,pb[c].address); 
        c++;
    }
}


void del(){
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
    
    // while(fscanf(fpb,"%s,%c,%ld,%s,%s",sname,&ssex,&sphno,semail,saddress)!=EOF){
    while(fscanf(fpb,"%[^,],%c,%ld,%[^,],%[^\n] ",sname,&ssex,&sphno,semail,saddress)!=EOF){
        if(strcmp(search,sname)!=0){
            fprintf(ftemp,"%s,%c,%ld,%s,%s\n",sname,ssex,sphno,semail,saddress);
            // continue;
        }
        // else{
        //     fprintf(ftemp,"%s,%c,%ld,%s,%s\n",sname,ssex,sphno,semail,saddress);
        // }
    }
    fclose(fpb);
    fclose(ftemp);
    remove(filename);
    rename("temp.txt", filename);
    fpb = fopen(filename,"a+");
}

// void search(){
//     char sname[30],dname[30],rline[100];;
//     printf("Enter name to search: ");
//     scanf("%s",sname);
//     while(fscanf(fpb, "%[^,],", dname)!=EOF){

//             fgets(rline, sizeof(rline), fpb);

//         if(strcmp(sname,dname)==0){
//             printf("Contact found");
//             return;
//         }
//     }
//     printf("Contact not found");
// }


void search(){
    char search[30];

    char sname[30];
    char ssex;
    long int sphno;
    char semail[30];
    char saddress[50];

    printf("Enter name to search: ");
    scanf("%s",search);
    while(fscanf(fpb,"%[^,],%c,%ld,%[^,],%[^\n] ",sname,&ssex,&sphno,semail,saddress)!=EOF){
        if(strcmp(search,sname)==0){
            // printf("\nName: %s\nGender: %c\nPhone number: %ld\nEmail: %s\nAddress: %s\n\n\n",sname,ssex,sphno,semail,saddress);
            printf("\nName: %s\n",sname);
            printf("Gender: %c\n",ssex);
            printf("Phone number: %ld\n",sphno);
            printf("Email: %s\n",semail);
            printf("Address: %s\n\n",saddress);
            return;
        }
    }
    printf("Contact not found\n\n");
}

int main(){

    // fpb = fopen(filename,"a+");
    // add();
    // search();
    // del();
    // fclose(fpb);
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
