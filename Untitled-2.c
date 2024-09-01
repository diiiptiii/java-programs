#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
void main(){
    pid_t p;
    p=fork();
    if(p==-1){
        printf("error occured");
        {
            else if(p==0){
                printf("this is child");
                else{
                    printf("this is parent");
                }
            }
        }
    }
}