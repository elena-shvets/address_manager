package com.addresscrud.service.impl;

import com.addresscrud.model.Address;
import com.addresscrud.model.Phone;
import com.addresscrud.repository.PhoneRepository;
import com.addresscrud.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by elena on 09.10.15.
 */
@Service("phoneService")
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    PhoneRepository phoneRepository;

    @Override
    public Phone save(Phone phone) {
        return phoneRepository.save(phone);
    }

    @Override
    public Phone update(Phone phone) {
        return phoneRepository.update(phone);
    }

    @Override
    public void delete(Phone phone) {
        phoneRepository.delete(phone);

    }

    @Override
    public Phone findById(long id) {
        return phoneRepository.findById(id);
    }

    @Override
    public List<Phone> findAllByAddress(Address address) {
        return phoneRepository.findAllByAddress(address);
    }
}
