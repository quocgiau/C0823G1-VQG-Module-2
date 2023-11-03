package Furama.services.impl;

import Furama.models.Customer;
import Furama.repositories.ICustomerRepository;
import Furama.repositories.impl.CustomerRepository;
import Furama.services.ICustomerServices;

import java.util.List;

public class CustomerServices implements ICustomerServices {
    private ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public List<Customer> getList() {
        return iCustomerRepository.getList();
    }

    @Override
    public void add(Customer customer) {
        iCustomerRepository.add(customer);
    }

    @Override
    public void edit(String id, Customer customer) {
        iCustomerRepository.edit(id,customer);
    }

    @Override
    public void delete(String id) {
        iCustomerRepository.delete(id);
    }

    @Override
    public List<Customer> search(String name) {
        return iCustomerRepository.search(name);
    }
}
