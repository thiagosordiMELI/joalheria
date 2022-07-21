package com.joalheria.joalheria.service;

import com.joalheria.joalheria.dto.JoiaDTO;
import com.joalheria.joalheria.model.Joia;

import java.util.List;

public interface IJoiaService {

    List<Joia> getJoias();
    long saveJoia(JoiaDTO joia);
    long saveJoia(Joia joia);
    void deleteJoia(long id);
    Joia findJoia(long id);
}
