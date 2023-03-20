package Function;

public class Ac {
	String brand;
	int price;
	int rating;
	boolean isInventor;
	/*public String FindMaxObj(Ac [] acs) {
		int max=acs[0].price;
		String names="";
		for(int i=0;i<acs.length;i++) {
			if(acs[i].price>=max) {
				max=acs[i].price;
				names=acs[i].brand;
			}
		}
		return names; 
		
	}*/
	public Ac FindObj(Ac [] acs) {
		Ac max=acs[0];
		for(int i=0;i<acs.length;i++) {
			if(acs[i].price>=max.price) {
				max=acs[i];
			}
		}
		return max;
	}

}
