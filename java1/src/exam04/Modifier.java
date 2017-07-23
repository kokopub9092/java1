package exam04;

public class Modifier {
	
	public int pubNum; // 어디서든, 어느 타입이든 모든 접근 가능하다. 
	private int priNum; // 절대 접근 불가능
	int defNum; // 접근제어자 설정이 없다. 아무것도 설정해놓지 않으면 default로 설정이 된다. 패키지가 다르면 사용 불가능
	protected int proNum; // 같은 패키지 안에서 사용 가능, 다른 패키지여도 상속을 받으면 접근 가능.
	
	
	
//	public static void main(String[] args) {
//		Modifier e = new Modifier();
//		e.pubNum = 3;
//		e.defNum = 4;
//	}
	

}
