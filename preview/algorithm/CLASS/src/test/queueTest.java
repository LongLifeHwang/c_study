package TEST;

import java.util.Scanner;
import TEST.queue;

public class queueTest
{
    public static void  main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        queue   test;
        int     size;
        int     data;
        int     num;

        do {
            System.out.printf("queue size : ");
            size = stdIn.nextInt();
        } while (size <= 0);
        try {
            test = new queue(size);
        }
        catch (queue.Empty e)
        {
            System.out.printf("new error\n");
            return ;
        }
        while (true)
        {
            do 
            {
                System.out.printf("stack %d / %d\n", test.getCnt(), test.getSize());
                System.out.printf("(1)in  (2)out  (3)peek  (4)exit: ");
                num = stdIn.nextInt();
            } while (num < 1 || num > 4);
            if (num == 4)
                return ;
            else if (num == 1)
            {
                System.out.printf("data : ");
                data = stdIn.nextInt();
                try {
                    test.in(data);
                    System.out.printf("in success\n");
                }
                catch (queue.Over e)
                {
                    System.out.printf("in error\n");
                }
            }
            else if (num == 2)
            {
                try {
                    System.out.printf("pop : %d\n", test.out());
                }
                catch (queue.Empty e)
                {
                    System.out.printf("pop error\n");
                }
            }
            else if (num == 3)
            {
                try {
                    test.peek();
                }
                catch (queue.Empty e)
                {
                    System.out.printf("peek error\n");
                }
            }
        }
    }    
}
