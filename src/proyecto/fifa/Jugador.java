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
public class Jugador 
{
   String Nombre, Apellido, FechaNac, PaisNac, Equipo, FechaCon, Posicion, Estado, HistorialEqui, FechaDespi;
   int CodigoCar, NumeroCam;
   //EstadoCon
   
   public Jugador (String nom, String ape, String fechanac, String paisnac, String pos, int codcar, int numerocam)
    {
        
        Nombre = nom;
        Apellido = ape;
        FechaNac = fechanac;
        PaisNac = paisnac;
        Posicion = pos;
        Estado = "Activo";
        CodigoCar = codcar;
        NumeroCam = numerocam;
        Object equipo;
        
        if (Menu.Equipos[0] == null)
        {}
        else
        {
          equipo = JOptionPane.showInputDialog(null, "Escoja el equipo con quien juega", "Equipo",JOptionPane.INFORMATION_MESSAGE, null , nomseq(Menu.Equipos), nomseq(Menu.Equipos)[0]);  
          Equipo = String.valueOf(equipo);  
        }     
    }
   
   //metodo que toma los nombres de los objetos equipos para poderlos mostrar en la lista del JOptionPane
    public Object[] nomseq (Equipo [] team)
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
    
    public Jugador (Jugador s)
    {
        Jugador [] equipos = new Jugador[100];
        
        for (int agre = 0; agre < equipos.length; agre++)
        {
            if (Menu.Equipos[agre] == null)
            {
              Menu.Jugadores[agre] = s;
              break;
            }
        }

    }
}
