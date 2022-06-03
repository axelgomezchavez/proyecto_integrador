/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Repuesto;
import Modelo.RepuestoDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
//import javax.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;


public class ControladorRepuesto extends HttpServlet {

     String listar="listado_repuesto.jsp";
   String agregar="agregar_repuesto.jsp";
   String editar="editar_repuesto.jsp";
    
   RepuestoDAO  dao = new RepuestoDAO();
   
   Repuesto p= new Repuesto();
   
   int id;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        
        
        
        
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        
        
       
        String acceso="";
        
        
        String action=request.getParameter("accion");
              
      
        if(action.equalsIgnoreCase("listar")) {
            
            acceso=listar;
            
        }
             
        else if(action.equalsIgnoreCase("Guardar")){
            

            id=Integer.parseInt(request.getParameter("txtserie"));
            
            String nom=request.getParameter("txtnombres");
             String can=request.getParameter("txtcantidad");
          
            
         
             p.setId(id);
             
             p.setNom(nom);
             p.setCantidad(can);
             
             
           
             dao.agregar(p);
             
     
             
          acceso=listar;
            
            
            
        }
        
        
        else if(action.equalsIgnoreCase("editar")){
            
            
            request.setAttribute("idper",request.getParameter("id"));
            
            acceso=editar;
            
        }
        
        
        
        
         
         
          else if(action.equalsIgnoreCase("Actualizar")){
            
              
              
                id=Integer.parseInt(request.getParameter("txtserie"));
            
            String nom=request.getParameter("txtnombres");
             String can=request.getParameter("txtcantidad");
          
            
      
             p.setId(id);
             
             p.setNom(nom);
             p.setCantidad(can);
              
             
             dao.editar(p);
             
            acceso=listar;
            
            
            
        }
         else if(action.equalsIgnoreCase("eliminar")){
            
            id=Integer.parseInt(request.getParameter("id"));
           
            
    
             p.setId(id);
            
             
             dao.eliminar(id);
             
            acceso=listar;
            
            
            
        }
        
        
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        
        vista.forward(request, response);
        
      
      
         
        
        
        
        
        
        
        
        
        
        
        
    }

   
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
