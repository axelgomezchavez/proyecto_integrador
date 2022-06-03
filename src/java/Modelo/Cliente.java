package Modelo;

/**
 *
 * @author Usuario
 */
public class Cliente {

     int id;
     String apel;
     String nom;
     String Tel;
     String direccion;
  

    
     
     public Cliente(){
         
         
     }

        
    public Cliente(int id, String apel, String nom, String Tel, String direccion) {
        this.id = id;
        this.apel = apel;
        this.nom = nom;
        this.Tel = Tel;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApel() {
        return apel;
    }

    public void setApel(String apel) {
        this.apel = apel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
     
    
    
    
}
