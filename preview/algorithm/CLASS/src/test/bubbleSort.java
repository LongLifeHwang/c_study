package TEST;

import java.util.Scanner;

public class bubbleSort
{
    static void swap(int[] x, int n, int m)
    {
        int temp;

        temp = x[n];
        x[n] = x[m];
        x[m] = temp;
    }

    static void sort0(int[] x, int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = N - 1; j > 0; j--)
            {
                if (x[j] < x[j - 1])
                    swap(x, j, j - 1);
            }
        }
    }
    
    static void sort1(int[] x, int N)
    {
        int add;
    
        for (int i = 0; i < N; i++)
        {
            add = 0;
            for (int j = N - 1; j > 0; j--)
            {
                if (x[j] < x[j - 1])
                {
                    add = 1;
                    swap(x, j, j - 1);
                }
            }
            if (add == 0)
                break ;
        }
    }

    static void sort2(int[] x, int N)
    {
        int k;
        int last;

        k = 0;
        last = N - 1;
        while (last > 0)
        {
            last = 0;
            for (int i = N - 1; i > k; i--)
            {
                if (x[i] > x[i - 1])
                {
                    last = i;
                    swap(x, i , i - 1);
                }
            }
            k = last;
        }   
    }

    static void sort3(int[] x, int N)
    {
        int left;
        int right;
        int temp;

        left = 0;
        right = N - 1;
        while (left < right)
        {
            temp = right;
            for (int i = N -1; i > left; i--)
            {
                if (x[i] > x[i - 1])
                {
                    temp = i;
                    swap(x, i, i - 1);
                }
            }
            left = temp;
            temp = left;
            for (int i = 0; i < right; i++)
            {
                if (x[i] < x[i + 1])
                {
                    temp = i;
                    swap(x, i, i + 1);
                }
            }
            right = temp;
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
        sort3(x, N);
        System.out.printf("오름차순으로 정렬했습니다. \n");
        for (int i = 0; i < N; i++)
            System.out.printf("x[%d] : %d\n", i, x[i]);
    }
}
