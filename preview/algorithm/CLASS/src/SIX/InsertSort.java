package SIX;

import java.util.Scanner;

public class InsertSort
{
    static void insert(int[] x)
    {
        int len;
        int go;
        int j;

        len = x.length;
        for (int i = 1; i < len; i++)
        {
            go = x[i];
            for (j = i; j > 0 && x[j - 1] > go; j--)
            {
                x[j] = x[j - 1];
            }
            x[j] = go;
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
        insert(x);
        System.out.printf("\n오름 차순으로 정렬하세요.\n");
        for (int i = 0; i < N; i++)
        {
            System.out.printf("x[%d] : %d\n", i, x[i]);
        }
    }
}
