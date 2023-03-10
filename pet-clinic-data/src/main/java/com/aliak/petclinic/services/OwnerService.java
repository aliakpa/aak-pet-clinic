package com.aliak.petclinic.services;

import com.aliak.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName();
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
