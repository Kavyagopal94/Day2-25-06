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
        int FullTime_worked_Hours=rand.nextInt(9);
        int PartTime_worked_Hours=rand.nextInt(5);
        int Worked_Days=rand.nextInt(21);
        
        final int WAGE_PER_HOUR = 20;
        final int FULL_TIME_HOUR = 8;
        final int PART_TIME_HOURS = 4;
        
    	int MonthlyWages=0;
    	int dailyWage=0;
		
		
		switch(attendance)
		{
		case 0:
			System.out.println("Employee Absent");
		case 1:
			System.out.println("FullTime Employee");
			dailyWage=WAGE_PER_HOUR*FullTime_worked_Hours;
			MonthlyWages=dailyWage*Worked_Days;
			System.out.println("Monthly Wage is:"+MonthlyWages );
			
		case 2:
			System.out.println("PartTime Employee");
			dailyWage=WAGE_PER_HOUR*PartTime_worked_Hours;
			MonthlyWages=dailyWage*Worked_Days;
			System.out.println("Mothly Wage is:"+MonthlyWages );
			
		}
	}

}
