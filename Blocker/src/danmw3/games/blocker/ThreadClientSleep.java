package danmw3.games.blocker;

public class ThreadClientSleep extends Thread
{
    /** A reference to the Blocker object. */
    final Blocker mc;

    public ThreadClientSleep(Blocker par1Blocker, String par2Str)
    {
        super(par2Str);
        this.mc = par1Blocker;
    }

    public void run()
    {
        while (this.mc.gameRunning)
        {
            try
            {
                Thread.sleep(2147483647L);
            }
            catch (InterruptedException var2)
            {
                ;
            }
        }
    }
}
