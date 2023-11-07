package Furama.repositories.impl;

import Furama.models.Customer;
import Furama.models.Employee;
import Furama.repositories.ICustomerRepository;
import Furama.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String COMMA = ",";
    private final String FILE = "src/Furama/data/CustomerData.csv";
    @Override
    public List<Customer> getList() {
        List<String> list = ReadAndWrite.readFile(FILE);
        List<Customer> customers = convertToObject(list);
        return customers;
    }

    @Override
    public void add(Customer customer) {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        ReadAndWrite.writeFile(FILE, convertToString(customerList), true);
    }

    @Override
    public void edit(int id, Customer customer) {
        List<Customer> customerList = getList();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                customerList.get(i).getCode();
                customerList.get(i).setName(customer.getName());
                customerList.get(i).setBirthday(customer.getBirthday());
                customerList.get(i).setGender(customer.getGender());
                customerList.get(i).setIdCard(customer.getIdCard());
                customerList.get(i).setPhone(customer.getPhone());
                customerList.get(i).setEmail(customer.getEmail());
                customerList.get(i).setType(customer.getType());
                customerList.get(i).setAddress(customer.getAddress());
                ReadAndWrite.writeFile(FILE, convertToString(customerList), false);
            }
        }
    }

    @Override
    public void delete(int id) {
        List<Customer> customers = getList();
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                customers.remove(customer);
                ReadAndWrite.writeFile(FILE, convertToString(customers), false);
                break;
            }
        }
    }

    @Override
    public List<Customer> search(String name) {
        List<Customer> customers = getList();
        List<Customer> customerList = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getName().contains(name)) {
                customerList.add(customer);
            }
        }
        return customerList;
    }
    public List<Customer> convertToObject(List<String> stringList) {
        List<Customer> customerList = new ArrayList<>();
        String[] line;
        for (String str : stringList) {
            line = str.split(",");
            customerList.add(new Customer(Integer.parseInt(line[0]), line[1], line[2], line[3], line[4], Integer.parseInt(line[5]), Integer.parseInt(line[6]), line[7], line[8], line[9]));
        }
        return customerList;
    }
    public List<String> convertToString(List<Customer> employeeList) {
        List<String> stringList = new ArrayList<>();
        for (Customer employee : employeeList) {
            stringList.add(employee.getId() + COMMA +
                    employee.getCode() + COMMA +
                    employee.getName() + COMMA +
                    employee.getBirthday() + COMMA +
                    employee.getGender() + COMMA +
                    employee.getIdCard() + COMMA +
                    employee.getPhone() + COMMA +
                    employee.getEmail() + COMMA +
                    employee.getType() + COMMA +
                    employee.getAddress());
        }
        return stringList;
    }
}
