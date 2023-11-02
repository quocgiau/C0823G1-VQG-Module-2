package Furama.repositories.impl;

import Furama.models.Employee;
import Furama.repositories.IEmployeeRepository;
import Furama.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    private final String COMMA = ",";
    private final String FILE = "src/Furama/data/EmployeeData.csv";

    @Override
    public List<Employee> getList() {
        List<String> list = ReadAndWrite.readFile(FILE);
        List<Employee> employees = convertToObject(list);
        return employees;
    }

    @Override
    public void add(Employee employee) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        ReadAndWrite.writeFile(FILE, convertToString(employeeList), true);
    }

    @Override
    public void edit(String id, Employee employee) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Employee> search(String name) {
        return null;
    }

    public List<Employee> convertToObject(List<String> stringList) {
        List<Employee> employeeList = new ArrayList<>();
        String[] line;
        for (String str : stringList) {
            line = str.split(",");
            employeeList.add(new Employee(Integer.parseInt(line[0]), line[1], line[2], line[3], line[4], Integer.parseInt(line[5]), Integer.parseInt(line[6]), line[7], line[8], line[9], Integer.parseInt(line[10])));
        }
        return employeeList;
    }

    public List<String> convertToString(List<Employee> employeeList) {
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringList.add(employee.getId() + COMMA +
                    employee.getCode() + COMMA +
                    employee.getName() + COMMA +
                    employee.getBirthday() + COMMA +
                    employee.getGender() + COMMA +
                    employee.getIdCard() + COMMA +
                    employee.getPhone() + COMMA +
                    employee.getEmail() + COMMA +
                    employee.getLevel() + COMMA +
                    employee.getLocation() + COMMA +
                    employee.getWage());
        }
        return stringList;
    }
}
