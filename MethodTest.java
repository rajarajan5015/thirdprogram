package Function;

public class MethodTest {
	public String checkOddOrEven(int a) {
		if(a%2==0) {
			return "even";
		}
		else {
			return "odd";
			}
		}
	public String checkLengthOddOrEven(String n) {
		if(n.length()%2==0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
	public int add(int a,int b,int c,int d) {
		 return (a+b+c+d);
		
	}
	public void number(int a,int b,int c,int d) {
		int [] nums= {a,b,c,d};
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				System.out.println(nums[i]);
				
			}
		}
	}
	public int FindTotal(int [] num) {
		int max=0;
		for(int i=0;i<num.length;i++) {
			max=max+num[i];
			}
		return max;
	}
	public int FindMaxi(int [] nums) {
		int max=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=max) {
				max=nums[i];
			}
		}
		return max;
			
		}
	public void FindVowels(String[] name) {
		for(int i=0;i<name.length;i++) {
			if(name[i].startsWith("a")||name[i].startsWith("e")||name[i].startsWith("i")||name[i].startsWith("o")||name[i].startsWith("u")) {
				System.out.println(name[i]);
			}
		}
	}
	}

