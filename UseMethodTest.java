package Function;

public class UseMethodTest {
	public static void main(String[] args) {
		MethodTest mt=new MethodTest();
		System.out.println(mt.checkOddOrEven(5));
		System.out.println(mt.checkLengthOddOrEven("raja"));
		 int x =mt.add(2, 3, 4, 5);
		 System.out.println(x);
		 mt.number(5, 6, 9, 8);
		 int [] num= {5,7,3,2};
		 System.out.println(mt.FindTotal(num));
		 int [] nums= {7,9,10,19};
		 System.out.println(mt.FindMaxi(nums));
		 String[] name= {"ajay","oviya","raja","ramu"};
		 mt.FindVowels(name);
	}
	}

