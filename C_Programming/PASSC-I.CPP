#include<stdio.h>
#include<conio.h>
int main()
{
int password, D=12;
while(D!=0)
{
printf("input the password");
scanf("%d", &password);
if(password==1234)
{
printf("correct password");
D=0;
}
else
{
printf("incorrect password");
}
getch();
}