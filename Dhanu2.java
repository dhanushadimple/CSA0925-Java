import java.util.*;

class Dhanu2 
{
    public static void main(String args[])
       {
        int i, j, k, n, num = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        n = sc.nextInt();
        for (i = 0; i <= n; i++) 
           {
            for (j = 0; j <= n - i; j++) 
            {
                System.out.print("  ");
            }
            for (k = 0; k <= i; k++) 
            {
                System.out.printf( "num * num");
                num++;
            }
            System.out.println();
        }
    }
}
