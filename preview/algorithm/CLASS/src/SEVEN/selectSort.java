package SEVEN;

import java.util.Scanner;

public class selectSort
{
    static void swap(int[] x, int m, int n)
    {
        int temp;

        temp = x[m];
        x[m] = x[n];
        x[n] = temp;
    }

    static void select(int[] x)
    {
        int len;
        int min;

        len = x.length;
        for (int i = 0; i < len - 1; i++)
        {
            min = i; 
            for (int j = i + 1; j < len; j++)
            {
                if (x[min] > x[j])
                    min = j;
            }
            swap(x, i, min);
        }
    }

    public static void  main(String[] args)
    {
        int     N;
        int[]   x;
        Scanner stdIn = new Scanner(System.in);
    
        System.out.printf("N : ");
        N = stdIn.nextInt();
        x = new int[N];
        for (int i = 0; i < N; i++)
        {
            System.out.printf("x[%d] : ", i);
            x[i] = stdIn.nextInt();
        }
        select(x);
        System.out.printf("오름차순으로 정렬했습니다.\n");
        for (int i = 0; i < N; i++)
            System.out.printf("x[%d] : %d\n", i, x[i]);
    }
}