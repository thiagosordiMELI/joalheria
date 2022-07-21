package com.joalheria.joalheria.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class JoiaDTO {
    private String material;
    private float peso;
    private float quilates;
}
