package day05;
import static day05.OsUtil.*;
import static java.util.Calendar.*; //static �� ��밡����. 
public class StaticImport {

	public static void main(String ar[]){
		System.out.println(getOsName());
		System.out.println(OsUtil.getOsName());
	}
}
