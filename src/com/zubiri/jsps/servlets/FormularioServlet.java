package com.zubiri.jsps.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormularioServlet
 */
@WebServlet("/FormularioServlet")
public class FormularioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FormularioServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usuario = request.getParameter("usuario");
		String contraseņa = request.getParameter("contraseņa");
		if (usuario.equals("egoitz") && contraseņa.equals("Barrena")){
			System.out.println("Bienvenido ");
			request.setAttribute("usuarioLogeado" , usuario+" "+contraseņa );
			request.getRequestDispatcher("Bienvenido.jsp").forward(request, response);
		} else {
			System.out.println("Error en el usuario o contraseņa -----");
			response.sendRedirect("Formulario.html");
		}
	}

}
