package NguyenTheNam_Bai2;

public class KyThuat extends NhanVien{

	private String chuyenNganh;
	
	public KyThuat() {
		super();
	}
	
	public KyThuat(String maNhanvien) {
		super(maNhanvien);
	}

	public KyThuat(String maNhanvien, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
		super(maNhanvien, hoTen, namSinh, diaChi);
		this.chuyenNganh = chuyenNganh;
	}


	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	@Override
	public String toString() {
		return "KyThuat [toString()=" + super.toString() + ", chuyenNganh=" + chuyenNganh + "]";
	}


	@Override
	public String moTaCongviec() {
		// TODO Auto-generated method stub
		return " Sua chua va giam sat cac May Tinh";
	}
	
	

}
