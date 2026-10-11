
package com.example.employee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testGrossSalary() {
        Employee emp = new Employee(
                101,
                "Neha",
                "Software Developer",
                50000);

        assertEquals(65000.0, emp.calculateGrossSalary(), 0.001);
    }
}
