package br.com.marktplace.domain.entity;

import br.com.marktplace.domain.enums.Status;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product extends BaseEntity {

    private String title;

    private  String longDescription;

    private String weight;

    private String height;

    private String width;

    private String urlImages;

    @OneToOne
    private Atributes atributes;

    @OneToOne(cascade = CascadeType.ALL)
    private Sku skus;

    @Enumerated(EnumType.ORDINAL)
    private Status status;

    @ManyToOne
    private Category category;

}
