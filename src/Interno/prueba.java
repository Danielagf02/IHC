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
        int id=1;
        int Grado=3;
        String Grupo="A";
        String ApellidoP="coco";
        String ApellidoM="coca";
        String Nombre="elcarl";
        String fechaNacimiento="12/12/2020";
        String CURP="erc";
        String sexo="camion";
        int Telefono=123;
        String NomMadre="luisa";
        String NomPadre="luis";
        int FolioAlumno=3;
        String Correo="69@varl.com";
        String Contraseña="dedos";
        ManipulaBD.AltasAlumnos(id, Grado, Grupo, ApellidoP, ApellidoM, Nombre, fechaNacimiento, CURP, sexo, Telefono, NomMadre, NomPadre, FolioAlumno, Correo, Contraseña);
    }

}
