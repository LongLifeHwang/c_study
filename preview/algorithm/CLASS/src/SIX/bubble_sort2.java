package SIX;

import java.util.Scanner;

public class bubble_sort2
{
    static void swap(int[] x, int n, int m)
    {
        int temp;

        temp = x[n];
        x[n] = x[m];
        x[m] = temp;
    }

    static void sort2(int[] x)
    {
        int len;
        int k;
        int last;

        k = 0;
        len = x.length;
        while (k < len - 1)
        {
            last = len - 1;
            for (int i = len - 1; i > k; i--)
            {
                if (x[i] > x[i - 1])
                {
                    swap(x, i, i - 1);
                    last = i;
                }
            }
            k = last;
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
        sort2(x);
        for (int i = 0; i < N; i++)
            System.out.printf("x[%d] : %d\n", i, x[i]);
    }    
}
