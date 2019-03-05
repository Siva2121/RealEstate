package com.chainsys.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.DAO.RealEstateDAO;
import com.chainsys.model.RealEstate;

/**
 * Servlet implementation class Findbyid
 */
@WebServlet("/Findbyid")
public class Findbyid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int flatNumber = Integer.parseInt(request.getParameter("flatNumber"));
		RealEstate estate=new RealEstate();
		RealEstateDAO estateDAO=new RealEstateDAO();
		try {
			estate=estateDAO.findById(flatNumber);
		request.setAttribute("estate", estate);
		RequestDispatcher dispatcher=request.getRequestDispatcher("Display.jsp");
		dispatcher.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
