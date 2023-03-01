package OOP_Interface2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class mainnn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Them hinh hoc(toi da 100h)
//		2. in ra tat ca cac hinh
//		3. In ra hinh co dien tich lon nhat
//		4. in ra hinh co hien tich be nhat
//		5 . sap xep chu vi tang dan 
//		0. thoat
		//b1 tao menu
		//b2 nhap lua chon
		//b3 xu ly voi cac lua chon tuong ung
				// hop le -> tinh toan, thuc hien
				// k hop le -> thong bao nhap lai
		Scanner input= new Scanner(System.in);
		List<Hinhhoc>  hinhhocList= new ArrayList();
		List<Double> dientichList= new ArrayList();
		List<Double> chuviList= new ArrayList();
		double[] listCV= new double[hinhhocList.size()];
		do {
			// menu
			System.out.println("1. Them hinh hoc");
			System.out.println("2. In ra tat ca cac hinh");
			System.out.println("3. In ra hinh co dien tich lon nhat");
			System.out.println("4. In ra hinh co dien tich be nhat");
			System.out.println("5. Sap xep chu vi tang dan");
			System.out.println("0. Thoat");
			// menu
			System.out.println(" Vui long nhap lua chon: ");
			int option= Integer.parseInt(input.nextLine());
			if(option<0 || option >5) {
				System.out.println(" Lua chon khong hop le! ");
			continue;
			}
			// xu ly cac th hop le
			switch(option) {
			case 1:
				// co nhieu hinh khac nhau
				System.out.println(" \t Ban muon nhap hinh gi?");
			
				System.out.println("1. Hinh tron");
				System.out.println("2. Hinh vuong");
				System.out.println("3. Hinh chu nhat");
				int inputOption= Integer.parseInt(input.nextLine());
				Hinhhoc h= null;
				switch(inputOption) {
				case 1:
					h= new HinhTron();
					
;					break;
				case 2:
					h=new HV();
					break;
				case 3:
					h= new HCN();
					break;
				default: 
					System.out.println(" Khong hop le ");
				}
				((initFromKeyboard) h).initFromKeyboard(input);
				hinhhocList.add(h);
				dientichList.add(h.tinhDT());
				//double[] listCV= new double[hinhhocList.size()];
				//chuviList.add(h.tinhCV());
				break;
			case 2:
                for (int i = 0; i < hinhhocList.size(); i++) {
                    System.out.println(hinhhocList.get(i));
                    
                }
                break;
			case 3:
				double maxDT=dientichList.get(0);
				int index_maxDT=0;
				for(int i=1; i< dientichList.size(); i++) {
					if(maxDT< dientichList.get(i)) {
						maxDT=dientichList.get(i);
						index_maxDT=i;
					}
				}
				System.out.println("Hinh co dien tich lon nhat la: "+ (hinhhocList.get(index_maxDT)).toString());
				break;
			case 4:
				double minDT=dientichList.get(0);
				int index_minDT=0;
				for(int i=1; i< dientichList.size(); i++) {
					if(minDT > dientichList.get(i)) {
						minDT=dientichList.get(i);
						index_minDT=i;
					}
				}
				System.out.println("Hinh co dien tich nho nhat la: "+ (hinhhocList.get(index_minDT)).toString());
				break;
			case 5: // sap xep chu vi tang dan 
				// bubble sort
				Hinhhoc tmp;
				for(int i=0;i<hinhhocList.toArray().length; i++) {
					for(int j=0; j< hinhhocList.toArray().length-i-1; j++) {
						if(hinhhocList.get(j).tinhCV()>hinhhocList.get(j+1).tinhCV()) {
						// swap
							tmp = hinhhocList.get(j);
                            hinhhocList.set(j, hinhhocList.get(j+1));
                            hinhhocList.set(j+1, tmp);
						}
					}
				}
				System.out.println(" Sap sep chu vi theo thu tu tang dan la");
				for(int i=0;i<hinhhocList.toArray().length; i++) {
					System.out.println( " \t "+ hinhhocList.get(i).toString()+ " " + hinhhocList.get(i).tinhCV());
				}
				break;
			case 0:
				System.out.println(" Ket thuc chuong trinh ");
				input.close();
				System.exit(0);
				break;
			}	
		}
		while(true);

	}

}
