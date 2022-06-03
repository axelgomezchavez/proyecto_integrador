/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Programacion_Visita {
    
     int id;
     String fecha;
     String hora;
     String idcliente;
     String idtecnico;
     String lugar;
     String  estado;
     
  

    
     
     public Programacion_Visita(){
         
         
     }

    public Programacion_Visita(int id, String fecha, String hora, String idcliente, String idtecnico, String lugar, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.idcliente = idcliente;
        this.idtecnico = idtecnico;
        this.lugar = lugar;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getIdtecnico() {
        return idtecnico;
    }

    public void setIdtecnico(String idtecnico) {
        this.idtecnico = idtecnico;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
     
     
     
     
}
