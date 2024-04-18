package SIX;


import java.util.Scanner;

public class ShellSort
{
    static void swap(int[] x, int m, int n)
    {
        int temp;

        temp = x[n];
        x[n] = x[m];
        x[m] = temp;
    }

    static void shell(int[] x)
    {
        int len;
        int h;
        int temp;
        int j;

        len = x.length;
        for (h = 1; h < len; h = 3 * h + 1);
        for (; h > 0; h /= 3)
        {
            for (int i = h; i < len; i++)
            {
                temp = x[i];
                for (j = i - h; j >= 0 && x[j] > temp; j -= h)
                {
                    x[j + h] = x[j];
                }
                x[j + h] = temp;
            }
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
        shell(x);
        System.out.printf("오름 차순으로 정렬했습니다. \n");
        for (int i = 0; i < N; i++)
        {
            System.out.printf("x[%d] : %d\n", i, x[i]);
        }
    }
}
