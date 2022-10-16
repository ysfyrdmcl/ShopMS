package org.ysfyrdmcl.manager;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.ysfyrdmcl.dto.request.NewIngredientDto;

import javax.validation.Valid;
@FeignClient(url = "${SEARCHURL}/search_service",name = "searching-service",decode404 = true)
public interface IIngredientManager {
    @PostMapping("/register")
    ResponseEntity<Void>CreateNewIngredient(@RequestBody @Valid NewIngredientDto dto);
}
