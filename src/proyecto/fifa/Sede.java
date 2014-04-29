/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.fifa;

/**
 *
 * @author Cesar Solares
 */
   
public class Sede 
{
   
    String Nombre, Pais, Ciudad, Estado;
    int Capacidad;
    
    public Sede (String nom, String pa, String ciu, int cap)
    {
               Nombre = nom;
               Pais = pa;
               Ciudad = ciu;
               Estado = "Activo";
               Capacidad = cap;
    }
    
    public Sede (Sede s)
    {
        Sede [] estadios = new Sede[20];
        
        for (int agre = 0; agre < estadios.length; agre++)
        {
            if (Menu.Sedes[agre] == null)
            {
              Menu.Sedes[agre] = s;
              break;
            }
        }

    }
}
