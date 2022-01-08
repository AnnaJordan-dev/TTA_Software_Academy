// Q.1 Write a java program to check whether number is prime or not a prime number.

public class PrimeCheck {

  public static void main(String[] args) {

    int num = 51;
    boolean prime = false;
    for (int i = 2; i <= num / 2; ++i) 
    {
      if (num % i == 0) {
        prime = true;
        break;
    }
    }
    if (!prime)
      System.out.println(num+ " is a prime number");
    else
      System.out.println(num+ " is not a prime number");
  }
}

// Q.2 Write a java program to print all number between range 100-500


public class AllNumber
{
    public static void main(String[] args)
    {
        for(int i =100; i<=500; i++)
        {
            System.out.println(i);
        }
    }
}

// Q.3 Write a java program to print sum of all number between 1-10

public class SumAll
{
    public static void main(String[] args)
    {
        int sum =0;
        for(int i = 1; i<=10; i++)
        {
            sum=sum+i;
        }
 	System.out.println( " Sum of all numbers between 1-10 = " +sum);
    }
}

/*Q.4 Write a java program to print all numbers in reverse order (e.g 10 9 8 7 6 5 4 3 2 1)*/

public class Reverse
{
    public static void main(String[] args)
    {
        for(int i = 10; i>=0; i--)
        {
            System.out.println( " " + i );
          
        }
    }
}