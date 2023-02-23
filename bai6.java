package Day1;
import java.util.Scanner;
public class bai6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		/*Nhập vào 3 số a, b, c từ bàn phím, 
		Hỏi a, b, c có phải 3 cạnh của tam giác hay ko?
				Nếu có hãy tính chu vi và diện tích */
		Scanner in=new Scanner(System.in);
		System.out.print("Nhap 3 so a b c: ");
		double a= in.nextDouble();
		double b= in.nextDouble();
		double c= in.nextDouble();
		in.close();
		if(a+b>c && a+c>b && b+c>a) {
			System.out.print("a b c la 3 canh cua tam giac");
			double P= a+b+c;
			// _p la nua chu vi
			double _p=P/2;
			double S= Math.sqrt(_p*(_p-a)*(_p-b)*(_p-c));// ct heron
			System.out.printf("\n chu vi va dien tich tam giac lan luot la: %.3f cm va %.3f cm^2 ", P, S);
			
			//System.out.println();
		}
		else {
			System.out.print("a b c khong la 3 canh cua tam giac");
			System.exit(0);
		}
	}
}
