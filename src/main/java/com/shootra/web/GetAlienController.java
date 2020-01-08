package com.shootra.web;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shootra.web.dao.AlienDao;
import com.shootra.web.model.Alien;

public class GetAlienController extends HttpServlet {
	
	private static final Logger logger = Logger.getLogger(GetAlienController.class.getName());
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		//logger.info("aid : "+aid);
		AlienDao dao=new AlienDao();
		Alien a1=dao.getAlien(aid);
	
		request.setAttribute("alien", a1);
		RequestDispatcher rd=request.getRequestDispatcher("showAlien.jsp");
		rd.forward(request, response);
	}

	
	

}
