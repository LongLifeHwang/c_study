package TEST;

import java.util.Scanner;

public class linearSearch
{
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
        answer = lSerach(x, search);
        if (answer < 0)
            System.out.printf("%d는 array에 존재하지 않습니다.\n", search);
        else
            System.out.printf("%d는 array[%d]에 있습니다. \n", search, answer);
    }
}
