package Furama.services;

import Furama.models.Employee;

import java.util.List;

public interface IEmployeeServices {
    List<Employee> getList();

    void add(Employee employee);

    void edit(String id, Employee employee);

    void delete(String id);

    List<Employee> search(String name);
}
