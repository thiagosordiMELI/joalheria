package com.joalheria.joalheria.controller;

import com.joalheria.joalheria.dto.JoiaDTO;
import com.joalheria.joalheria.model.Joia;
import com.joalheria.joalheria.service.IJoiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JoiaController {

    @Autowired
    private IJoiaService joiaService;

    @PostMapping("joia/inserir")
    public ResponseEntity<Long> createJoia(@RequestBody JoiaDTO joia){
        long id = joiaService.saveJoia(joia);
        return ResponseEntity.status(HttpStatus.CREATED).body(id);
    }

    @GetMapping("/joias")
    public ResponseEntity<List<Joia>> getJoias(){
        List<Joia> joias = joiaService.getJoias();
        return ResponseEntity.ok(joias);
    }

    @PostMapping("joia/atualizar")
    public ResponseEntity<Joia> editJoia(@RequestParam("numero_identificacao") long id, @RequestBody JoiaDTO joiaDTO){
        Joia joia = joiaService.findJoia(id);
        joia.setMaterial(joiaDTO.getMaterial());
        joia.setPeso(joiaDTO.getPeso());
        joia.setQuilates(joiaDTO.getQuilates());
        joiaService.saveJoia(joia);
        return ResponseEntity.ok(joia);
    }

    @PostMapping("joia/excluir")
    public ResponseEntity<String> deleteJoia(@RequestParam("numero_identificacao") long id){
        joiaService.deleteJoia(id);
        return ResponseEntity.ok("Joia excluida");
    }
}
