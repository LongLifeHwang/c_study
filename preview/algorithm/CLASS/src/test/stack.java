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
    int[]   x;
    int     count;

    public stack(int N) throws Empty
    {
        size = N;
        count = 0;
        try
        {
            x = new int[N];
        }
        catch(OutOfMemoryError e)
        {
            size = 0;
            throw new Empty();
        }
    }
    
    public int   push(int n) throws Over
    {
        if (count >= size)
            throw new Over();
        x[count++] = n;
        return (n);
    }

    public int  pop() throws Empty
    {
        if (count == 0)
            throw new Empty();
        return x[--count];
    }

    public int  getSize()
    {
        return (size);
    }

    public int  getIndex()
    {
        return (count);
    }

    public void  peek() throws Empty
    {
        if (count == 0)
            throw new Empty();
        for (int i = 0; i < count; i++)
            System.out.printf("%d ", x[i]);
    }
}
