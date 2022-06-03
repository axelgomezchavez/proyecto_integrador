/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDAO;
//import javax.servlet.RequestDispatcher;
import jakarta.servlet.*;
import jakarta.servlet.http.*;


import java.io.IOException;
import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
public class ControladorCliente extends HttpServlet {

  
   String listar="listado_cliente.jsp";
   String agregar="agregar_cliente.jsp";
   String editar="editar_cliente.jsp";
    
   ClienteDAO  dao = new ClienteDAO();
   
   Cliente p= new Cliente();
   
   int id;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //  processRequest(request, response);
      
      
      
      
        String acceso="";
        
        
        String action=request.getParameter("accion");
              
    
        if(action.equalsIgnoreCase("listar")) {
            
            acceso=listar;
            
        }
             
        else if(action.equalsIgnoreCase("Guardar")){
            
           
            id=Integer.parseInt(request.getParameter("txtdni"));
            
            String nom=request.getParameter("txtnombres");
             String ape=request.getParameter("txtapellidos");
             
               String dire=request.getParameter("txtdireccion");
             String tel=request.getParameter("txttelefono");
            
             
             p.setId(id);
             
             p.setNom(nom);
             p.setApel(ape);
               p.setDireccion(dire);
        
             p.setTel(tel);
             

             
             dao.agregar(p);
             
            
             
          acceso=listar;
            
            
            
        }
        // enviar -----------------------
        
        else if(action.equalsIgnoreCase("editar")){
            
            
            request.setAttribute("idper",request.getParameter("id"));
            
            acceso=editar;
            
        }
        
        
        
        
         
         
          else if(action.equalsIgnoreCase("Actualizar")){
            
            id=Integer.parseInt(request.getParameter("txtdni"));
             String nom=request.getParameter("txtnombres");
             String ape=request.getParameter("txtapellidos");
               String dire=request.getParameter("txtdireccion");
             String tel=request.getParameter("txttelefono");
            
             
             p.setId(id);
             
             p.setNom(nom);
             p.setApel(ape);
               p.setDireccion(dire);
            
             p.setTel(tel);
             
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
