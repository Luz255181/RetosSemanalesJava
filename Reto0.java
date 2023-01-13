/**
 * Reto0
 */
public class Reto0
{
    public static void main(String[] args)
    {
        for (int i = 0; i <= 100; i++)
        {
            if (i % 3 == 0)
            {
                if(i % 5 == 0)
                    System.out.println("fizzbuzz");
                else
                    System.out.println("fizz");
            }
            else
            {
                if(i % 5 == 0)
                    System.out.println("buzz");
                else
                    System.out.println(i);
            }
        }
    }
}