package Function;

public class UseAc {
	public static void main(String[] args) {
		Ac ac=new Ac();
		Ac ac1=new Ac();
		ac1.brand="lg";
		ac1.price=17000;
		ac1.rating=4;
		ac1.isInventor=true;
		Ac ac2=new Ac();
		ac2.brand="croma";
		ac2.price=14000;
		ac2.rating=3;
		ac2.isInventor=true;
		Ac ac3=new Ac();
		ac3.brand="voltas";
		ac3.price=23000;
		ac3.rating=5;
		ac3.isInventor=true;
		
		System.out.println(ac3.brand);
		Ac[] acs= {ac1,ac2,ac3};
		//System.out.println(ac1.FindMaxObj(acs));
		System.out.println(ac.FindObj(acs).brand);
		
	}

}
