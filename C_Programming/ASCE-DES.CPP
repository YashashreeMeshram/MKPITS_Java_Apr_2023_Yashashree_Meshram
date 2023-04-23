#include<stdio.h>
#include<conio.h>
int main(){
int num1,num2;

printf("Input a two numbers of pairs");
scanf("%d%d",&num1,num2);
if(num1!=num2)
{
if(num2>num1)
{
printf("Ascending order /n");
}
else
{
printf("Descending order /n");
getch();
}}}