package com.addresscrud.service;


import com.addresscrud.model.Address;

import java.util.List;

/**
 * Created by elena on 08.10.15.
 */

public interface AddressService {

    Address save(Address address);
    Address update(Address address);
    List<Address> findAll();
    Address findOneById(long id);
    void delete(Address address);
    Address findByStreet(String street);

}
