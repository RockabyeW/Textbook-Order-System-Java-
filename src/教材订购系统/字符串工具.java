package 教材订购系统;

public class 字符串工具 {
public static boolean isEmpty(String str){
	if("".equals(str)||str==null){
		return true;
	}else{
		return false;
	}
}
public static boolean isNotEmpty(String str){
	if(!"".equals(str)&&str!=null){
		return true;
	}else{
		return false;
	}
}    
}
