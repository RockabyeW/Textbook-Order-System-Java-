package 教材订购系统;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import 教材订购系统.Administrator;
import 教材订购系统.Booklist;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-07T16:00:10")
@StaticMetamodel(Restocking.class)
public class Restocking_ { 

    public static volatile SingularAttribute<Restocking, Booklist> booklist;
    public static volatile SingularAttribute<Restocking, Date> cDate;
    public static volatile SingularAttribute<Restocking, Integer> bookNumber;
    public static volatile SingularAttribute<Restocking, Administrator> mId;
    public static volatile SingularAttribute<Restocking, Integer> cNumber;
    public static volatile SingularAttribute<Restocking, Float> cPrice;
    public static volatile SingularAttribute<Restocking, String> mName;
    public static volatile SingularAttribute<Restocking, String> bookId;

}