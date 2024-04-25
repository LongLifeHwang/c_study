package TEST;

import java.util.Scanner;

public class linear
{
    static int  linearSearch(int[] x, int N, int s)
    {
        for (int i = 0; i < N; i++)
        {
            if (x[i] == s)
                return (i);
        }
        return (-1);
    }

    public static void  main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int[]   x;
        int     N;
        int     search;
        int     answer;

        System.out.printf("N : ");
        N = stdIn.nextInt();
        x = new int[N];
        for (int i = 0; i < N; i++)
        {
            System.out.printf("x[%d] : ", i);
            x[i] = stdIn.nextInt();
        }
        System.out.printf("search : ");
        search = stdIn.nextInt();
        answer = linearSearch(x, N, search);
        if (answer < 0)
            System.out.printf("%d는 존재하지 않습니다. \n", search);
        else
            System.out.printf("%d는 x[%d]에 존재합니다. \n", search, answer);
    }
}
