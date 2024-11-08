import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.ZoneId;
import java.io.*;

class project24{
    public static void current_time()
    {
        LocalTime t=LocalTime.now(ZoneId.of("Asia/Kolkata"));
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("YOUR CURRENT TIME IS: "+t.format(dt));
    }
    public static void timer()
    {
        try{
            Scanner s=new Scanner(System.in);
            System.out.println("ENTER THE SECONDS FOR COUNTDOWN: ");
            int c=s.nextInt();
            for(int i=c;i>=0;i--)
            {
                System.out.println("Time left: "+i+"Seconds");
                Thread.sleep(1000);
            }
            System.out.println("Times UP!!!");
        }
        catch(InterruptedException e){
            System.out.println("An interuption occured!!!");
        }
    }
    public static void stopwatch()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Press Enter to start the stopwatch...");
        s.nextLine();
        s.nextLine();
        long start = System.currentTimeMillis();
        System.out.println("Stopwatch initiated...\nPress Enter again to stop.");
        s.nextLine();
        long end = System.currentTimeMillis();
        long diff = end - start;

        long sec = (diff / 1000) % 60;
        long min = (diff / (1000 * 60)) % 60;
        long hrs = (diff / (1000 * 60 * 60)) % 24;

        System.out.printf("Elapsed time: %d:%d:%d\n", hrs, min, sec);
    }
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("WELCOME TO PROJECT24");
            System.out.println("====================");
            System.out.println("1.GET CURRENT TIME\n2.INITIATE A TIMER\n3.INITIATE A STOPWATCH\n4.EXIT");
            System.out.println("ENTER YOUR OPTION: ");
            int ch=s.nextInt();
            switch(ch)
            {
                case 1:
                    current_time();
                    break;
                case 2:
                    timer();
                    break;
                case 3:
                    stopwatch();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
}