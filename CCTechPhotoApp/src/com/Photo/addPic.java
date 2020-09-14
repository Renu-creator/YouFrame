package com.Photo;

import java.io.IOException;

import java.util.HashMap;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.PhotoDao.PhotoDao;
import com.bean.Pic;


import UtilityJson.UtilityjsonInfo;



@WebServlet("/addPic")

   	

public class addPic extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public addPic() {
        
    }

	


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String jsonObject = request.getReader().readLine();
		
		System.out.println("from angular"+jsonObject);
		
		System.out.println("ok");
		
		int status = PhotoDao.addPic(jsonObject);

		HashMap<String, String> hm = new HashMap<String, String>();
		if (status == 1) {
			hm.put("Msg", "pic inserted successfully");
		} else {
			hm.put("Msg", "Fail to insert");
		}


		System.out.println("image inserted " + status);


	}
	
}







//InputStream inputStream = null;
//
//Part filePart = request.getPart(jsonObject);
//if (filePart != null) {
//    // prints out some information for debugging
//    System.out.println(filePart.getName());
//    System.out.println(filePart.getSize());
//    System.out.println(filePart.getContentType());
//     
//    // obtains input stream of the upload file
//    inputStream = filePart.getInputStream();
//}

