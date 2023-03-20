package Function;

public class Car {
	String brand;
	int price;
	String color;
	int rating;
	int model;
	boolean isLuxary;
	
	public Car findMaxLengthBrand(Car [] cars) {
		Car max=cars[0];
		for(int i=0;i<cars.length;i++) {
			if(cars[i].brand.length()>=max.brand.length()) {
				max=cars[i];
			}
		}
		return max;
	}
	public void rating(Car[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i].rating>3&&a[i].rating<=5) {
				System.out.println(a[i].brand);
			}
		}
	}
	public void isLuxary(Car[] cars) {
		for(int i=0;i<cars.length;i++) {
			if(cars[i].isLuxary==true) {
				System.out.println(cars[i].price);
			}
		}
	}
	public void brandLength(Car [] cars) {
		for(int i=0;i<cars.length;i++) {
			if(cars[i].brand.length()%2==0) {
				System.out.println(cars[i].brand+","+cars[i].price+","+cars[i].color+","+cars[i].rating+","+cars[i].model+","+cars[i].isLuxary);
			}
		}
	}

}
