package SIX;

import java.util.Scanner;

public class SelectSort
{
    static void swap(int[] x, int n, int m)
    {
        int temp;

        temp = x[n];
        x[n] = x[m];
        x[m] = temp;
    }

    static void select(int[] x)
    {
        int len;
        int cur;
        int chg;
        int min;

        len = x.length;
        cur = -1;
        while (++cur < len - 1)
        {
            min = x[cur];
            chg = cur;
            for (int i = cur + 1; i < len; i++)
            {
                if (min > x[i])
                {
                    min = x[i];
                    chg = i;
                }
            }
            swap(x, cur, chg);
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
        select(x);
        System.out.printf("\n오름 차순으로 정렬하였습니다.\n");
        for (int i = 0; i < N; i++)
        {
            System.out.printf("x[%d] : %d\n", i, x[i]);
        }
    }
}
