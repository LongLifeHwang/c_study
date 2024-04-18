package SIX;

import java.util.Scanner;

public class InsertSort
{
    static void insert(int[] x)
    {
        int temp;
        int len;
        int j;

        len = x.length;
        for (int i = 1; i < len; i++)
        {
            temp = x[i];
            for (j = i; j > 0 && x[j - 1] > temp; j--)
                x[j] = x[j - 1];
            x[j] = temp;
        }
    }

    public static void  main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int     N;
        int[]   x;

        System.out.printf("요솟 수 : ");
        N = stdIn.nextInt();
        x = new int[N];
        for (int i = 0; i < N; i++)
        {
            System.out.printf("x[%d] : ", i);
            x[i] = stdIn.nextInt();
        }
        insert(x);
        System.out.printf("오름 차순으로 정렬했습니다. \n");
        for (int i = 0; i < N; i++)
        {
            System.out.printf("x[%d] : %d\n", i, x[i]);
        }
    }
}