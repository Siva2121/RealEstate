package com.chainsys.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.DAO.RealEstateDAO;
import com.chainsys.model.RealEstate;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
		int flatNumber = Integer.parseInt(request.getParameter("flatNumber"));
		String ownerName = request.getParameter("ownerName");
		RealEstate realEstate=new RealEstate();
		realEstate.setFlatNumber(flatNumber);
		realEstate.setOwnerName(ownerName);
		RealEstateDAO estateDAO=new RealEstateDAO();
try {
	estateDAO.update(realEstate);
	PrintWriter printWriter=response.getWriter();
	printWriter.print("success");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

	
}
