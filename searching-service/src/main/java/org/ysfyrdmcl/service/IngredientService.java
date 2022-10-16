package org.ysfyrdmcl.service;


import org.springframework.stereotype.Service;
import org.ysfyrdmcl.dto.request.NewIngredientDto;
import org.ysfyrdmcl.repository.IIngredientRepo;
import org.ysfyrdmcl.repository.entity.Ingredient;
import org.ysfyrdmcl.utility.ServiceManager;

@Service
public class IngredientService extends ServiceManager<Ingredient,Long> {
    private final IIngredientRepo iIngredientRepo;

    public IngredientService( IIngredientRepo iIngredientRepo) {
        super(iIngredientRepo);
        this.iIngredientRepo=iIngredientRepo;
    }
    public Ingredient createIngredient(NewIngredientDto dto){
        return save(Ingredient.builder()
                .name(dto.getName())
                .id(dto.getId())
                .type(dto.getType())
                .weight(dto.getWeight())
                .price(dto.getPrice())
                .createdDate(dto.getCreatedDate())
                .updatedDate(dto.getUpdatedDate())
                .build());
    }

}
