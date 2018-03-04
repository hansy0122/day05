package day05;


public class OsUtil {
	private static final String CRLF="/r/n"; // 커서 앞으로 // 라인 한칸 내리기 
	private static final String ROOT="c://";
	private static final String OS_NAME=getOsName();
	private static final String VERSION="10.001";
	private static final int enterKeycode=13;
	
	public static String getOsName(){
		return System.getProperty("os.name");
	}
	
	public static void main(String[] ar){
		//CRLF="wwww"; compile error
		
		System.out.println(OsUtil.OS_NAME);
		
	}
	
}
