#include<stdio.h>
#include<pthread.h>
void *threadfunction(void args){
    while(1){
        printf(" i am a thread function");
    }
}
int main(){
    pthread_t id;
    int ret;
    ret=pthread_create(&id,NULL,thread_function,NULL);
    if(ret==0){
        printf("thread is created successfully");
        else{
            printf("thread not created")}
            while(1){
                printf("i am main function");
            }
        return 0;
    }
}