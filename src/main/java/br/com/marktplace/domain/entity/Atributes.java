package br.com.marktplace.domain.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Atributes extends BaseEntity {

    private String key;
    private String value;
}
