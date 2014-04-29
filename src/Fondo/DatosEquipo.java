/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Images;

/**
 *
 * @author Cesar Solares
 */
public class DatosEquipo {
   public String NombreEquipo;
   public String FechaFunEquipo;
   public String CiudadOrigen;
   public String CodEquipo;
   public int cod1;
    
//***********************************CODIGO*****************************
   public String getCodEquipo(){
       return CodEquipo;
   }
   public void setCodEquipo(String CodEquipo){
       this.CodEquipo=CodEquipo;
   }
//*************************************NOMBRE****************************
   public String getNombreEquipo(){
       return NombreEquipo;
   }
   public void setNombreEquipo(String NombreEquipo){
       this.NombreEquipo=NombreEquipo;
   }
//*************************************FECHA*****************************
public String getFechaFunda(){
    return FechaFunEquipo;
}
public void setFechaFunda(String FechaFunEquipo){
    this.FechaFunEquipo=FechaFunEquipo;
}
//*************************************CIUDAD*****************************

public String getCiudadEquipo(){
    return CiudadOrigen;
}
public void setCiudadEquipo(String CiudadOrigen ){
    this.CiudadOrigen= CiudadOrigen;
}
//************************************CODIGO*******************************
public int getCod(){
    return cod1;
}
public void setCod(int cod1){
    this.cod1=cod1;
}



}
