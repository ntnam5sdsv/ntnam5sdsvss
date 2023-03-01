package OOP_Interface2;
import java.util.Scanner;
public class HCN implements Hinhhoc, initFromKeyboard {
	public double chieuDai;
	public double chieuRong;
	
	public HCN() {
		super();
	}
	public HCN(double chieuDai, double chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	

	public double getChieuDai() {
		return chieuDai;
	}


	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}
	

	@Override
	public String toString() {
		return "HCN [chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + "]";
	}


	public double getChieuRong() {
		return chieuRong;
	}


	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}


	@Override
	public double tinhCV() {
		// TODO Auto-generated method stub
		return (chieuDai+chieuRong)*2;
	}

	@Override
	public double tinhDT() {
		// TODO Auto-generated method stub
		return chieuDai*chieuRong;
	}


	@Override
	public void initFromKeyboard(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.print(" Nhap vao chieu dai: ");
		chieuDai= Double.parseDouble(scanner.nextLine());
		
		System.out.print(" Nhap vao chieu rong: ");
		chieuRong= Double.parseDouble(scanner.nextLine());
		
		
	}
	

}
