package Day1;

import java.util.Scanner;

public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình tính chu vi và diện tích hình chữ nhật
		Scanner input=new Scanner(System.in);
		System.out.print("Nhap chieu dai 2 canh(cm): ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		input.close();
		if(a<=0||b<=0) {
			System.out.println("Nhap sai");
			System.exit(0);
		}
		else {
			double P=(a+b)*2;
			double S=a*b;
			System.out.printf("\n Chu vi va dien tich la: %.3f (cm) va %.3f (cm^2)", P,S);
		}

	}

}
