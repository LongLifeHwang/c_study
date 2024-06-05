package TEST;

import java.util.Scanner;

public class sort
{
    static void swap(int[] x, int n, int m)
    {
        int temp;

        temp = x[n];
        x[n] = x[m];
        x[m] = temp;
    }

    static void bsort0(int[] x, int N)
    {
        for (int i = 0; i < N - 1; i++)
        {
            for (int j = N - 1; j > 0; j--)
            {
                if (x[j] < x[j - 1])
                {
                    swap(x, j, j - 1);
                }
            }
        }
    }

    static void bsort1(int[] x, int N)
    {
        int cnt;

        for (int i = 0; i < N - 1; i++)
        {
            cnt = 0;
            for (int j = N - 1; j > 0; j--)
            {
                if (x[j] < x[j - 1])
                {
                    swap(x, j, j - 1);
                    cnt++;
                }
            }
            if (cnt == 0)
                break ;
        }
    }
    
    static void bsort2(int[] x, int N)
    {
        int k;
        int last;

        k = 0;
        while (k < N - 1)
        {
            last = N - 1;
            for (int j = N - 1; j > k; j--)
            {
                if (x[j] < x[j - 1])
                {
                    last = j;
                    swap(x, j, j - 1);
                }
            }
            k = last;
        }
    }

    static void bsort3(int[] x, int N)
    {
        int left;
        int right;
        int temp;

        left = 0;
        right = N - 1;
        while (left < right)
        {
            temp = right;
            for (int i = N - 1; i > left; i--)
            {
                if (x[i] < x[i - 1])
                {
                    temp = i;
                    swap(x, i, i - 1);
                }
            }
            left = temp;
            temp = left;
            for (int i = 0; i < right; i++)
            {
                if (x[i] > x[i + 1])
                {
                    temp = i;
                    swap(x, i, i + 1);
                }
            }
            right = temp;
        }
    }

    static void ssort(int[] x, int N)
    {
        int temp;

        for (int i = 0; i < N - 1; i++)
        {
            temp = i;
            for (int j = i + 1; j < N; j++)
            {
                if (x[temp] > x[j])
                    temp = j;
            }
            swap(x, i, temp);
        }
    }

    static void isort(int[] x, int N)
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

    static void shell(int[] x, int N)
    {
        int h;
        int temp;
        int j;

        for (h = 0; h < N; h = 3 * h + 1);
        for (; h > 0; h /= 3)
        {
            for (int i = h; i < N; i++)
            {
                temp = x[i];
                for (j = i; j >= h && x[j - h] < temp; j -= h)
                {
                    x[j] = x[j - h];
                }
                x[j] = temp;
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
        shell(x, N);
        System.out.printf("오름 차순으로 정렬했습니다. \n");
        for (int i = 0; i < N; i++)
        {
            System.out.printf("x[%d] : %d\n", i, x[i]);
        }
    }
}
