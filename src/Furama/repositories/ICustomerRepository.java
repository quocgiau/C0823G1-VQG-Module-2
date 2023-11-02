package Furama.repositories;

import java.util.Currency;
import java.util.List;

public interface ICustomerRepository {
    List<Currency> getList();

    void add(Currency employee);

    void edit(String id, Currency employee);

    void delete(String id);

    List<Currency> search(String name);
}
