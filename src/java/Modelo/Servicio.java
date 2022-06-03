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
public class Servicio {
    
    
      int id;
    
     String fecha;
      String fecha_entrega;
      
      String  tipo_atencion;
      
       String  idcliente;
       String  idtecnico;
       String  serie;
        String  tipo_electrodomestico;
        String  marca;
          String  modelo;
           String  descripcion;
           String  nombre;
            String  pago;
            String  tipo;
                
  
      
      public Servicio(){
         
         
     }

    public Servicio(int id, String fecha, String fecha_entrega, String tipo_atencion, String idcliente, String idtecnico, String serie, String tipo_electrodomestico, String marca, String modelo, String descripcion, String nombre, String pago, String tipo) {
        this.id = id;
        this.fecha = fecha;
        this.fecha_entrega = fecha_entrega;
        this.tipo_atencion = tipo_atencion;
        this.idcliente = idcliente;
        this.idtecnico = idtecnico;
        this.serie = serie;
        this.tipo_electrodomestico = tipo_electrodomestico;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.pago = pago;
        this.tipo = tipo;
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

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getTipo_atencion() {
        return tipo_atencion;
    }

    public void setTipo_atencion(String tipo_atencion) {
        this.tipo_atencion = tipo_atencion;
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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTipo_electrodomestico() {
        return tipo_electrodomestico;
    }

    public void setTipo_electrodomestico(String tipo_electrodomestico) {
        this.tipo_electrodomestico = tipo_electrodomestico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
      
     
     
}
