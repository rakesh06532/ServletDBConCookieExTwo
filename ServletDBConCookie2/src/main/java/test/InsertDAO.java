package test;
import java.sql.*;

public class InsertDAO {
	int k=0;
	public int insert(BookBean bb) {
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement
					("insert into bookdetails49 values(?,?,?,?,?)");
			ps.setString(1, bb.getBCode());
			ps.setString(2, bb.getBName());
			ps.setString(3, bb.getBAuthor());
			ps.setFloat(4, bb.getBPrice());
			ps.setInt(5, bb.getBQnty());
			k=ps.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}

}
