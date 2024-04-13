import java.util.*;
class fer
{
public static void main(String args[])
{
int n,i,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
fact=fact+i;
}
System.out.println("factorial of number is":+fact);
}
}