package br.com.marktplace.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    ACTIVE(0, "Active"),
    DISABLED(1, "Disabled");

    private Integer id;
    private String name;
}
