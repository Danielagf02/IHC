/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interno;

import cjb.ci.Mensaje;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFormattedTextField;

/**
 *
 * @author HP
 */
public class Metodos
{
    //VALIDACION PARA QUE INSERTE UN EMAIL COREECTO CON @ Y EL .COM O .ALGO JAJA
    public boolean validaEmail(String cad)
    {
        Pattern expReg = null;
        Matcher val = null;

        expReg = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
        val = expReg.matcher(cad);

        if (val.find())
        {
            return true;
        } else
        {
            return false;
        }
    }
    
    //VALIDA QUE SEA UNA CURP REAL
    public boolean validaCURP(String cad)
    {
        Pattern expReg = null;
        Matcher val = null;

        expReg = Pattern.compile("^([A-Z][AEIOUX][A-Z]{2}\\d{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[12]\\d|3[01])[HM](?:AS|B[CS]|C[CLMSH]|D[FG]|G[TR]|HG|JC|M[CNS]|N[ETL]|OC|PL|Q[TR]|S[PLR]|T[CSL]|VZ|YN|ZS)[B-DF-HJ-NP-TV-Z]{3}[A-Z\\d])(\\d)$");
        val = expReg.matcher(cad);

        if (val.find())
        {
            return true;
        } else
        {
            return false;
        }
    }
    
    //METODO PARA VALIDAR HORA DE ENTRADA Y SALIDA DE LOS PROFESORES
    public boolean validaHora(JFormattedTextField obj)
    {

        boolean b = false;

        try
        {

            String s = obj.getText();
            char c[] = s.toString().toCharArray();
            String hora[] = s.split(":");
            int horas = Integer.parseInt(hora[0]);
            int minutos = Integer.parseInt(hora[1]);

            if (!(((c[0] == ' ') || (c[1] == ' ') || (c[3] == ' ') || (c[4] == ' ')) || (horas > 23 || minutos > 59)))
            {
                b = true;
            }

        } catch (NumberFormatException e)
        {
            Mensaje.error(null, "Error..." + e);
            b = false;
        }
        return b;
    }
}
