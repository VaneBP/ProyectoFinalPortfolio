package com.portfolio.VanesaBastianelliPratt.Security.Entity;

import com.portfolio.VanesaBastianelliPratt.Security.Enums.Rolnombre;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity

public class Rol {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Rolnombre rolNombre;
    
    //CONSTRUCTOR

    public Rol() {
    }

    public Rol(Rolnombre rolNombre) {
        this.rolNombre = rolNombre;
    }
    //GETTERS Y SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rolnombre getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(Rolnombre rolNombre) {
        this.rolNombre = rolNombre;
    }
    
    
    
}
