package 教材订购系统;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class 操作订单方法 extends Orderlist{
private String studentId;
private String bookId;


public 操作订单方法()
{
    
}
public 操作订单方法(String courseId,String studentId)
{
    studentId=studentId;
    bookId=bookId;
}
public String getStudentId()
    {
        return studentId;
    }
public void setStudentId(String studentId)
    {
        this.studentId=studentId;
    }

public void setBookId(String selectid)
    {
        this.bookId=bookId;
    }

public String isExisted(Connection con, String currentbookId) throws SQLException{
    String sql = "select * from booklist where book_id=? ";
    PreparedStatement pstmt = con.prepareStatement(sql);
    pstmt.setString(1, currentbookId);
    ResultSet rs=pstmt.executeQuery();

    if (rs.next()){
            return rs.getString("book_id");
    }
    else
    {
        return "";
    }  
}

public  String isOrderExisted(Connection con, String currentbookId, String currentstudentId) throws SQLException{   /**   是否已经选过这本书了*/
        String sql = "select * from orderlist where book_id=? and student_id=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
	pstmt.setString(1, currentbookId);
        pstmt.setString(2, currentstudentId);
        ResultSet rs=pstmt.executeQuery();
    
        if (rs.next()){
            return rs.getString("book_id");
        }
        else
        {
            return "";
        }
}

public String QuerycurrentstudentName(Connection con,String currentstudentId) throws SQLException
    {
        String sql ="select student_name from student where student_id = ?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,currentstudentId);
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
            return rs.getString("student_name");
        }
        else
        {
            return "";
        }   
    }  

public String QuerycurrentbookName(Connection con,String currentbookId) throws SQLException
    {
        String sql ="select book_name from booklist where book_id = ?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,currentbookId);
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
            return rs.getString("book_name");
        }
        else
        {
            return "";
        }   
    }
    
public int SelectionAdd(Connection con, String currentstudentId, String currentbookId, int book_capacity)throws Exception{
    String sql="insert into orderlist (student_id,student_name,book_id,book_name,order_state) values(?,?,?,?,?)";
    PreparedStatement  pstmt=con.prepareStatement(sql);
    String currentstudentName=QuerycurrentstudentName(con,currentstudentId);
    String currentbookName=QuerycurrentbookName(con,currentbookId);
    
    pstmt.setString(1,currentstudentId);
    pstmt.setString(2,currentstudentName);
    pstmt.setString(3,currentbookId);
    pstmt.setString(4,currentbookName);
    pstmt.setString(5, "");

    return pstmt.executeUpdate();
}

public ResultSet StudentList(Connection con, Student student) throws SQLException {
    StringBuffer sb = new StringBuffer("select bookId,bookName,bookPress,bookPrice from t_course, t_selection,tinfo where Booklist.book_id=Orderlist.book_id");
    if (字符串工具.isNotEmpty(student.getStudentId())) {
        sb.append(" and student_id = '" + student.getStudentId() + "'");
    }
    PreparedStatement pstmt = con.prepareStatement(sb.toString());
    return pstmt.executeQuery();
    }

public int SelectionCancel(Connection con, String currentstudentId,String currentbookId)throws Exception{
    String sql="delete from orderlist where student_id=? and book_id=?";
    PreparedStatement  pstmt=con.prepareStatement(sql);
    pstmt.setString(1, currentstudentId);
    pstmt.setString(2, currentbookId);
    return pstmt.executeUpdate();
	}
}