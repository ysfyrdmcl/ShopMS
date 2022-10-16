package org.ysfyrdmcl.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.ysfyrdmcl.repository.entity.Ingredient;

import java.util.Optional;

@Repository
public interface IIngredientRepo extends MongoRepository<Ingredient,Long> {

}
