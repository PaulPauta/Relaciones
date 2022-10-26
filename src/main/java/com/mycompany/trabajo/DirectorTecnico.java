/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

/**
 *
 * @author LAB-2
 */
public class DirectorTecnico {

    
    private String nacionalidad;
    private int yearsTrayectoria;
    private Seleccion equipo;

    public String getmostrarInfo() {
        return  " es de nacionalidad"+ this.nacionalidad + " Nació en el año:"
                + " tiene " + this.yearsTrayectoria+ " años de trayectoria";
    }


    public void setNacionalidad(String n) {
        this.nacionalidad = n;
    }


    public void setYearsTrayectoria(int yearsTrayectoria) {
        this.yearsTrayectoria = yearsTrayectoria;
    }

}
