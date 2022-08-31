package 教材订购系统;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class 数据库 {
    
    private String dbpath="jdbc:mysql://localhost:3306/textbook?serverTimezone=GMT%2B8&useSSL=false";
    private String dbUserName="root";
    private String dbPassword="";
    private String jdbcName="com.mysql.cj.jdbc.Driver";
    public 数据库(){
    
        }
    public String GetDBPath()
    {
        return dbpath;
    }
    public void SetDBPath(String dbpath)
    {
        dbpath=dbpath;
    }
    public Connection getCon() throws Exception{
	Class.forName(jdbcName);
        Connection con=DriverManager.getConnection(dbpath,dbUserName,dbPassword);
	return con;
}

public void closeCon(Connection con) throws Exception{
	if(con!=null){
		
		con.close();
	}
}
    
    
    public void OpenDB()
    {数据库 db=new 数据库();
	try {
		db.getCon();
		System.out.println("数据库连接成功!");
	} catch (Exception e) {
		e.printStackTrace();
            }
    }
    public  void main(String[] args) {
        OpenDB();
    }
}
