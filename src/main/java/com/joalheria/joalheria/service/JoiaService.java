package com.joalheria.joalheria.service;

import com.joalheria.joalheria.dto.JoiaDTO;
import com.joalheria.joalheria.model.Joia;
import com.joalheria.joalheria.repository.IJoiaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JoiaService implements IJoiaService {

    private final IJoiaRepository joiaRepository;

    public JoiaService(IJoiaRepository joiaRepository) {
        this.joiaRepository = joiaRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Joia> getJoias() {
        List<Joia> joias = joiaRepository.findAll();
        return joias;
    }

    @Override
    @Transactional
    public long saveJoia(JoiaDTO joia) {
        return joiaRepository.save(new Joia(joia)).getId();
    }

    @Override
    @Transactional
    public long saveJoia(Joia joia) {
        return joiaRepository.save(joia).getId();
    }

    @Override
    public void deleteJoia(long id) {
        joiaRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Joia findJoia(long id) {
        Joia joia = joiaRepository.findById(id).orElse(null);
        return joia;
    }
}
