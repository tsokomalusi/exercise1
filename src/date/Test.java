package date;

import java.util.Scanner;

public class Test {
	
	static Scanner console = new Scanner(System.in); 

	public static void main(String[] args) {
		
       Calendar calendar1 = new Calendar(5, 4, 2022);
       Calendar calendar2 = new Calendar();
       
       int date;
       int month;
       int year;
       
       System.out.print("Calender1: ");
       calendar1.printCalendar();
    
       
      // calendar2.setCalendar(1, 4, 2020);
       
       System.out.print("Enter the date: ");
       date = console.nextInt();
       System.out.print("Enter the month number: ");
       month = console.nextInt();
       System.out.print("Enter the year: ");
       year = console.nextInt();
      //System.out.println();
       System.out.print("Calender2: ");
       calendar2.setCalendar(date, month, year);
       calendar2.printCalendar();
     
       // comparing the calendars using the equals method
     
  
       if(calendar1.equals(calendar2))
    	   System.out.println("Both calendars are for the same year: " + calendar1.getYear());
       else
           System.out.println("The calendars represent different years!");
       
      calendar1.makeCopy(calendar2);
   
     if(calendar1.equals(calendar2))
     {
    	 System.out.println("Data copied successfully");
    	 calendar1.printCalendar();
     }
     else 
    	 
    	  System.out.println("Error! occured while copying the data");
    	
  
	}

}
