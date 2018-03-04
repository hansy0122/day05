package day05;

public class Earth {
	
	static final double EARTH_RADIUS=6400; // 상수는 대문자로 snake_Case라고 부르는 명명법을 따름.
	static final double EARTH_SURFACE_AREA;
	
	static{
		EARTH_SURFACE_AREA=4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
	
	public static void main(String ar[]){
		System.out.println(""+Earth.EARTH_RADIUS);
		System.out.println(""+Earth.EARTH_SURFACE_AREA);
		System.out.printf("%f",Earth.EARTH_SURFACE_AREA);
	}

}
