package Function;

public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="bmw";
		car1.price=1500000;
		car1.color="blue";
		car1.rating=4;
		car1.model=2016;
		car1.isLuxary=true;
		Car car2=new Car();
		car2.brand="aadi";
		car2.price=2000000;
		car2.color="white";
		car2.rating=3;
		car2.model=2017;
		car2.isLuxary=false;
		Car car3=new Car();
		car3.brand="tata";
		car3.price=150000;
		car3.color="black";
		car3.rating=2;
		car3.model=2007;
		car3.isLuxary=false;
		Car car4=new Car();
		car4.brand="valvo";
		car4.price=3500000;
		car4.color="blue";
		car4.rating=4;
		car4.model=2019;
		car4.isLuxary=true;
		Car[] cars= {car1,car2,car3,car4};
		System.out.println(car1.findMaxLengthBrand(cars).brand+" "+car1.findMaxLengthBrand(cars).price+" "+car1.findMaxLengthBrand(cars).color+" "+car1.findMaxLengthBrand(cars).rating+" "+car1.findMaxLengthBrand(cars).model+" "+car1.findMaxLengthBrand(cars).isLuxary);
		car1.rating(cars);
		car1.isLuxary(cars);
		car1.brandLength(cars);
	}

}
