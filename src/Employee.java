import java.util.Random;

public class Employee
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		
		// create instance of Random class
        Random rand = new Random();
   
        // Generate random integers in range 0 to 2 
        int attendance = rand.nextInt(3);
        
        final int Total_FullTime_working_Hours=160;
        final int Total_PartTime_working_Hours=80;
        final int Working_Days=20;
        final int WAGE_PER_HOUR = 20;
    	
    	final int Total_Working_Hours=100;
    	
    	int MonthlyWages=0;
    	
    	if(Working_Days==20 || Total_FullTime_working_Hours==100 || Total_PartTime_working_Hours==80)
    	{		
    		switch(attendance)
    		{
    		case 0:
    			System.out.println("Employee is Absent");
    			
    		case 1:
    			System.out.println("FullTime Employee");
    			MonthlyWages=Total_FullTime_working_Hours*WAGE_PER_HOUR;
    			System.out.println("Monthly Wage is:"+MonthlyWages );
    			
    		case 2:
    			System.out.println("PartTime Employee");
    			MonthlyWages=Total_PartTime_working_Hours*WAGE_PER_HOUR;;
    			System.out.println("Mothly Wage is:"+MonthlyWages );
    			
    		}
    	}
		
	}

}
