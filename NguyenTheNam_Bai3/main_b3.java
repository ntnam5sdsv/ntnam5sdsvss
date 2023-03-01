package NguyenTheNam_Bai3;

public class main_b3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VanBan v1= new VanBan(" Nguyen  The  Nam rat la dep trai");
		
		System.out.println(" ----- ");
		System.out.println(" Sau khi viet ve tieu chuan:) ");
		//v1.Standard(v1.getSt());
		System.out.println(v1.Standard(v1.getSt()));
		System.out.println(v1.toString() + " co "+v1.countWords(v1.getSt())+ " tu");
		// Thiet lap lai chuoi vaf countWord
		v1.setSt("Nguyen The Nam rat la dep trai dep trai dep trai dep trai");
		System.out.println(v1.toString() + " co "+v1.countWords(v1.getSt())+ " tu");
		
		v1.vietHoa();
		System.out.println(v1.getSt());
		v1.vietThuong();
		System.out.println(v1.getSt());
		
	}

}
