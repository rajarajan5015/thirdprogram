package Function;

public class UseMethodPractice {
	public static void main(String[] args) {
		MethodPractice mr=new MethodPractice();
		System.out.println(mr.name().toUpperCase());
		mr.degree();
		System.out.println(mr.age(1999));
		mr.bio("RAJA",24,"BE");
	}
}