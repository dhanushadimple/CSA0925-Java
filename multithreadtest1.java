class AThread implements Runnable 
{
    public void run() 
{
        for (int i = 1; i <= 10; i++) 
{
            System.out.println("5 * " + i + " = " + 5 * i);
          } 
    }
}

class BThread implements Runnable 
{
    public void run()
 {
        for (int i = 1; i <= 10; i++) 
{
            System.out.println("10 * " + i + " = " + 10 * i);
          }
    }
}

 class Multithreadtest1 
{
    public static void main(String[] args)
 {
        AThread a = new AThread();
        BThread b = new BThread();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}