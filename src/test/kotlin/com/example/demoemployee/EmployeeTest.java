package com.example.demoemployee;


import com.example.demoemployee.model.Employee;
import com.example.demoemployee.model.EmployeeState;
import com.example.demoemployee.model.IEmployee;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class EmployeeTest {


    private EmployeeState employeeState;

    public void setUp() {

    }





    @Test
    public void createEmpTestFail(){

        EmployeeState employeeState = new EmployeeState();
        employeeState.setEmpId("12345");
        employeeState.setEmpName("BBB");
        employeeState.setEmpMailId("bbb@gmail.com");
        employeeState.setEmpMobile("9000090000");
        employeeState.setEmpSalary("80000");

       ArrayList<EmployeeState> empList = new ArrayList<>();
        empList.add(employeeState);

        EmployeeState employeeState2 = new EmployeeState();
        employeeState2.setEmpId("12345");
        employeeState2.setEmpName("BBB");
        employeeState2.setEmpMailId("bbb@gmail.com");
        employeeState2.setEmpMobile("9000090000");
        employeeState2.setEmpSalary("80000");


        IEmployee emp = new Employee();
        emp.createEmployee(employeeState);

        Assert.assertNotNull(emp);
    }


    @Test
    public void createEmployeeTestPass(){

        EmployeeState empState= new EmployeeState();

        empState.setEmpId("1212334");
        empState.setEmpName("AAA");
        empState.setEmpMobile("9989996666");
        empState.setEmpMailId("aaa@gmail.com");
        empState.setEmpSalary("100000");



    }




}
