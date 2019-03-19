package com.example.demoemployee;


import com.example.demoemployee.model.Employee;
import com.example.demoemployee.model.EmployeeList;
import com.example.demoemployee.model.EmployeeState;
import com.example.demoemployee.model.IEmployee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {



    List<EmployeeState> oldEmpStateList;

    @Before
    public void init(){

        EmployeeState emp1= createEmployee("112","AAA","8179170688","rameshshaka@gmail.com","12000");
        EmployeeState emp2 =createEmployee("113","BBB","8179170600","ramesh@gmail.com","12000");
        oldEmpStateList = new ArrayList<>();

        oldEmpStateList.add(emp1);
        oldEmpStateList.add(emp2);


    }

    private EmployeeState createEmployee(String empId, String empName, String empMobile, String empMailId, String empSalary){

        EmployeeState employeeState = new EmployeeState();
        employeeState.setEmpId(empId);
        employeeState.setEmpName(empName);
        employeeState.setEmpMobile(empMobile);
        employeeState.setEmpSalary(empSalary);
        employeeState.setEmpMailId(empMailId);

        return employeeState;
    }





    @Test
    public void createEmployeeListTestPass() {
        EmployeeState employeeState = new EmployeeState();
        employeeState.setEmpId("12345");
        employeeState.setEmpName("AAA");

        List<EmployeeState> newEmpList = new ArrayList<>();
        newEmpList.add(employeeState);


        Map<String, EmployeeState> oldEmpMap = this.oldEmpStateList.
                stream().collect(Collectors.toMap(x -> x.getEmpId(), x -> x));



        EmployeeList employeeList = new EmployeeList(this.oldEmpStateList);
        employeeList.createListOfEmployees(newEmpList);



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


}
