package br.com.marktplace.domain.dto;

import br.com.marktplace.domain.enums.Status;
import lombok.Data;

import java.util.List;

@Data
public class SkuDto {

    private String title;
    private Status status;
    private String urlImages;
    private List<VariantDto> variants;
}
