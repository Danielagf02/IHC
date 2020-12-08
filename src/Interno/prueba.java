/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interno;

/**
 *
 * @author Kevin
 */
public class prueba
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        int id=2;
        int Grado=4;
        String Grupo="A";
        String ApellidoP="Piña";
        String ApellidoM="Hernandez";
        String Nombre="Daniela";
        String fechaNacimiento="12/12/1399";
        String CURP="X";
        String sexo="FlorAmargo";
        int Telefono=123;
        String NomMadre="Pastrana";
        String NomPadre="Naarai";
        int FolioAlumno=4;
        String Correo="EMOXXITAFLOW@MOXA.com";
        String Contraseña="si";
        
        ManipulaBD.AltasAlumnos(id, Grado, Grupo, ApellidoP, ApellidoM, Nombre, fechaNacimiento, CURP, sexo, Telefono, NomMadre, NomPadre, FolioAlumno, Correo, Contraseña);

    }

}
