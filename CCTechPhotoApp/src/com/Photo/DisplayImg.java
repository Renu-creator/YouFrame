package com.Photo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.PhotoDao.PhotoDao;

import com.bean.Pic;

import UtilityJson.UtilityjsonInfo;





@WebServlet("/DisplayImg")
public class DisplayImg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> list1 =PhotoDao.getImg();
		
		System.out.println("arraylist=***"+list1);
		
		
		 
		 String jsonString = UtilityjsonInfo.getJSONFromObject(list1);
		 response.getWriter().write(jsonString);
		 response.flushBuffer();
		 

		 
	}

	


}
