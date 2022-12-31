package com.aliak.petclinic.services;

import com.aliak.petclinic.model.Owner;
import com.aliak.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Owner vet);
    Set<Vet> findAll();
}
