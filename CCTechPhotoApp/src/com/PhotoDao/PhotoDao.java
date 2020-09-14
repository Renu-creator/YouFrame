package com.PhotoDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.bean.Pic;
import com.service.photoService;

public class PhotoDao {

	public static int addPic(String p) {
		Connection con = photoService.getCon();

		int status = 0;
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement("insert into pics (pic) values(?)");

			pstmt.setString(1, p);

			status = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return status;
	}

	public static ArrayList<String> getImg() {
		Connection con = null;

		ArrayList<String> list = new ArrayList<String>();

		try {
			con = photoService.getCon();

			PreparedStatement pstmt = null;
			ResultSet rs = null;

			pstmt = con.prepareStatement("select * from pics");
			rs = pstmt.executeQuery();

			while (rs.next())
			{

				list.add(rs.getString(2));

			}
		} catch (Exception e)
		{
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return list;

	}

}


