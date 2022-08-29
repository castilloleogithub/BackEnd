/*
Proyecto: Mi porfolio
Autor: lcastillo
© Argentina Programa 2022
*/
package com.portfolio.lcastillo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String periE;
    private String imgE;

    public Educacion() {
    }

    public Educacion(String nombreE, String descripcionE,String periE, String imgE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.periE = periE;
        this.imgE = imgE;
    }
/*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
   // public String getAnoE() {
  //      return anoE;
  //  }

  //  public void setAnoE(String anoE) {
   //     this.anoE = anoE;
  //  }
    */
}
