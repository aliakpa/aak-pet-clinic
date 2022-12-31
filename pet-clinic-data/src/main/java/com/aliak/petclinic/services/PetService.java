package com.aliak.petclinic.services;

import com.aliak.petclinic.model.Owner;
import com.aliak.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Owner pet);
    Set<Pet> findAll();
}
