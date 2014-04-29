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
public class Equipo 
{
    String Nombre, FechaFun, CiudadOri, Estado, Estadio;
    int Codigo;
    Jugador [] Equipon = new Jugador [100];

    
    public Equipo (String nom, String fecha, String ciu, int cod)
    {
        
        Nombre = nom;
        FechaFun = fecha;
        CiudadOri = ciu;
        Estado = "Activo";
        Codigo = cod;
        Object sede;
               
          sede = JOptionPane.showInputDialog(null, "Escoja la sede", "Sede",JOptionPane.INFORMATION_MESSAGE, null , nombresede(Menu.Sedes), nombresede(Menu.Sedes)[0]);  
          Estadio = String.valueOf(sede);
    }
    
    //metodo que toma los nombres de los objetos sedes para poderlos mostrar en la lista del JOptionPane
    public Object[] nombresede (Sede [] estadios)
        {
            Object [] a = new Object[10]; 
            for (int i = 0; i< estadios.length; i++)
            {
                if (estadios[i] == null){}
                else 
                {
                    a [i] = estadios[i].Nombre;
                }       
            }  
            return a;
        }
    
    public Equipo (Equipo s)
    {
        Equipo [] equipos = new Equipo[100];
        
        for (int agre = 0; agre < equipos.length; agre++)
        {
            if (Menu.Equipos[agre] == null)
            {
              Menu.Equipos[agre] = s;
              break;
            }
        }

    }
    
}
