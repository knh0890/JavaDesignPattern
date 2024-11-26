
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException{

		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2011, 13));
		
//		Cat cookie = navi(); // navi의 주소값을 cookie에 넣으므로 둘의 주소값이 같다                                                                                                                                                                         
		Cat cookie = navi.copy();                                                                                                                                                                       
		cookie.setName("cookie");
		cookie.getAge().setYear(2013);
		cookie.getAge().setValue(11);
		
		System.out.println(navi.getName());
		System.out.println(cookie.getName());
		
		System.out.println(navi.getAge().getYear());
		System.out.println(cookie.getAge().getYear());
		
		System.out.println(navi.getAge().getValue());
		System.out.println(cookie.getAge().getValue());
		
		
	}

}
