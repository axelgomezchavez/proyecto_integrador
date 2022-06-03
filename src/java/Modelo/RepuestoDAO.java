/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import Modelo.Repuesto;

import ConexionMySql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class RepuestoDAO {
    
    
    Conexion cn=new Conexion();
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    Repuesto p= new Repuesto();
    
    public List listar(){
        
        ArrayList<Repuesto> list= new ArrayList<>();
            
        String  sql="select  * from  Respuesto";
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
                Repuesto per= new Repuesto();
                
                per.setId(rs.getInt("idrepuesto"));
               
                per.setNom(rs.getString("nombre"));
                
                 per.setCantidad(rs.getString("cantidad"));
                 
           
                
                 list.add(per);
            }
                       
        }catch(Exception e){
            
                     
        }
        
        return list;
        
   
    
    }
    
    
    // enviar registro al otro navegador
    
     public Repuesto enviar(int id) {
         
         
           String  sql="select  * from  respuesto where idrepuesto="+id;
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
              
                
                p.setId(rs.getInt("idrepuesto"));
               
                p.setNom(rs.getString("nombre"));
                
                 p.setCantidad(rs.getString("cantidad"));
                 
               
                
                
            }
                       
        }catch(Exception e){
            
                     
        }
         return p;
         
     }
    
     //  agregar o guardar registro ----------------------
     
    public boolean agregar(Repuesto per){
        
        
        String sql="insert into respuesto(idrepuesto,nombre,cantidad) values(?,?,?)";
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
            
            
       
                 
          ps.setInt(1,per.getId());    
          
          ps.setString(2,per.getNom()); 
          
           ps.setString(3,per.getCantidad());
           
 
          
            ps.executeUpdate();
            
          }catch (Exception e){
                                       
          }
        return  false;
        
    }
    
    
    public boolean editar(Repuesto per){
        
        
        String sql="update respuesto set  nombre=?,cantidad=? where idrepuesto=?";
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
            
               
           
          ps.setString(1,per.getNom());        
           ps.setString(2,per.getCantidad());
        
            
             ps.setInt(3,per.getId()); 
          
            ps.executeUpdate();
            
          }catch (Exception e){
                                       
          }
        return  false;
        
    }
    
    
    
    public boolean eliminar(int id){
        
        
        String sql="delete from respuesto  where idrepuesto="+id;
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
                 
            ps.executeUpdate();
            
          }catch (Exception e){
                                       
          }
        return  false;
        
    }
    
}
