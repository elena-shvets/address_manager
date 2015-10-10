package com.addresscrud.service.impl;


import com.addresscrud.model.Address;
import com.addresscrud.repository.AddressRepository;
import com.addresscrud.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by elena on 08.10.15.
 */
@Service("addressService")
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Override
    public Address save(Address address) {
       return addressRepository.save(address);
    }

    @Override
    public Address update(Address address) {
        return addressRepository.update(address);
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address findOneById(long id) {
        return addressRepository.findOneById(id);
    }


    @Override
    public void delete(Address address) {
        addressRepository.delete(address);

    }

    @Override
    public Address findByStreet(String street) {
        return addressRepository.findByStreet(street);
    }
}
