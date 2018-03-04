package day05;
import static day05.OsUtil.*;
import static java.util.Calendar.*; //static 만 사용가능함. 
public class StaticImport {

	public static void main(String ar[]){
		System.out.println(getOsName());
		System.out.println(OsUtil.getOsName());
	}
}
