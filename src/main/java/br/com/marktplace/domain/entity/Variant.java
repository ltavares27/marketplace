package br.com.marktplace.domain.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Variant extends BaseEntity {

    private String value;
}
