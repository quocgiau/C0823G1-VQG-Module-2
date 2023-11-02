package Furama.services.impl;

import Furama.models.Employee;
import Furama.repositories.IEmployeeRepository;
import Furama.repositories.impl.EmployeeRepository;
import Furama.services.IEmployeeServices;

import java.util.List;

public class EmployeeServices implements IEmployeeServices {
    private IEmployeeRepository iEmployeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> getList() {
        return iEmployeeRepository.getList();
    }

    @Override
    public void add(Employee employee) {
        iEmployeeRepository.add(employee);
    }

    @Override
    public void edit(String id, Employee employee) {
        iEmployeeRepository.edit(id, employee);
    }

    @Override
    public void delete(String id) {
        iEmployeeRepository.delete(id);
    }

    @Override
    public List<Employee> search(String name) {
        return iEmployeeRepository.search(name);
    }
}
