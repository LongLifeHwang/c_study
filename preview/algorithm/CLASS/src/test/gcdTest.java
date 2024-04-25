package TEST;

import java.util.Scanner;

public class gcdTest
{
    static int  gcd(int x, int y)
    {
        if (y == 0)
            return (x);
        return (gcd(y, x % y));
    }
    public static void  main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int     num1;
        int     num2;

        System.out.printf("num1 : ");
        num1 = stdIn.nextInt();
        System.out.printf("num2 : ");
        num2 = stdIn.nextInt();
        System.out.printf("최대공약수 : %d\n", gcd(num1, num2));
        System.out.printf("최소공배수 : %d\n", num1 * num2 / gcd(num1, num2));
    }
}
