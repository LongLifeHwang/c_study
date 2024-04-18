package SIX;

import java.util.Scanner;

public class bubble_sort
{
    static void swap(int[] x, int n, int m)
    {
        int temp;

        temp = x[n];
        x[n] = x[m];
        x[m] = temp;
    }

    static void sort(int[] x)
    {
        int len;

        len = x.length;
        for (int i = 0; i < len; i++)
        {
            for (int j = len - 1; j > 0; j--)
            {
                if (x[j] > x[j - 1])
                    swap(x, j, j - 1);
            }
        }
    }
    public static void  main(String[] args)
    {
        int     N;
        int[]   x;
        Scanner stdIn = new Scanner(System.in);
    
        N = stdIn.nextInt();
        x = new int[N];
        for (int i = 0; i < N; i++)
        {
            System.out.printf("x[%d] : ", i);
            x[i] = stdIn.nextInt();
        }
        sort(x);
        for (int i = 0; i < N; i++)
        {
            System.out.printf("x[%d] : %d\n", i, x[i]);
        }
    }

}
