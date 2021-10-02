import java.time.*;
import java.util.*;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class BirthCalculator {
	 
public static void main(String[] args){
   GregorianCalendar time = new GregorianCalendar();
	   int hour = time.get(Calendar.HOUR_OF_DAY);
		   
	   
//input 	   
System.out.print("Enter name: ");
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
System.out.print("Please enter date of birth in YYYY-MM-DD: ");
String input = scanner.nextLine();
scanner.close();
	    
	        // date of birth
	        LocalDate pdate = LocalDate.parse(input);
	        // current date
	        LocalDate now = LocalDate.now();
	        // difference between current date and date of birth
	        Period diff = Period.between(pdate, now);
	        
	        //hold the greeting based on curent time
	        String greet;
	        		
	        //condition on current time
	        if (hour < 12)
	        greet="Good Morning ";
	        else if (hour < 17 && !(hour == 12))
	         greet="Good Afternoon ";
	        else if (hour == 12)
	         greet="Good Noon ";
	        else
	         greet="Good Evening ";
	        	 
	        //output
	       System.out.println("\n"+ greet + name);
	       System.out.printf("You are %d years and %d months old.", 
	                    diff.getYears(), diff.getMonths());
	   }
	}