package org.ysfyrdmcl.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.ysfyrdmcl.dto.request.RegisterRequestDto;
import org.ysfyrdmcl.repository.entity.Ingredient;
import org.ysfyrdmcl.service.IngredientService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/management_service")
@RequiredArgsConstructor
public class IngredientController {
    private final IngredientService ingredientService;

    @PostMapping("/register")
    public ResponseEntity<Void> registerIngredient(@RequestBody @Valid RegisterRequestDto dto){
        ingredientService.register(dto);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/findall")
    public ResponseEntity<List<Ingredient>>findAllIngredient(){
        return ResponseEntity.ok(ingredientService.findAll());
    }
    @PostMapping("/findByName")
    public ResponseEntity <Ingredient>findByName(String name){
        return ResponseEntity.ok(ingredientService.findByName(name));
    }
    @PostMapping("/delete")
    public ResponseEntity<Void> delete(@RequestParam @Valid String name){
        ingredientService.deleteByName(name);
        return ResponseEntity.ok().build();
    }
}
