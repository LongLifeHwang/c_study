package TEST;

import java.util.Scanner;

public class binarySearch
{
    static int  answer(int[] x, int index, int search)
    {
        while (index >= 0)
        {
            if (x[index] != search)
                return (index + 1);
            index--;
        }
        return (0);
    }

    static int search(int[] x, int N, int search)
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
            if (x[pc] < search)
                pl = pc;
            else
                pr = pc;
        }
        if (x[pl] == search)
            return (answer(x, pl, search));
        else if (x[pr] == search)
            return (answer(x, pr, search));
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
        answer = search(x, N, search);
        if (answer < 0)
            System.out.printf("%d는 존재하지 않습니다. \n", search);
        else
            System.out.printf("%d는 x[%d]에 존재합니다. \n", search, answer);
    }    
}
