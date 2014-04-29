/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.fifa;

import javax.swing.JOptionPane;

/**
 *
 * @author Cesar Solares
 */
public class Torneo 
{
    String Nombre, FechaIn, Pais, Tipo;
    //mostrar partidos
    
    public Torneo (String nom, String fecha, String pais, String tip)
    {
               Nombre = nom;
               FechaIn = fecha;
               Pais = pais;
               Tipo = tip;
    }
    
    public Torneo (Torneo s)
    {
        Torneo [] torneo = new Torneo[20];
        
        for (int agre = 0; agre < torneo.length; agre++)
        {
            if (Menu.Torneos[agre] == null)
            {
              Menu.Torneos[agre] = s;
              break;
            }
        }

    }
    
    //metodo que toma los nombres de los objetos equipos para poderlos contar y mostrar en la lista del JOptionPane
    public Object[] numeq (Equipo [] team)
        {
            Object [] a = new Object[10];
                for (int i = 0; i< team.length; i++)
                {
                    if (team[i] == null){}
                    else 
                    {
                        a [i] = team[i].Nombre;
                    }       
                }
            return a;
        }
}
