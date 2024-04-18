package THREE;

import java.util.Scanner;

public class BlueDisk
{
    static int  possible(int[] x, int flag, int K)
    {
        int len;
        int sum;
        int i;
        int cnt;

        len = x.length;
        i = 0;
        cnt = 0;
        while (i < len)
        {
            cnt++;
            if (cnt > K)
                return (0);
            sum = 0;
            for (; i < len; i++)
            {
                sum += x[i];
                if (sum > flag)
                {
                    break ;
                }
            }
        }
        if (cnt == K)
            return (1);
        return (2);
    }

    static int  binarySearch(int[] x, int max, int sum, int K)
    {
        int start;
        int end;
        int center;

        start = max;
        end = sum;
        center = (start + end) / 2;
        while (start < end)
        {
            center = (start + end) / 2;
            if (possible(x, center, K) == 1)
            {
                for (; center > 0; center--)
                {
                    if (possible(x, center, K) != 1)
                        break ;
                }
                return (center + 1);
            }
            else if (possible(x, center, K) == 2)
                end = center;
            else
                start = center;
        }
        return (-1);
    }

    public static void  main(String[] args)
    {
        int     N, M, max, sum;
        int[]   x;
        Scanner stdIn = new Scanner(System.in);

        do {
            System.out.printf("레슨의 수 : ");
            N = stdIn.nextInt();
        } while (N < 1 || N > 100000);
        do {
            System.out.printf("블루레이의 수 : ");
            M = stdIn.nextInt();
        } while (M < 1 || M > N);
        x = new int[N];
        sum = 0;
        max = 0;
        for (int i = 0; i < N; i++)
        {
            x[i] = stdIn.nextInt();
            if (max < x[i])
                max = x[i];
            sum += x[i];
        }
        System.out.print(binarySearch(x, max, sum, M));
    }
}

