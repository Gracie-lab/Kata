package SalaryCalc;

class Employee {
    private static int numberOfHoursWorked;
    private double hourlyRate;

    public Employee(){

    }
    public Employee(int numberOfHoursWorked){
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public static int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
