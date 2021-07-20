package br.com.marktplace.domain.entity;

import br.com.marktplace.domain.enums.Status;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Sku extends BaseEntity{

    private String title;
    private Status status;
    private String urlImages;

    @OneToMany
    private List<Variant> variants = new ArrayList<>();

}
