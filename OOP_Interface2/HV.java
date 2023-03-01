package OOP_Interface2;

import java.util.Scanner;

public class HV implements Hinhhoc, initFromKeyboard {
	public double canh;
	

	public HV() {
		super();
	}
	public HV(double canh) {
		super();
		this.canh = canh;
	}
	public double getCanh() {
		return canh;
	}
	public void setCanh(double canh) {
		this.canh = canh;
	}
	@Override
	public double tinhCV() {
		// TODO Auto-generated method stub
		return 4*canh;
	}
	@Override
	public double tinhDT() {
		// TODO Auto-generated method stub
		return canh*canh;
	}
	@Override
	public String toString() {
		return "HV [canh=" + canh + "]";
	}
	@Override
	public void initFromKeyboard(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.print(" Nhap vao chieu dai canh: ");
		canh= Double.parseDouble(scanner.nextLine());	
	}

}
