
package com.portfolio.VanesaBastianelliPratt.Security.Service;

import com.portfolio.VanesaBastianelliPratt.Security.Entity.Rol;
import com.portfolio.VanesaBastianelliPratt.Security.Enums.Rolnombre;
import com.portfolio.VanesaBastianelliPratt.Security.Repository.iRolRepository;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//refleja lo que hacemos acá en la base de datos por si se cae el sistema(persistencia)
@Transactional

public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
 public Optional<Rol> getByRolnombre(Rolnombre rolNombre){
     return irolRepository.findByRolNombre(rolNombre);
     }
 public void save(Rol rol){
    irolRepository.save(rol);
 }
}
