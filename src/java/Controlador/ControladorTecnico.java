/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;



import Modelo.Tecnico;
import Modelo.TecnicoDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
//import javax.servlet.RequestDispatcher;


import java.io.IOException;


public class ControladorTecnico extends HttpServlet {

  
    
   String listar="listado_tecnico.jsp";
   String agregar="agregar_tecnico.jsp";
   String editar="editar_tecnico.jsp";
    
   TecnicoDAO  dao = new TecnicoDAO();
   
   Tecnico p= new Tecnico();
   
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

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
