/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interno;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
}
