package 教材订购系统;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import 教材订购系统.Inventory;
import 教材订购系统.Lack;
import 教材订购系统.Restocking;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-07T16:00:10")
@StaticMetamodel(Booklist.class)
public class Booklist_ { 

    public static volatile SingularAttribute<Booklist, String> bookPress;
    public static volatile SingularAttribute<Booklist, Restocking> restocking;
    public static volatile SingularAttribute<Booklist, Float> bookPrice;
    public static volatile SingularAttribute<Booklist, Inventory> inventory;
    public static volatile SingularAttribute<Booklist, String> bookName;
    public static volatile SingularAttribute<Booklist, Lack> lack;
    public static volatile SingularAttribute<Booklist, String> bookId;

}