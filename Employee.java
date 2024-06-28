import java.util.Random;

public class Employee {
    // Class variables
    private static final int WAGE_PER_HOUR = 20;
    private static final int MAX_HOURS_IN_MONTH = 100;
    private static final int MAX_WORKING_DAYS = 20;

    // Instance variables
    private int totalWorkingHours;
    private int totalWorkingDays;
    private int totalWages;

    // Constructor
    public Employee()
    {
        this.totalWorkingHours = 0;
        this.totalWorkingDays = 0;
        this.totalWages = 0;
    }
    
    public int getTotalWorkingHours() {
        return totalWorkingHours;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public int getTotalWages() {
        return totalWages;
    }
    
    public void ComputeWages()
    {
    	while (totalWorkingHours <= MAX_HOURS_IN_MONTH && totalWorkingDays < MAX_WORKING_DAYS) {
            totalWorkingDays++;
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

            System.out.println("Day " + totalWorkingDays + ": Hours Worked " + dailyHours + " : Total Hours: " + totalWorkingHours);
        }
    }
    
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.ComputeWages();
        
        System.out.println("Total Working Days: " + employee.getTotalWorkingDays());
        System.out.println("Total Working Hours: " + employee.getTotalWorkingHours());
        System.out.println("Total Wages: " + employee.getTotalWages());
    }
}
