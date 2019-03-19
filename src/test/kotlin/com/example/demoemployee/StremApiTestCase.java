package com.example.demoemployee;

import com.example.demoemployee.model.EmployeeList;
import com.example.demoemployee.model.EmployeeState;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StremApiTestCase {


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
}
