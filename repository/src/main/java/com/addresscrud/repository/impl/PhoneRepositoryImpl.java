package com.addresscrud.repository.impl;

import com.addresscrud.model.Address;
import com.addresscrud.model.Phone;
import com.addresscrud.repository.PhoneRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by elena on 08.10.15.
 */

@Repository
@Transactional
public class PhoneRepositoryImpl implements PhoneRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Phone save(Phone phone) {
        entityManager.persist(phone);
        return phone;
    }

    @Override
    public Phone update(Phone phone) {
        entityManager.merge(phone);
        return phone;
    }

    @Override
    public void delete(Phone phone) {
        Phone removingPhone = entityManager.find(Phone.class, phone);
        entityManager.remove(removingPhone);

    }

    @Override
    public Phone findById(long id) {
        return entityManager.find(Phone.class, id);
    }

    @Override
    public List<Phone> findAllByAddress(Address address) {
        List<Phone> phones = entityManager.createQuery("from Phone ph where ph.address=:address")
                .setParameter("address", address)
                .getResultList();
        return phones;
    }
}
