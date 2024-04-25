package test;

import java.util.Scanner;
import test.stack;

public class stackTest
{
    public static void  main(String[] args)
    {
        stack   testS;
        Scanner stdIn = new Scanner(System.in);
        int     N;
        int     num;
        int     data;

        System.out.printf("N : ");
        N = stdIn.nextInt();
        // do {
        //     System.out.printf("N : ");
        //     N = stdIn.nextInt();
        // } while (N <= 0);
        testS = new stack(N);
        // try
        // {
        //     testS = new stack(N);
        // }
        // catch (stack.Empty e)
        // {
        //     System.out.printf("new error\n");
        // }
        while (true)
        {
            do {
                System.out.printf("stack %d / %d\n", testS.getIndex(), testS.getSize());
                System.out.printf("(1) pop  (2)push  (3)peek  (4)exit: ");
                num = stdIn.nextInt();
            } while (num < 1 || num > 4);
            if (num == 4)
                return ;
            else if (num == 1)
            {
                try {
                    System.out.printf("pop : %d\n", testS.pop());
                }
                catch (stack.Empty e)
                {
                    System.out.printf("stack empty\n");
                }
            }
            else if (num == 2)
            {
                try {
                    System.out.printf("data : ");
                    data = stdIn.nextInt();
                    System.out.printf("pop : %d\n", testS.push(data));
                }
                catch (stack.Over e)
                {
                    System.out.printf("stack over\n");
                }
            }
            else if (num == 3)
            {
                try {
                    testS.peek();
                    System.out.printf("peek success\n");
                }
                catch (stack.Empty e)
                {
                    System.out.printf("stack empty\n");
                }
            }
        }
    }
}
