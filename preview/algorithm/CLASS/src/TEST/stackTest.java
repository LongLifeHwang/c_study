package TEST;

import java.util.Scanner;
import TEST.stack;

public class stackTest
{
    public static void  main(String[] args)
    {
        stack   test;
        Scanner stdIn = new Scanner(System.in);
        int     N;
        int     num;
        int     data;

        System.out.printf("N : ");
        N = stdIn.nextInt();
        try {
            test = new stack(N);
        }
        catch (stack.Empty e)
        {
            System.out.printf("new error\n");
            return ;
        }
        while (true)
        {
            System.out.printf("stack %d / %d\n", test.getCnt(), test.getSize());
            System.out.printf("(1) pop  (2)push  (3)peek  (4)exit: ");
            num = stdIn.nextInt();
            if (num == 4)
                return ;
            else if (num == 1)
            {
                try {
                    System.out.printf("pop : %d\n", test.pop());
                }
                catch (stack.Empty e)
                {
                    System.out.printf("pop error\n");
                }
            }
            else if (num == 2)
            {
                try{
                    System.out.printf("push data : ");
                    data = stdIn.nextInt();
                    test.push(data);
                    System.out.printf("push success\n");
                }
                catch (stack.Over e)
                {
                    System.out.printf("stack over\n");
                }
            }
            else if (num == 3)
            {
                try{
                    test.peek();
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
