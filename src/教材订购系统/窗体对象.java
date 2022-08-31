package 教材订购系统;

import java.awt.Component;
import javax.swing.JOptionPane;

public class 窗体对象 {
    public 控件 theControlObject;
    public Booklist theBook[];
    
    public 窗体对象()
    {
        
    }
    public void GetCourseInfo()
    {
       
    }
    public void ShowInfo(Component com,String strinfo)
    {
        JOptionPane.showMessageDialog(com, strinfo);    
    }
    public void ShowSuccessInfo(Component com,String strinfo)
    {
        JOptionPane.showMessageDialog(com, strinfo);    
    }
   
    public void ShowConfirmPage(String strInfo)
    {
        
    }
    public void ConfirmDelete()
    {
                
    }
    public void SelectCommand()
    {
        
    }
    public void DisplayCourseList(Booklist[] courselist)
    {
        
    }
    
    public void QuerySelectedCourse(int studentID)
    {
        
    }
}
