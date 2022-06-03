/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;



import Modelo.Usuario;
import Modelo.UsuarioDAO;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;



public class ControladorUsuario extends HttpServlet {

   String listar="listado_usuario.jsp";
   String agregar="agregar_usuario.jsp";
   String editar="editar_usuario.jsp";
    
  UsuarioDAO  dao = new UsuarioDAO();
   
  Usuario p= new Usuario();
   
   int id;
   int car;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        
        
           response.setContentType("text/html;charset=UTF-8");
        
        try(PrintWriter out = response.getWriter()){
            
            String usu;
            String contra;
            int cargo=0;
            
            UsuarioDAO  dao = new UsuarioDAO();


   RequestDispatcher  rd=null;
   
            if(request.getParameter("btnIngresar")!=null){
                
                usu=request.getParameter("txtusuario");
                
                contra=request.getParameter("txtcontra");
                
                
                cargo=dao.login(usu,contra);
              
request.setAttribute("cargo", cargo);
request.setAttribute("usu", usu);
                
rd=request.getRequestDispatcher("Login.jsp");


            }
            
            
            rd.forward(request, response);
        }
        
        
        
        
        
        
        
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
            
 
//         id=Integer.parseInt(request.getParameter("txtcodigo"));
            
            String nom=request.getParameter("txtusuario");
             String con=request.getParameter("txtcontraseña");
             
                car=Integer.parseInt(request.getParameter("txtcargo"));
         
            
          
//             p.setId(id);
             
             p.setUsuario(nom);
             p.setContra(con);
               p.setCargo(car);
        
        
             
             dao.agregar(p);
             
            
             
          acceso=listar;
            
            
            
        }
    
        
        else if(action.equalsIgnoreCase("editar")){
            
            
            request.setAttribute("idper",request.getParameter("id"));
            
            acceso=editar;
            
        }
        
        
        
        
         
         
          else if(action.equalsIgnoreCase("Actualizar")){
            
           id=Integer.parseInt(request.getParameter("txtcodigo"));
         
            String nom=request.getParameter("txtusuario");
             String con=request.getParameter("txtcontraseña");
             
                car=Integer.parseInt(request.getParameter("txtcargo"));
             
             p.setId(id);
             
             p.setUsuario(nom);
             p.setContra(con);
               p.setCargo(car);
            
         
             
             dao.editar(p);
             
            acceso=listar;
            
            
            
        }
         else if(action.equalsIgnoreCase("eliminar")){
            
               id=Integer.parseInt(request.getParameter("txtcodigo"));
           
            
    
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
