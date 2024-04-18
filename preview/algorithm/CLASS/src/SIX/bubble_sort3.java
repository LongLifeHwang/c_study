package SIX;

import java.util.Scanner;

public class bubble_sort3
{
    static void swap(int[] x, int m, int n)
    {
        int temp;

        temp = x[m];
        x[m] = x[n];
        x[n] = temp;
    }

    static void sort3(int[] x)
    {
        int left;
        int right;
        int k;

        left = 0;
        right = x.length - 1;
        while (left < right)
        {
            k = right;
            for (int i = right; i > left; i--)
            {
                if (x[i] < x[i - 1])
                {
                    swap(x, i, i - 1);
                    k = i;
                }
            }
            left = k;
            k = left;
            for (int i = left; i < right; i++)
            {
                if (x[i] > x[i + 1])
                {
                    swap(x, i, i + 1);
                    k = i;
                }
            }
            right = k;
        }
    }

    public static void  main(String[] args)
    {
        int     N;
        int[]   x;
        Scanner stdIn = new Scanner(System.in);

        System.out.printf("요솟 수 : ");
        N = stdIn.nextInt();
        x = new int[N];
        for (int i = 0; i < N; i++)
        {
            System.out.printf("x[%d] : ", i);
            x[i] = stdIn.nextInt();
        }
        sort3(x);
        System.out.printf("오름차순으로 정렬을 하였습니다. \n");
        for (int i = 0; i < N; i++)
            System.out.printf("x[%d] : %d\n", i, x[i]);
    }    
}
