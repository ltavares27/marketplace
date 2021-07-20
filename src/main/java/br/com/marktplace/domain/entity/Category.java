package br.com.marktplace.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Category extends BaseEntity{

    private String name;

    @ManyToOne
    private Category fatherCategory;
}
