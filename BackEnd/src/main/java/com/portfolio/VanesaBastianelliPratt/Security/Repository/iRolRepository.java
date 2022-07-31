package com.portfolio.VanesaBastianelliPratt.Security.Repository;

import com.portfolio.VanesaBastianelliPratt.Security.Entity.Rol;
import com.portfolio.VanesaBastianelliPratt.Security.Enums.Rolnombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(Rolnombre rolNombre);
    
}
