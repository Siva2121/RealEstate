package com.chainsys.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.DAO.RealEstateDAO;
import com.chainsys.model.RealEstate;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		int flatNumber = Integer.parseInt(request.getParameter("flatNumber"));
		String area= request.getParameter("area");
		String district= request.getParameter("district");
		int length= Integer.parseInt(request.getParameter("length"));
		String ownerName = request.getParameter("ownerName");
		int amount= Integer.parseInt(request.getParameter("amount"));
		String contactNumber=request.getParameter("contactNumber");

	RealEstate realEstate=new RealEstate();
	realEstate.setFlatNumber(flatNumber);
	realEstate.setArea(area);
	realEstate.setDistrict(district);
	realEstate.setLength(length);
	realEstate.setAmount(amount);
	realEstate.setOwnerName(ownerName);
	realEstate.setContactNumber(contactNumber);
	
	RealEstateDAO realEstateDAO=new RealEstateDAO();
	try {
		realEstateDAO.add(realEstate);
		out.print("success");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		out.print("failed");
	}
	}
}
