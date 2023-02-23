package Day1;

import java.util.Scanner;

public class bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Giá phòng = giá cố định (theo hợp đồng) + tiền điện + tiền nước + dịch vụ...
			- Tiền điện: 4k/1 số
			- Tiền nước: 30k/1 khối
			- Dich vụ khác: 200k
			- Gia co dinh la 2tr500 
			Lưu ý: nhập tiền điện tháng trước/ này, số nước trước/này -> tính tự đông
				*/
		Scanner input=new Scanner(System.in);
		System.out.print(" Nhap vao so Dien thang truoc va thang nay lan luot: ");
		long beforePower=input.nextLong();
		long nowPower=input.nextLong();
		if(beforePower>nowPower) {
			System.out.println(" Nhap sai, moi nhap lai");
			System.exit(0);
			}
		System.out.print(" Nhap vao so Nuoc thang truoc va thang nay lan luot: ");
		long beforeWater=input.nextLong();
		long nowWater=input.nextLong();
		if(beforeWater>nowWater) {
			System.out.println(" Nhap sai, moi nhap lai");
			System.exit(0);
			}
		input.close();
		System.out.println(" Tien nha la: 2500 ");
		System.out.println(" Tien dich vu khac la: 200 ");
		long moneyPower= (nowPower-beforePower)*4;// 4k/so
		long moneyWater= (nowWater-beforeWater)*30;// 30k/khoi
		long sum= 2500 + 200 + moneyPower + moneyWater;
		System.out.printf(" Tong tien can thanh toan la: %d ",sum );
	}

}
