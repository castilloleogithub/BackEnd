/*
Proyecto: Mi porfolio
Autor: lcastillo
© Argentina Programa 2022
*/
package com.portfolio.lcastillo.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    private String periE;
    private String imgE;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE,String periE, String imgE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.periE = periE;
        this.imgE = imgE;
    }
    /*/Getters & Setters

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
    */
}
