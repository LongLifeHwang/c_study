package HARD;

import java.util.Scanner;

public class shellSort
{
    static void shell(int[] x, int len)
    {
        int h;
        int j;
        int temp;

        for (h = 0; h < len; h = 3 * h + 1);
        for (; h > 0; h/= 3)
        {
            for (int i = h; i < len; i++)
            {
                temp = x[i];
                for (j = i; j >= h && x[j - h] > temp; j -= h)
                {
                    x[j] = x[j - h];
                }
                x[j] = temp;
            }
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
        shell(x, x.length);
        System.out.printf("오름차순으로 정렬했습니다.\n");
        for (int i = 0; i < N; i++)
            System.out.printf("x[%d] : %d\n", i, x[i]);
    }
}
