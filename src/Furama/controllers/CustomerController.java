package Furama.controllers;

import Furama.models.Customer;
import Furama.services.ICustomerServices;
import Furama.services.impl.CustomerServices;

import java.util.List;

public class CustomerController {
    private ICustomerServices iCustomerServices = new CustomerServices();
    public List<Customer> getList(){
        return iCustomerServices.getList();
    }
    public void add(Customer employee) {
        iCustomerServices.add(employee);
    }

    public void edit(int id, Customer employee) {
        iCustomerServices.edit(id, employee);
    }


    public void delete(int id) {
        iCustomerServices.delete(id);
    }

    public List<Customer> search(String name) {
        return iCustomerServices.search(name);
    }
}
