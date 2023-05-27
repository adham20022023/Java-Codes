package stopwatch;
public class Stopwatch {
    private long StartTime=System.currentTimeMillis();
    private long EndTime=StartTime;
      Stopwatch()
     {
     }
    long get_start_time()
    {
        return StartTime;
    }
    long get_end_time()
    {
        return EndTime;
    }
    void start()
    {
        StartTime=System.currentTimeMillis();
    }
    void end()
    {
        EndTime=System.currentTimeMillis();
    }
    long getElapsedTime()
    {
        return EndTime-StartTime;
    }

    public static void main(String[] args) {
        Stopwatch s=new Stopwatch();
        s.start();
           /*for (int i = 0; i < 10000; i++) 
               System.out.println(".");
           System.out.println("");
*/
              s.end();
               System.out.println("Time Token:"+s.getElapsedTime());
        
    }
    
}
