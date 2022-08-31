package 教材订购系统;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class 控件 {
    public 数据库 database;
    public 窗体对象 theFormObject;
    Connection con = null;
    
    public 控件()
    {
        
    }
      
    public Student VerifyStudent(Connection con,Student student) throws Exception{
        Student resultStu=null;
	String sql="select * from Student where student_id=? and student_password=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        
        pstmt.setString(1,student.getStudentId());
        pstmt.setString(2,student.getStudentPassword());
        ResultSet rs=pstmt.executeQuery();
        if(rs.next()){
           
            resultStu=new Student();
            resultStu.setStudentId(rs.getString("student_id"));
            resultStu.setStudentPassword(rs.getString("student_password"));     
        }
      
       return resultStu;
        }
    
        public Administrator VerifyAdministrator(Connection con,Administrator administrator) throws Exception{
        Administrator resultStu=null;
	String sql="select * from Administrator where m_id=? and m_password=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        
        pstmt.setString(1,administrator.getMId());
        pstmt.setString(2,administrator.getMPassword());
        ResultSet rs=pstmt.executeQuery();
        if(rs.next()){
           
            resultStu=new Administrator();
            resultStu.setMId(rs.getString("m_id"));
            resultStu.setMPassword(rs.getString("m_password"));     
        }
      
       return resultStu;
        }

    public ResultSet QueryAllBook(Connection con) throws SQLException
    {
        StringBuffer sb = new StringBuffer("select * from Booklist");
        PreparedStatement pstmt = con.prepareStatement(sb.toString());
        return pstmt.executeQuery();  
    }
    
    public ResultSet StudentQueryOrder(Connection con, String currentstudentId) throws SQLException
    {
        String sql ="select * from orderlist where student_id=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1,currentstudentId);
        return pstmt.executeQuery();  
    }
    
    public ResultSet QueryOrder(Connection con) throws SQLException
    {
        String sql ="select * from orderlist order by book_id";
        PreparedStatement pstmt = con.prepareStatement(sql);
        return pstmt.executeQuery();  
    }
    
    public ResultSet AdministratorQueryOrder(Connection con) throws SQLException
    {
        String sql ="select *, count(book_id) as amount from orderlist group by book_id ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        return pstmt.executeQuery();  
    }
    
    public int QueryCapacity(Connection con, String bookId) throws SQLException
    {
        String sql ="select book_number from inventory where book_id  = ? ";
        PreparedStatement pstmt=con.prepareStatement(sql); 
        pstmt.setString(1,bookId);
        ResultSet result=pstmt.executeQuery();
        if (result.next()) 
        {
            return result.getInt("book_number");
        }
        else
        {
            return 0;
        }
    }
        
    public ResultSet QuerycurrentStudent(Connection con,String currentstudentId) throws SQLException
    {
        String sql ="select student_id, student_name, student_sex, student_department, student_major, student_tele from student where student_id = ?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,currentstudentId);
        ResultSet rs=pstmt.executeQuery();
        return pstmt.executeQuery();  
    }
    
    public ResultSet QuerycurrentAdministrator(Connection con,String currentadministratorId) throws SQLException
    {
        String sql ="select m_id, m_name, m_sex, m_tele from administrator where m_id = ?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,currentadministratorId);
        ResultSet rs=pstmt.executeQuery();
        return pstmt.executeQuery();  
    }
    
    public String QueryPassword(Connection con,Student student) throws SQLException
    {
        String sql ="select student_password from student where student_id = ? ";
        PreparedStatement pstmt=con.prepareStatement(sql);
       
        pstmt.setString(1,student.getStudentId());
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
             return rs.getString("student_password");
        }
             else
            {
            return "";
            }    
    }
    
    public int ModifyPassword(Connection con,Student student)throws Exception{
		String sql="update student set student_password = ?  where student_id = ?";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		
		pstmt.setString(1,student.getStudentPassword());
		pstmt.setString(2,student.getStudentId());
                
		return pstmt.executeUpdate();
    }
    
    public Boolean CanAdd(Connection con,String tablename,String columnname,String student_id) throws SQLException
    {
        
	String sql="select * from " + tablename + " where " + columnname  + " = ? ";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,student_id);
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
             return false;
        }
        else{
            return true;
        }
    }
    
    public int studentAdd(Connection con,Student student)throws Exception{
		String sql="insert into student values(?,?,?,?,?,?,?)";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setString(1,student.getStudentId());
		pstmt.setString(2,student.getStudentPassword());
		pstmt.setString(3,student.getStudentName());
                pstmt.setString(4,student.getStudentSex());
                pstmt.setString(5,student.getStudentDepartment());
                pstmt.setString(6,student.getStudentMajor());
                pstmt.setString(7,student.getStudentTele());
		return pstmt.executeUpdate();
    }
    
    public ResultSet StudentList(Connection con, Student student) throws SQLException {
        StringBuffer sb = new StringBuffer("select * from student");
        if (字符串工具.isNotEmpty(student.getStudentId())) {
            sb.append(" and student_id ='" + student.getStudentId() + "'");
        }
        PreparedStatement pstmt = con.prepareStatement(sb.toString().replaceFirst("and", "where"));
        return pstmt.executeQuery();

    }
    
    public Boolean CanModify(Connection con,String tablename,String columnname,String student_id) throws SQLException
    {
        String sql="select * from " + tablename + " where " + columnname  + " = ? ";
       
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,student_id);
        ResultSet rs=pstmt.executeQuery();       
        if (rs.next()){
             return true;
        }
             else
             {
            return false;
            }
    }
    
    public ResultSet QueryList(Connection con,String tablename,String columnname,String pno) throws SQLException
    {
        String sql="";
        
    if (pno.isEmpty()){
        sql="select * from " + tablename;
       
        PreparedStatement pstmt=con.prepareStatement(sql);
        return pstmt.executeQuery();
    }
    else 
    {
        sql="select * from " + tablename + " where " + columnname  + " = ? "; 
       
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,pno);
        return pstmt.executeQuery();
    }             
    }
    
    public int studentModify(Connection con, Student student)throws Exception{
        String sql="update student set student_password = ? ,student_name = ?, student_sex = ?, student_department = ?, student_major = ?,student_tele = ? where student_id = ?";
        PreparedStatement  pstmt=con.prepareStatement(sql);
		
        pstmt.setString(1,student.getStudentPassword());
        pstmt.setString(2,student.getStudentName());
        pstmt.setString(3,student.getStudentSex());
        pstmt.setString(4,student.getStudentDepartment());
        pstmt.setString(5,student.getStudentMajor());
        pstmt.setString(6,student.getStudentTele());
        pstmt.setString(7,student.getStudentId());
        return pstmt.executeUpdate();
    }
    
    public int ConfirmDelete(Component com,String str,String no)
    {
       int n= JOptionPane.showConfirmDialog(com, "确定要删除" + str + no +"吗？");  
       return n;
    }
    
    public int studentDelete(Connection con, String student_id) throws SQLException {
        String sql = "delete from student where student_id=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, student_id);
        return pstmt.executeUpdate();
    }
    
    public String Query1Passwd(Connection con,Administrator Administrator) throws SQLException
    {
        String sql ="select m_password from administrator where m_id = ? ";
        PreparedStatement pstmt=con.prepareStatement(sql);
       
        pstmt.setString(1,Administrator.getMId());
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
             return rs.getString("m_password");
        }
             else
            {
            return "";
            }    
    }
    
    public int Modify1Password(Connection con,Administrator Administrator)throws Exception{
		String sql="update administrator set m_password = ?  where m_id = ?";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		
		pstmt.setString(1,Administrator.getMPassword());
		pstmt.setString(2,Administrator.getMId());
                
		return pstmt.executeUpdate();

	}
}
