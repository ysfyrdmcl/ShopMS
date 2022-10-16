package org.ysfyrdmcl.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "tblsearch")
public class Ingredient {
    @Id
    String id;
    private String name;
    private String type;
    private String price;
    private String weight;
    private Long createdDate;
    private Long updatedDate;

}
