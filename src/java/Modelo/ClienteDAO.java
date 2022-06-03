/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cliente;
import ConexionMySql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {
    
    
    Conexion cn=new Conexion();
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    Cliente p= new Cliente();
    
    public List listar(){
        
        ArrayList<Cliente> list= new ArrayList<>();
            
        String  sql="select  * from  cliente";
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
                Cliente per= new Cliente();
                
                per.setId(rs.getInt("idcliente"));
               
                per.setNom(rs.getString("nombres"));
                
                 per.setApel(rs.getString("apellidos"));
                 
                         per.setDireccion(rs.getString("direccion"));
                 per.setTel(rs.getString("telefono"));
                
                 list.add(per);
            }
                       
        }catch(Exception e){
            
                     
        }
        
        return list;
        
   
    
    }
    
    
    // enviar registro al otro navegador
    
     public Cliente enviar(int id) {
         
         
           String  sql="select  * from  cliente  where idcliente="+id;
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
              
                
                p.setId(rs.getInt("idcliente"));
               
                p.setNom(rs.getString("nombres"));
                
                 p.setApel(rs.getString("apellidos"));
                 
                     p.setDireccion(rs.getString("direccion"));
                 
                 p.setTel(rs.getString("telefono"));
                
                
            }
                       
        }catch(Exception e){
            
                     
        }
         return p;
         
     }
    
     //  agregar o guardar registro ----------------------
     
    public boolean agregar(Cliente per){
        
        
        String sql="insert into cliente(idcliente,nombres,apellidos,direccion,telefono) values(?,?,?,?,?)";
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
            
          ps.setInt(1,per.getId());    
          
          ps.setString(2,per.getNom()); 
          
           ps.setString(3,per.getApel());
           
              ps.setString(4,per.getDireccion());
              
            ps.setString(5,per.getTel());
          
            ps.executeUpdate();
            
          }catch (Exception e){
                                       
          }
        return  false;
        
    }
    
    
    public boolean editar(Cliente per){
        
        
        String sql="update cliente set  nombres=?,apellidos=?,direccion=?,telefono=? where idcliente=?";
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
            
               
           
          ps.setString(1,per.getNom());        
           ps.setString(2,per.getApel());
              ps.setString(3,per.getDireccion());
            ps.setString(4,per.getTel());
            
             ps.setInt(5,per.getId()); 
          
            ps.executeUpdate();
            
          }catch (Exception e){
                                       
          }
        return  false;
        
    }
    
    
    
    public boolean eliminar(int id){
        
        
        String sql="delete from cliente  where idcliente="+id;
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
                 
            ps.executeUpdate();
            
          }catch (Exception e){
                                       
          }
        return  false;
        
    }
    
}
