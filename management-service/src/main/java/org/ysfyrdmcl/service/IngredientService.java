package org.ysfyrdmcl.service;


import org.springframework.stereotype.Service;
import org.ysfyrdmcl.dto.request.NewIngredientDto;
import org.ysfyrdmcl.dto.request.RegisterRequestDto;
import org.ysfyrdmcl.manager.IIngredientManager;
import org.ysfyrdmcl.repository.IIngredientRepo;
import org.ysfyrdmcl.repository.entity.Ingredient;
import org.ysfyrdmcl.utility.ServiceManager;

import java.util.Date;
import java.util.Optional;

@Service
public class IngredientService extends ServiceManager<Ingredient,Long> {
    private final IIngredientRepo iIngredientRepo;
    private final IIngredientManager iIngredientManager;
    public IngredientService(IIngredientRepo iIngredientRepo,IIngredientManager iIngredientManager) {
        super(iIngredientRepo);
        this.iIngredientRepo=iIngredientRepo;
        this.iIngredientManager=iIngredientManager;
    }
    public void deleteByName(String name){
        iIngredientRepo.deleteByName(name);
    }
    public Ingredient findByName(String name){
      return  iIngredientRepo.findByName(name);
    }
    public void register(RegisterRequestDto dto){
        Ingredient ingredient;
        ingredient = Ingredient.builder()
                .name(dto.getName())
                .type(dto.getType())
                .price(dto.getPrice())
                .weight(dto.getWeight())
                .createdDate(new Date(System.currentTimeMillis()).getTime())
                .build();
        save(ingredient);
        iIngredientManager.CreateNewIngredient(NewIngredientDto.builder()
                        .id(ingredient.getId())
                        .weight(ingredient.getWeight())
                        .type(ingredient.getType())
                        .price(ingredient.getPrice())
                        .createdDate(ingredient.getCreatedDate())
                        .name(ingredient.getName())
                .build());
    }


}
