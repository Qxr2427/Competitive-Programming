import java.awt.*;
import java.io.Console;
import hsa.*;


public class test
{
    static Console c;

    public static void main (String [] args)
    {
    c = new Console ();
    int club [] = new int [32];
    int dis, n, ans;

    

    dis = fi.readInt ();
    n = fi.readInt ();
    for (int i = 0 ; i < n ; i++)
        club [i] = fi.readInt ();
    ans = solve (dis, club, n);
    if (ans == -1)
    {
        fo.println ("Roberta acknowledges defeat.");
        c.println ("Roberta acknowledges defeat.");
    }
    else
    {
        fo.println ("Roberta wins in " + ans + " strokes.");
        c.println ("Roberta wins in " + ans + " strokes.");
    }
    }


    public static int solve (int distance, int [] club, int n)
    {
    int [] f;
    int min, t;

    f = new int [distance + 1];

    f [0] = 0;

    for (int x = 1 ; x <= distance ; x++)
    {
        min = 999999999;
        for (int j = 0 ; j < n ; j++)
        {
        t = x - club [j];
        if (t >= 0 && f [t] >= 0 && f [t] < min)
            min = f [t];
        }
        if (min < 999999999)
        f [x] = min + 1;
        else
        f [x] = -1;
    }
    return f [distance];
    }
}

