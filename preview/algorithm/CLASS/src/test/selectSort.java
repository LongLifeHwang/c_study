package TEST;

import java.util.Scanner;

public class selectSort
{
    static void swap(int[] x, int n, int m)
    {
        int temp;

        temp = x[n];
        x[n] = x[m];
        x[m] = temp;
    }

    static void sort(int[] x, int N)
    {
        int origin;

        for (int i = 0; i < N - 1; i++)
        {
            origin = i;
            for (int j = i + 1; j < N; j++)
            {
                if (x[origin] > x[j])
                    origin = j;
            }
            swap(x, i, origin);
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
        sort(x, N);
        System.out.printf("오름차순으로 정렬했습니다. \n");
        for (int i = 0; i < N; i++)
            System.out.printf("x[%d] : %d\n", i, x[i]);
    }
}
