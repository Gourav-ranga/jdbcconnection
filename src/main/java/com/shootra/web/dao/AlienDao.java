package com.shootra.web.dao;

import java.sql.*;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;

import com.shootra.web.GetAlienController;
import com.shootra.web.model.Alien;

public class AlienDao extends HttpServlet
{
	private static final Logger logger = Logger.getLogger(AlienDao.class.getName());
 public Alien getAlien(int aid)
 {
	 
	 String Server = "LAPSAS\\SQLEXPRESS";
	 int Port=1433;
	 String User = "Goru";
	 String Password="Goru@1996";
	 String Database = "students";
	 String jdbcurl;
	 Connection con=null;
 
	 Alien a = new Alien();
	
	 logger.info("aid : "+aid);
	 try 
	 {
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		 
		 jdbcurl = "jdbc:sqlserver://" + Server + ":" +Port + ";User=" + User + ";Password=" +Password + ";Databasename=" + Database + "";
		 con=DriverManager.getConnection(jdbcurl);
		 PreparedStatement pst=con.prepareStatement("select * from students where aid="+aid);
		 ResultSet rs = pst.executeQuery();
		 
		 if(rs.next())
		 {
			 a.setAid(rs.getInt("aid"));
			 a.setAname(rs.getString("aname"));
			 a.setTech(rs.getString("tech"));
		 }
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
	 
	 return a;
  }
 }	

