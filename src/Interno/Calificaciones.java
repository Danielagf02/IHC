/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interno;

/**
 *
 * @author DanielaGF
 */
public class Calificaciones
{
    
    double Calificaciones;
    String Marticula;

    public Calificaciones()
    {
    }

    public Calificaciones(double Calificaciones, String Marticula)
    {
        this.Calificaciones = Calificaciones;
        this.Marticula = Marticula;
    }

    public double getCalificaciones()
    {
        return Calificaciones;
    }

    public void setCalificaciones(double Calificaciones)
    {
        this.Calificaciones = Calificaciones;
    }

    public String getMarticula()
    {
        return Marticula;
    }

    public void setMarticula(String Marticula)
    {
        this.Marticula = Marticula;
    }
    
    
}
