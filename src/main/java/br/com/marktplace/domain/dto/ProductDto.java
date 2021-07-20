package br.com.marktplace.domain.dto;

import br.com.marktplace.domain.enums.Status;
import lombok.Data;

@Data
public class ProductDto {

    private String title;

    private String longDescription;

    private String weight;

    private String height;

    private String width;

    private String urlImages;

    private AtributesDto atributes;

    private SkuDto skus;

    private Status status;

    private String idCategory;
}
