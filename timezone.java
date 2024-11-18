import java.util.Scanner;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.io.*;

public class timezone{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("~~~TIMEZONE~~~");
        System.out.println("Enter the designation of required Time Zone\nIn the format of :\nContinent/capital...\nFor example:- Asia/Kolkata");
        System.out.println("Please enter one: ");
        String place=sc.nextLine();
        LocalTime t=LocalTime.now(ZoneId.of(place));
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Current time in the designation is: "+t.format(dt));
    }
}
