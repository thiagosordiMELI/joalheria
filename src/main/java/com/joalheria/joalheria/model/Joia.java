package com.joalheria.joalheria.model;

import com.joalheria.joalheria.dto.JoiaDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
public class Joia {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(nullable = false, length = 255)
    private String material;

    @Column(nullable = false)
    private float peso;

    @Column(nullable = false)
    private float quilates;

    public Joia(JoiaDTO joia){
        this.material = joia.getMaterial();
        this.peso = joia.getPeso();
        this.quilates = joia.getQuilates();
    }
}
