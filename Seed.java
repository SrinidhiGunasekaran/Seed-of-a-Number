import java.util.*;
class Seed
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number,i,j,a,flag=0;
System.out.println("Number:");
number=sc.nextInt();
for(i=0;i<number;i++)
{
a=i;
j=i;
while(j>0)
{
a=a*(j%10);
j=j/10;
}
if(a==number)
{
System.out.println("Seed Number:"+i);
flag=1;
}
}
if(flag==0)
{
System.out.println("No Seed Number exists");
}
}
}
