import java.util.*;

class inverse
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        System.out.println("Enter the number:");
        n = sc.nextInt();
        for(i=n-1;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}
