package FIVE;

import java.util.Scanner;

public class Gcd_ex1
{
    static int  gcd(int x, int y)
    {
        x = x % y;
        if (x == 0)
            return (y);
        return (gcd(y, x));
    }
    public static void  main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int     x, y;
    
        System.out.printf("x : ");
        x = stdIn.nextInt();
        System.out.printf("y : ");
        y = stdIn.nextInt();
        System.out.printf("%d와 %d의 최소 공배수는 %d입니다.\n", x, y, x * y / gcd(x, y));
    }
}
