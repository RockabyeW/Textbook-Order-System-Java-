package 教材订购系统;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import 教材订购系统.Orderlist;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-07T16:00:10")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, String> studentId;
    public static volatile SingularAttribute<Student, String> studentPassword;
    public static volatile SingularAttribute<Student, String> studentTele;
    public static volatile SingularAttribute<Student, String> studentDepartment;
    public static volatile SingularAttribute<Student, String> studentMajor;
    public static volatile SingularAttribute<Student, String> studentName;
    public static volatile SingularAttribute<Student, String> studentSex;
    public static volatile SingularAttribute<Student, Orderlist> orderlist;

}