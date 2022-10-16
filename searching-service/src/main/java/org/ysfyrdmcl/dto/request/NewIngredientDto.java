package org.ysfyrdmcl.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class NewIngredientDto {
    String id;
    private String name;
    private String type;
    private String price;
    private String weight;
    private Long createdDate;
    private Long updatedDate = new Date(System.currentTimeMillis()).getTime();
}
