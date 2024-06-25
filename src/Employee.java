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
        
        final int Working_Hours=8;
        final int WAGE_PER_HOUR = 20;
        
		
		if(attendance==1)
		{
			System.out.println("Employee is present");
			int dailyWage=WAGE_PER_HOUR*Working_Hours;
			System.out.println("Daily Wage is:"+dailyWage );
			
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}

}
