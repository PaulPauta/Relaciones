/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.trabajo;

/**
 *
 * @author LAB-2
 */
public class Trabajo {

    public static void main(String[] args) {

        var alfaro = new DirectorTecnico();
        alfaro.setNombre("Gustavo Alfaro");
        alfaro.setNacionalidad("Argentina");
        alfaro.setFechaNacimiento(1962);
        alfaro.setYearsTrayectoria(20);

        var ecuador = new Seleccion();
        ecuador.setCodigoFIFA("FEF");
        ecuador.setNombre("Federación Ecuatoriana de Fútbol (FEF)");
        ecuador.setParticipacionesMundial(4);
        System.out.println(ecuador.obtienePais() + " Datos del D.T: "
                + ecuador.getSeleccionador().getmostrarInfo());

        var chile = new Seleccion();
        chile.setCodigoFIFA("CHI");
        chile.setNombre("Federación Chilena de Fútbol (FCF)");
        chile.setParticipacionesMundial(9);
        System.out.println(chile.obtienePais() + " Datos del D.T: "
                + chile.getSeleccionador().getmostrarInfo());

        var enner = new Jugador();
        enner.setNombre("Enner Valencia");
        enner.setPosicion("Goleador");
        enner.setFechaNacimiento(1989);
        enner.setEquipo(ecuador);
        System.out.println("Datos del D.T de Enner" + enner.getEquipo().getSeleccionador());

        var byron = new Jugador();
        byron.setNombre("Byron Castillo");
        byron.setPosicion("Defensa");
        byron.setFechaNacimiento(1998);
        byron.setEquipo(ecuador);
        System.out.println("Datos del D.T de Enner" + byron.getEquipo().getSeleccionador());

        var reyArturo = new Jugador();
        reyArturo.setNombre("Arturo Vidal");
        reyArturo.setPosicion("Mediocampo");
        reyArturo.setFechaNacimiento(1987);
        reyArturo.setEquipo(chile);
        System.out.println("Datos del D.T de Enner" + reyArturo.getEquipo().getSeleccionador());

        System.out.println(enner.setmostrarInfo());
        System.out.println(byron.setmostrarInfo());
        System.out.println(reyArturo.setmostrarInfo());

    }
}
