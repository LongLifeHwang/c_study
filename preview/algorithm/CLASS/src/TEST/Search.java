package TEST;

import java.util.Scanner;

public class Search
{
    static int  answer(int[] x, int index, int search)
    {
        for (int i = index; i >= 0; i--)
        {
            if (x[i] != search)
                return (i + 1);
        }
        return (0);
    }

    static int  binarySearch(int[] x, int N, int search)
    {
        int pl;
        int pr;
        int pc;

        pl = 0;
        pr = N - 1;
        while (pl < pr - 1)
        {
            pc = (pl + pr) / 2;
            if (x[pl] == search)
                return (answer(x, pl, search));
            else if (x[pr] == search)
                return (answer(x, pr, search));
            else if (x[pc] == search)
                return (answer(x, pc, search));
            if (x[pc] > search)
                pr = pc;
            else
                pl = search;
        }
        if (x[pl] == search)
            return (answer(x, pl, search));
        else if (x[pr] == search)
            return (answer(x, pr, search));
        return (-1);
    }

    static int lSerach(int[] x, int search)
    {
        int len = x.length;

        for (int i = 0; i < len; i++)
        {
            if (x[i] == search)
                return (i);
        }
        return (-1);
    }

    public static void  main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int     N;
        int     search;
        int     answer;
        int[]   x;

        System.out.printf("N : ");
        N = stdIn.nextInt();
        try {
            x = new int[N];
        }
        catch (OutOfMemoryError e)
        {
            return ;
        }
        for (int i = 0; i < N; i++)
        {
            System.out.printf("x[%d] : ", i);
            x[i] = stdIn.nextInt();
        }
        System.out.printf("search : ");
        search = stdIn.nextInt();
        answer = binarySearch(x, N, search);
        if (answer < 0)
            System.out.printf("%d는 array에 존재하지 않습니다.\n", search);
        else
            System.out.printf("%d는 array[%d]에 있습니다. \n", search, answer);
    }
}
