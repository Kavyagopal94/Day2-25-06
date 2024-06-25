import java.util.Random;

public class Employee
{
	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		// create instance of Random class
         Random rand = new Random();
   
        // Generate random integers in range 0 to 2 and 0 to 8
        int attendance = rand.nextInt(3);
        int Worked_Hours=rand.nextInt(9);
        
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOUR = 8;
		
		if(attendance==1)
		{
			System.out.println("Employee is present");
			int dailyWage=WAGE_PER_HOUR*Worked_Hours;
			System.out.println("Daily Wage is:"+dailyWage );
			
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}

}
