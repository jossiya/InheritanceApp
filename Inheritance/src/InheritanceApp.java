class Cal{
	public int sum(int v1,int v2) {
		return v1+v2;
	}
	//Overloading 매서드 이름이 같아도 안에 조건이 다르면 사용 가능
	public int sum(int v1,int v2,int v3) {
		return v1+v2+v3;
	}
}
class Cal3 extends Cal{
	public int minus(int v1,int v2) {
		return v1-v2;
	}
	//부보가 가지고있는 매소드를 제정의 Overriding
	public int sum(int v1,int v2) {
		System.out.println("Cal3!!");
		return v1+v2;
	}
}
public class InheritanceApp {
	public static void main(String[] args) {
		Cal c= new Cal();
		 System.out.println(c.sum(2,1));
		 System.out.println(c.sum(2,1,1));
		 
		 Cal3 c3= new Cal3();
		 System.out.println(c3.sum(2, 1));
		 System.out.println(c3.minus(2,1));
	}
}
	