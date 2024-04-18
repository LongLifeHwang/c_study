package THREE;

import java.util.Scanner;

public class LinearSearch
{
    static int  serach(int[] x, int serach)
    {
        int len;

        len = x.length;
        System.out.printf("   |");
        for (int i = 0; i < len; i++)
        {
            System.out.printf("   %d", i);
        }
        System.out.printf("\n---+");
        for (int i = 0; i < len; i++)
        {
            System.out.printf("----");
        }
        for (int i = 0; i < len; i++)
        {
            System.out.printf("\n   |");
            for (int j = 0; j < i; j++)
                System.out.printf("    ");
            System.out.printf("   *\n  %d|", i);
            for (int j = 0; j < len; j++)
                System.out.printf("   %d", x[j]);
            System.out.printf("\n   |");
            if (x[i] == serach)
            {
                System.out.printf("\n");
                return (i);
            }
        }
        System.out.printf("\n");
        return (-1);
    }

    public static void  main(String[] args)
    {
        int     N;
        int     answer;
        int     search;
        int[]   x;
        Scanner stdIn = new Scanner(System.in);

        System.out.printf("요솟수 : ");
        N = stdIn.nextInt();
        x = new int[N];
        for (int i = 0; i < N; i++)
        {
            System.out.printf("x[%d]: ", i);
            x[i] = stdIn.nextInt();
        }
        System.out.printf("검색할 값: ");
        search = stdIn.nextInt();
        answer = serach(x, search);
        if (answer >= 0)
            System.out.printf("검색 값은 x[%d]에 있습니다. \n", answer);
    }
}
