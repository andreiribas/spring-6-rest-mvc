package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.Beer;
import guru.springframework.spring6restmvc.model.BeerStyle;
import guru.springframework.spring6restmvc.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by jt, Spring Framework Guru.
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private Map<UUID, Customer> customerMap;

    public CustomerServiceImpl() {
        this.customerMap = new HashMap<>();

        var customer1 = Customer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .customerName("First Customer")
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        var customer2 = Customer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .customerName("Second Customer")
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        var customer3 = Customer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .customerName("Third Customer")
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        customerMap.put(customer1.getId(), customer1);
        customerMap.put(customer2.getId(), customer2);
        customerMap.put(customer3.getId(), customer3);
    }

    @Override
    public List<Customer> listCustomers(){
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Customer getCustomerById(UUID id) {

        log.debug("Get Customer by Id - in service. Id: " + id.toString());

        return customerMap.get(id);
    }
}
