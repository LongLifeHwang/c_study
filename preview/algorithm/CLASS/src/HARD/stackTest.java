package HARD;

import java.util.Scanner;
import HARD.stack;

public class stackTest
{
    public static void  main(String[] args)
    {
        stack   test;
        Scanner stdIn = new Scanner(System.in);
        int     data;
        int     num;
        int     size;

        do {
            System.out.printf("stack size : ");
            size = stdIn.nextInt();
        } while (size <= 0);
        try {
            test = new stack(size);
        }
        catch (stack.Empty e)
        {
            System.out.printf("new error\n");
            return ;
        }
        while (true)
        {
            System.out.printf("stack %d / %d\n", test.getIdx(), test.getSize());
            System.out.printf("(1) pop  (2)push  (3)peek  (4)exit: ");
            num = stdIn.nextInt();
            if (num == 4)
                return ;
            else if (num == 1)
            {
                try {
                    test.pop();
                    System.out.printf("pop success\n");
                }
                catch (stack.Empty e) {
                    System.out.printf("stack empty\n");
                }
            }
            else if (num == 2)
            {
                try {
                    System.out.printf("push data : ");
                    data = stdIn.nextInt();
                    test.push(data);
                    System.out.printf("push success\n");
                }
                catch (stack.Over e) {
                    System.out.printf("stack over\n");
                }
            }
            else if (num == 3)
            {
                try {
                    test.peek();
                    System.out.printf("peek success\n");
                }
                catch (stack.Empty e) {
                    System.out.printf("stack empty\n");
                }
            }
        }
    }
}
