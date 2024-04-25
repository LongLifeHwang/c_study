package TEST;

public class queue
{
    public class Empty extends RuntimeException
    {
        public Empty() {};
    }

    public class Over extends RuntimeException
    {
        public Over() {};
    }

    int     size;
    int[]   x;
    int     cnt;

    public queue(int s) throws Empty
    {
        size = s;
        cnt = 0;
        try {
            x = new int[s];
        }
        catch (OutOfMemoryError e)
        {
            throw new Empty();
        }
    }

    public void in(int data) throws Over
    {
        if (cnt >= size)
            throw new Over();
        x[cnt++] = data;
    }

    public int  out() throws Empty
    {
        int answer;

        if (cnt == 0)
            throw new Empty();
        answer = x[0];
        for (int i = 1; i < cnt; i++)
            x[i - 1] = x[i];
        cnt--;
        return (answer);
    }

    public void peek() throws Empty
    {
        if (cnt == 0)
            throw new Empty();
        for (int i = 0; i < cnt; i++)
            System.out.printf("%d ", x[i]);
        System.out.printf("\n");
    }

    public int  getCnt()
    {
        return (cnt);
    }

    public int getSize()
    {
        return (size);
    }
}