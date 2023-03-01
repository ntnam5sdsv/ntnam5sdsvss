package OOP_Interface2;

import java.util.Scanner;

public class HinhTron implements Hinhhoc, initFromKeyboard {
	public double banKinh;

	
	public HinhTron() {
		super();
	}

	public HinhTron(double banKinh) {
		super();
		this.banKinh = banKinh;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	@Override
	public double tinhCV() {
		// TODO Auto-generated method stub
		return 2*Math.PI*banKinh;
	}

	@Override
	public double tinhDT() {
		// TODO Auto-generated method stub
		return Math.PI*banKinh*banKinh;
	}

	@Override
	public String toString() {
		return "HinhTron [banKinh=" + banKinh + "]";
	}

	@Override
	public void initFromKeyboard(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.print(" Nhap vao ban kinh: ");
		banKinh= Double.parseDouble(scanner.nextLine());	
	}
	
	

}
