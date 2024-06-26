import java.util.Random;

public class Employee
{
	public static void main(String[] args) 
	{ final int WAGE_PER_HOUR = 20;
	        final int WORKING_DAYS_IN_MONTH = 20;

	        int totalWorkingHours = 0;
	        int totalWages = 0;

	        for (int day = 1; day <= WORKING_DAYS_IN_MONTH; day++) {
	            int dailyHours = 0;

	            // Simulate different working hours using switch case
	            int attendance = (int) (Math.random() * 3); // Randomly choose between 0, 1, 2
	            switch (attendance) {
	                case 0:
	                    dailyHours = 0; // 0 hours absent
	                    break;
	                case 1:
	                    dailyHours = 4; // 4 hours for part-time
	                    break;
	                case 2:
	                    dailyHours = 8; // 8 hours for full-time
	                    break;
	            }

	            totalWorkingHours += dailyHours;
	            totalWages += dailyHours * WAGE_PER_HOUR;

	            System.out.println("Day#: " + day + " Hours Worked: " + dailyHours + " Total Hours: " + totalWorkingHours);
	        }

	        System.out.println("Total Working Days: " + WORKING_DAYS_IN_MONTH);
	        System.out.println("Total Working Hours: " + totalWorkingHours);
	        System.out.println("Total Wages: " + totalWages);
	}

}
