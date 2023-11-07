package Furama.repositories;

import Furama.models.Customer;

import java.util.Currency;
import java.util.List;

public interface ICustomerRepository {
    List<Customer> getList();

    void add(Customer customer);

    void edit(int id, Customer customer);

    void delete(int id);

    List<Customer> search(String name);
}
