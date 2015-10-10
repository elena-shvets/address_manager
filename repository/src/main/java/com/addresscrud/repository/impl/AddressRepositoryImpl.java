package com.addresscrud.repository.impl;

import com.addresscrud.model.Address;
import com.addresscrud.repository.AddressRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by elena on 08.10.15.
 */

@Repository
@Transactional
public class AddressRepositoryImpl implements AddressRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Address save(Address address) {
        entityManager.persist(address);
        return address;
    }

    @Override
    public Address update(Address address) {
        entityManager.merge(address);
        return address;
    }

    @Override
    public Address findOneById(long id) {
        return entityManager.find(Address.class, id);
    }

    @Override
    public List<Address> findAll() {
        Query query=entityManager.createQuery("from Address");
        return query.getResultList();
    }

    @Override
    public void delete(Address address) {
        Address removingAddress = entityManager.find(Address.class, address.getId());
        entityManager.remove(removingAddress);
    }

    @Override
    public Address findByStreet(String street) {
        return entityManager.find(Address.class, street);
    }
}
