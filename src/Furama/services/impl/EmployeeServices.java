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
    public boolean add(Employee employee) {
        return iEmployeeRepository.add(employee);
    }

    @Override
    public void edit(int id, Employee employee) {
        iEmployeeRepository.edit(id, employee);
    }

    @Override
    public void delete(int id) {
        iEmployeeRepository.delete(id);
    }

    @Override
    public List<Employee> search(String name) {
        return iEmployeeRepository.search(name);
    }
}
