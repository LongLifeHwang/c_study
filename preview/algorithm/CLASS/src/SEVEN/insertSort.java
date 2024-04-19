package SEVEN;

import java.util.Scanner;

public class insertSort
{
    static void insert(int[] x)
    {
        int len;
        int temp;
        int j;

        len = x.length;
        for (int i = 1; i < len; i++)
        {
            temp = x[i];
            for (j = i; j > 0 && x[j - 1] > temp; j--)
            {
                x[j] = x[j - 1];
            }
            x[j] = temp;
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
        insert(x);
        System.out.printf("오름차순으로 정렬했습니다.\n");
        for (int i = 0; i < N; i++)
            System.out.printf("x[%d] : %d\n", i, x[i]);
    }
}
