package com.example.demoemployee.model;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeList {

     List<EmployeeState> employeeStateList;

   public EmployeeList(List<EmployeeState> employeeStates){
        this.employeeStateList =employeeStates;
    }



    public Boolean createListOfEmployees(List<EmployeeState> employeeStates){

        Map<String,EmployeeState> map = employeeStateList.stream().
                collect(Collectors.toMap(x->x.getEmpId(), x->x));


        return true;
    }


}
