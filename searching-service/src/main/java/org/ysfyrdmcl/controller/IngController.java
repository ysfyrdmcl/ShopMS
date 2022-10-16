package org.ysfyrdmcl.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ysfyrdmcl.dto.request.NewIngredientDto;
import org.ysfyrdmcl.service.IngredientService;

import javax.validation.Valid;
@RequiredArgsConstructor
@RestController
@RequestMapping("/search_service")
public class IngController {
    private final IngredientService ingredientService;


    @PostMapping("/register")
    public ResponseEntity<Boolean> newIngredient(@RequestBody @Valid NewIngredientDto dto){
        try{
            ingredientService.createIngredient(dto);
            return ResponseEntity.ok().body(true);
        }
        catch (Exception e){
           e.getMessage();
           return ResponseEntity.badRequest().build();
        }
    }
}
