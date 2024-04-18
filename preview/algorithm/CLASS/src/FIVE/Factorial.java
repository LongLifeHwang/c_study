package FIVE;

import java.util.Scanner;

public class Factorial
{
    static int  facto(int N, int sum)
    {
        if (N > 0)
            return (facto(N - 1, sum * N));
        return (sum);
    }
    public static void  main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int     N;

        System.out.printf("N : ");
        N = stdIn.nextInt();
        System.out.printf("factorial %d : %d\n", N, facto(N, 1));
    }    
}
