package NguyenTheNam_Bai2;

public class main_b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien kt1= new KyThuat("2019602722","Nguyen The Nam","2001","Thai Binh","DTVT");
		System.out.println(kt1);
		
		// nhan vien 2
		NhanVien kt2= new KyThuat("2019603022");
		kt2.setHoTen("Nguyen Duc Manh");
		kt2.setNamSinh("2001");
		kt2.setDiaChi("Thai Nguyen");
		((KyThuat) kt2).setChuyenNganh("CNTT");
		System.out.println(kt2);
	}

}
