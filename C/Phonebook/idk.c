#include <stdio.h>
#include <string.h>
int main(){
    while(1){
        printf("Rushi  charan ");
    }
    char line[100];
    FILE *fp;
    fp = fopen("dk.txt", "a+");
    fscanf(fp, "%[^\n]", line);
    printf("%s  ", line);


    rename("dk.txt", "temp1.txt");
    rename("temp.txt", "dk.txt");
    // rename("temp1.txt", "temp.txt");
    fclose(fp);
    return 0;

}
