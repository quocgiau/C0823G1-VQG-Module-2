package Furama.services;

import Furama.models.Employee;

import java.util.List;

public interface IEmployeeServices {
    List<Employee> getList();

    boolean add(Employee employee);

    void edit(int id, Employee employee);

    void delete(int id);

    List<Employee> search(String name);
}
