#include<stdio.h>
#include<conio.h>
int main()
{
int x,y;
printf("enter the coordinates x,y ");
printf("x");
scanf("%d",&x);
printf("y");
scanf("%d",&y);
if(x>0 && y>0)
{
printf("quadrant-I(+,+)");
}
else if(x>0 && y<0)
{
printf("quudrant-II(+,-)");
}
else if(x<0 && y<0)
{
printf("quadrant-III(-,-)");
}
else if(x<0 && y>0)
{
printf("quadrant-IV(-,+)");
}
getch();
}