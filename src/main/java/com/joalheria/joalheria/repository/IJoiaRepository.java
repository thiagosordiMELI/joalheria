package com.joalheria.joalheria.repository;

import com.joalheria.joalheria.model.Joia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJoiaRepository extends JpaRepository<Joia, Long> {

}
