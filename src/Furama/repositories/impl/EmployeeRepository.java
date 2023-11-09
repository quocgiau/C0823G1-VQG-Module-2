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
    public boolean add(Employee employee) {
        List<Employee> employees = getList();
        for (Employee employee1 : employees) {
            if (employee.getId() == employee1.getId()) {
                return false;
            }
        }
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        ReadAndWrite.writeFile(FILE, convertToString(employeeList), true);
        return true;
    }

    @Override
    public void edit(int id, Employee employee) {
        List<Employee> employeeList = getList();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employeeList.get(i).getCode();
                employeeList.get(i).setName(employee.getName());
                employeeList.get(i).setBirthday(employee.getBirthday());
                employeeList.get(i).setGender(employee.getGender());
                employeeList.get(i).setIdCard(employee.getIdCard());
                employeeList.get(i).setPhone(employee.getPhone());
                employeeList.get(i).setEmail(employee.getEmail());
                employeeList.get(i).setLevel(employee.getLevel());
                employeeList.get(i).setLocation(employee.getLocation());
                employeeList.get(i).setWage(employee.getWage());
                ReadAndWrite.writeFile(FILE, convertToString(employeeList), false);
            }
        }
    }

    @Override
    public void delete(int id) {
        List<Employee> employees = getList();
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                ReadAndWrite.writeFile(FILE, convertToString(employees), false);
                break;
            }
        }
    }

    @Override
    public List<Employee> search(String name) {
        List<Employee> employeeList = getList();
        List<Employee> employeeList1 = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getName().contains(name)) {
                employeeList1.add(employee);
            }
        }
        return employeeList1;
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
