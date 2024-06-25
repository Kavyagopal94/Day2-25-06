import java.util.Random;

public class Employee
{
	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		// create instance of Random class
        Random rand = new Random();
   
        // Generate random integers in range 0 to 2 and 0 to 8 and 0 to 4
        int attendance = rand.nextInt(3);
        int Worked_Hours=rand.nextInt(9);
        int PartTime_worked_Hours=rand.nextInt(5);
        
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOUR = 8;
        final int PART_TIME_HOURS = 4;
		
		switch(attendance)
		{
		case 0:
			System.out.println("Employee Absent");
		case 1:
			System.out.println("FullTime Employee");
			int dailyWage=WAGE_PER_HOUR*Worked_Hours;
			System.out.println("Daily Wage is:"+dailyWage );
			
		case 2:
			System.out.println("PartTime Employee");
			int dailyWage1=WAGE_PER_HOUR*PartTime_worked_Hours;
			System.out.println("Daily Wage is:"+dailyWage1 );
			
		}
	}

}
