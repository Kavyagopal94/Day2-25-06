import java.util.Random;

public class Employee
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		
		// create instance of Random class
        Random rand = new Random();
   
        // Generate random integers in range 0 to 2 and 0 to 8 and 0 to 4 and 0 to 19
        int attendance = rand.nextInt(3);
       
        final int Working_Days=20 ;
        final int WAGE_PER_HOUR = 20;
        final int FULL_TIME_HOUR = 8;
        final int PART_TIME_HOUR = 4;
        
    	int MonthlyWages=0;
    	int dailyWage=0;
		
		
		switch(attendance)
		{
		case 0:
			System.out.println("Employee Absent");
		case 1:
			System.out.println("FullTime Employee");
			dailyWage=WAGE_PER_HOUR*FUll_TIME_HOUR;
			MonthlyWages=dailyWage*Working_Days;
			System.out.println("Monthly Wage is:"+MonthlyWages );
			
		case 2:
			System.out.println("PartTime Employee");
			dailyWage=WAGE_PER_HOUR*PART_TIME_HOUR;
			MonthlyWages=dailyWage*Working_Days;
			System.out.println("Mothly Wage is:"+MonthlyWages );
			
		}
	}

}
