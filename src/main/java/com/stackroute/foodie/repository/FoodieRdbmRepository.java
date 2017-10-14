package com.stackroute.foodie.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import com.stackroute.foodie.model.FoodieModel;

@Repository

public interface FoodieRdbmRepository extends CrudRepository<FoodieModel,String> {

}
