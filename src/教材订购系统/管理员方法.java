package 教材订购系统;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class 管理员方法 extends Orderlist{
private String studentId;
private String bookId;


public 管理员方法()
{
    
}
public 管理员方法(String courseId,String studentId)
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
        }  }

public String QuerycurrentadministratorName(Connection con,String currentadministratorId) throws SQLException
    {
        String sql ="select m_name from administrator where m_id = ?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,currentadministratorId);
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
            return rs.getString("m_name");
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
    
public int RestockingAdd(Connection con, String currentadministratorId, String currentbookId, int orderNumber)throws Exception{
    String sql="insert into restocking (book_id,book_name,book_number,m_id,m_name) values(?,?,?,?,?)";
    PreparedStatement  pstmt=con.prepareStatement(sql);
    String currentadministratorName=QuerycurrentadministratorName(con, currentadministratorId);
    String currentbookName=QuerycurrentbookName(con,currentbookId);

    pstmt.setString(1,currentbookId);
    pstmt.setString(2,currentbookName);
    pstmt.setInt(3,orderNumber);
    pstmt.setString(4,currentadministratorId);
    pstmt.setString(5,currentadministratorName);
    
    return pstmt.executeUpdate();
}

public int LackMinus(Connection con, String currentbookId, int bookNumber)throws Exception{
    String sql="update lack set book_number = book_number - ? where (book_id=? and book_number > 0)";
    PreparedStatement  pstmt=con.prepareStatement(sql);
    pstmt.setInt(1, bookNumber);
    pstmt.setString(2, currentbookId);
    return pstmt.executeUpdate();
	}

public ResultSet QuerycurrentbookLackNumber(Connection con) throws SQLException
{
    String sql ="select lack.book_id,booklist.book_name,lack.book_number from booklist inner join lack on lack.book_id=booklist.book_id";
    PreparedStatement pstmt=con.prepareStatement(sql);
    return pstmt.executeQuery();
}

public int InventoryAdd(Connection con, String currentbookId, int bookNumber)throws Exception{
    String sql="update inventory set book_number = book_number + ? where (book_id=? and book_number >= 0)";
    ResultSet rs = QuerycurrentbookLackNumber(con);
    while (rs.next()) {
        rs.getInt("book_number");
    
        int LackNumber = rs.getInt("book_number");
        int addNumber = bookNumber-LackNumber;
        PreparedStatement  pstmt=con.prepareStatement(sql);
        pstmt.setInt(1, addNumber);
        pstmt.setString(2, currentbookId);
        return pstmt.executeUpdate();
    }
    return 0;
}

public ResultSet QuerycurrentbookInventoryNumber(Connection con) throws SQLException
{
    String sql ="select inventory.book_id,booklist.book_name,inventory.book_number from booklist inner join inventory on inventory.book_id=booklist.book_id";
    PreparedStatement pstmt=con.prepareStatement(sql);
    return pstmt.executeQuery();
}

public ResultSet QuerycurrentbookRestockingNumber(Connection con) throws SQLException
{
    String sql ="select * from restocking";
    PreparedStatement pstmt=con.prepareStatement(sql);
    return pstmt.executeQuery();
}

public int NumSelectedAdd(Connection con, String currentbookId, int orderNumber, int book_capacity)throws Exception{
    String sql="update inventory set book_number = ? where (book_id=? and book_number > 0)";
    PreparedStatement  pstmt=con.prepareStatement(sql);
    int book_number;
    if(book_capacity >= orderNumber)
    {
        book_number=book_capacity-orderNumber;
    }
    else
    {
        book_number=0;
    }
    pstmt.setInt(1, book_number);
    pstmt.setString(2, currentbookId);
    return pstmt.executeUpdate();
}

public int OrderNormalState(Connection con, String currentbookId, int orderNumber, int book_capacity)throws Exception{
    String sql="update orderlist set order_state='Normal' where book_id=? limit ?";
    PreparedStatement pstmt=con.prepareStatement(sql);
    int n;
    if(book_capacity >= orderNumber)
    {
        n=orderNumber;
    }
    else
    {
        n=book_capacity;
    }
    
    pstmt.setString(1, currentbookId);
    pstmt.setInt(2, n);
    return pstmt.executeUpdate();
}

public int OrderStockoutState(Connection con, String currentbookId)throws Exception{
    String sql="update orderlist set order_state='Stockout' where book_id=? and order_state!='Normal';";
    PreparedStatement pstmt=con.prepareStatement(sql);
    pstmt.setString(1, currentbookId);
    return pstmt.executeUpdate();
}

public int ChangeOrderState(Connection con, String currentbookId, int bookNumber)throws Exception{
    String sql="update orderlist set order_state='Normal' where book_id=? and order_state!='Normal' limit ?";
    PreparedStatement pstmt=con.prepareStatement(sql);
    pstmt.setString(1, currentbookId);
    pstmt.setInt(2, bookNumber);
    return pstmt.executeUpdate();
}


public int NumLackAdd(Connection con, String currentbookId, int orderNumber, int book_capacity)throws Exception{
    String sql="update lack set book_number = book_number + ? where (book_id=? and book_number >= 0)";
    PreparedStatement  pstmt=con.prepareStatement(sql);
    int NumLackAdd = orderNumber - book_capacity;
    pstmt.setInt(1, NumLackAdd);
    pstmt.setString(2, currentbookId);
    return pstmt.executeUpdate();
}
}
