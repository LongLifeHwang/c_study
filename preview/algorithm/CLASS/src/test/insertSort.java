package TEST;

import java.util.Scanner;

public class insertSort
{
    static void sort0(int[] x, int N)
    {
        int temp;
        int j;

        for (int i = 1; i < N; i++)
        {
            temp = x[i];
            for (j = i; j > 0 && x[j - 1] < temp; j--)
            {
                x[j] = x[j - 1];
            }
            x[j] = temp;
        }
    }

    static void sort1(int[] x, int N)
    {
        int temp;
        int j;
        int h;

        for (h = 0; h < N; h = 3 * h + 1);
        for (; h > 0; h /= 3)
        {
            for (int i = 1 + h; i < N; i++)
            {
                temp = x[i];
                for (j = i; j > h && x[j - h] < temp; j -= h)
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
        sort1(x, N);
        System.out.printf("오름차순으로 정렬했습니다. \n");
        for (int i = 0; i < N; i++)
            System.out.printf("x[%d] : %d\n", i, x[i]);
    }
}
