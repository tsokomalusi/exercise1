package date;

public class Calendar {
	
	private int year;
	private int month;
	private int date;
	
	
	public Calendar()  {
		
		year  = 1;
		month = 1;
		date  = 1;
		
	} 
	
	public Calendar(int dt, int mon, int yr)  {
		
		if( 0 < dt && dt <= 31 )
			date = dt;
	
		else
			System.out.println("Error, invalid value for the date.");
			
		
		if( 0 < mon && mon <= 12)
			month = mon;
		else
			System.out.println("Error!, invalid value for the month.");
			
		
		if( 0 < yr && yr <= 2022)
			year = yr;
		else
			System.out.println("Error!, invalid value for the year");
		
		//definition of setTime is the same as constructor with parameters, alternative
		
		// setCalendar(yr, mon, dt);	
		
	}
	
	public void setCalendar(int dt, int mon, int yr) 
	{
		if( 0 < dt && dt <= 31 )
			date = dt;
	
		else
			System.out.println("Error, Date cannot be zero");
			
		
		if( 0 < month && month <= 12)
			month = mon;
		else
			System.out.println("Error!, Month value cannot be zero");
			
		
		if( 0 < yr && yr <= 2022)
			year = yr;
		else
			System.out.println("Error!, invalid value for the year");
	}
	
	 public int getYear()   {
		 
		 return year;
	 }
	
	 public int getMonth()  {
		 
		 return month;
	 }
	 
	 public int getDate()  {
		 
		 return date;
	 }
	 
	 public void printCalendar()  {
		 
		     if(date < 10)
		     System.out.print("0");
		     System.out.print(date + "/");
		     
		     if(month < 10)
		     System.out.print("0");
		     System.out.print(month + "/");
		     
		     if(year == 1)
		     System.out.print("000");
		     System.out.println(year);
	 }
	 
	 public boolean equals(Calendar otherCalendar) {
		 
		 return ( date == otherCalendar.date 
				  && month == otherCalendar.month
				  && year == otherCalendar.year);
	 }
	 
	 public void makeCopy(Calendar otherCalendar) {
		 
		 date  = otherCalendar.date;
		 month = otherCalendar.month;
		 year  = otherCalendar.year;
		 
	 }
	 
	 public Calendar getCopy() {
		 
		 Calendar temp = new Calendar();
		 
		 temp.date = date;
		 temp.month = month;
		 temp.year = year;
		 
		 return temp;
		 
	 }
	 
}
