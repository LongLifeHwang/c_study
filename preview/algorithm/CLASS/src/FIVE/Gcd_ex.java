package FIVE;

import java.util.Scanner;

public class Gcd_ex
{
    static int  gcd(int x, int y)
    {
        int temp;

        if (x < y)
        {
            temp = x;
            x = y;
            y = temp;
        }
        x = x % y;
        if (x == 0)
            return (y);
        return (gcd(x, y));
    }
    public static void  main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int     x, y;
    
        System.out.printf("x : ");
        x = stdIn.nextInt();
        System.out.printf("y : ");
        y = stdIn.nextInt();
        System.out.printf("최대 공약수는 %d입니다. \n", gcd(x, y));
    }

}
