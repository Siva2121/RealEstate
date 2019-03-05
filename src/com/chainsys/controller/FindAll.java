package com.chainsys.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.DAO.RealEstateDAO;
import com.chainsys.model.RealEstate;
import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;

/**
 * Servlet implementation class FindAll
 */
@WebServlet("/FindAll")
public class FindAll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		RealEstateDAO realEstateDAO = new RealEstateDAO();
		try {
			ArrayList<RealEstate> listrealestate = realEstateDAO.findAll();
			request.setAttribute("realestate", listrealestate);
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("DisplayAll.jsp");
			dispatcher.forward(request, response);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
