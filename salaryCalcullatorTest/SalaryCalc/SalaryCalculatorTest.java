package SalaryCalc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {
    SalaryCalculator calculator;
    Employee employee;
    @BeforeEach
    void setUp() {
        calculator = new SalaryCalculator();
        employee = new Employee();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void employeeTest(){
        Employee newEmployee = new Employee(20);
    }
    @Test
    void calculateSalaryTest(){
        Employee newEmployee = new Employee(20);
        assertEquals(200, calculator.calculateSalary());
//        System.out.println(calculator.calculateSalary());
    }

    @Test
    void calculateOvertimeSalary(){
        Employee newEmployee = new Employee(50);
        assertEquals(750, calculator.calculateSalary());
//        System.out.println(calculator.calculateSalary());
    }

}