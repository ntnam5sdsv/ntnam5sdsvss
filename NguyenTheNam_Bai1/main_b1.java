package NguyenTheNam_Bai1;

public class main_b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		c1.setRadius(3.4);
		System.out.println(c1.toString()+" " + "co chu vi la: "+ c1.getCircumference());
		System.out.println(c1.toString()+" " + "co dien tich la: "+ c1.getArea());

		Circle c2= new Circle(4);
		System.out.println(c2.toString()+" " + "co chu vi la: "+ c2.getCircumference());
		System.out.println(c2.toString()+" " + "co dien tich la: "+ c2.getArea());
	}

}
