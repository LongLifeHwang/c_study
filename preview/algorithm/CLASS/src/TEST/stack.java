package TEST;

public class stack
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
    int     cnt;
    int[]   x;

    public stack(int S) throws Empty
    {
        size = S;
        cnt = 0;
        try {
            x = new int[S];
        }
        catch (OutOfMemoryError e)
        {
            throw new Empty();
        }
    }

    public void push(int data) throws Over
    {
        if (cnt == size)
            throw new Over();
        x[cnt++] = data;
    }

    public int  pop() throws Empty
    {
        if (cnt == 0)
            throw new Empty();
        return (x[--cnt]);
    }

    public void peek() throws Empty
    {
        if (cnt == 0)
            throw new Empty();
        for (int i = 0; i < cnt; i++)
        {
            System.out.printf("%d ", x[i]);
        }
        System.out.printf("\n");
    }

    public int  getCnt()
    {
        return (cnt);
    }

    public int  getSize()
    {
        return (size);
    }
}
