package Furama.controllers;

import Furama.models.Employee;
import Furama.services.IEmployeeServices;
import Furama.services.impl.EmployeeServices;

import java.util.List;

public class EmployeeController {
    private IEmployeeServices iEmployeeServices = new EmployeeServices();

    public List<Employee> getList() {
        return iEmployeeServices.getList();
    }

    public void add(Employee employee) {
        iEmployeeServices.add(employee);
    }

    public void edit(String id, Employee employee) {
        iEmployeeServices.edit(id, employee);
    }


    public void delete(String id) {
        iEmployeeServices.delete(id);
    }

    public List<Employee> search(String name) {
        return iEmployeeServices.search(name);
    }
}
