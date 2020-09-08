package SalaryCalc;

public class SalaryCalculator implements SalaryCalculatorInterface {


    public double calculateSalary(){
        double pay = 0;
        if (Employee.getNumberOfHoursWorked() > 40){
            double overtimePay = (Employee.getNumberOfHoursWorked()/2) * hourlyRate;
            pay = (hourlyRate * Employee.getNumberOfHoursWorked()) + overtimePay;
        }
        else{
            pay = hourlyRate * Employee.getNumberOfHoursWorked();
        }
        return pay;
    }
}
