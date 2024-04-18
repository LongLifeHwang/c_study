package SIX;

import java.util.Scanner;

public class SIX
{
    static void swap(int[] x, int m, int n)
    {
        int temp;

        temp = x[m];
        x[m] = x[n];
        x[n] = temp;
    }

    static void sort2(int[] x)
    {
        int len;
        int k;
        int last;

        len = x.length;
        k = 0;
        last = 0;
        while (k < len - 1)
        {
            k = len - 1;
            for (int i = len - 1; i > last; i--)
            {
                if (x[i] < x[i - 1])
                {
                    swap(x, i, i - 1);
                    k = i;
                }
            }
            last = k;
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
        sort2(x);
        System.out.printf("오름차순으로 정렬을 하였습니다. \n");
        for (int i = 0; i < N; i++)
            System.out.printf("x[%d] : %d\n", i, x[i]);
    }
}

