package NguyenTheNam_Bai2;

public abstract class NhanVien {
	private String maNhanvien;
	private String hoTen;
	private String namSinh;
	private String diaChi;
	
	public NhanVien() {
		super();
	}
	
	public NhanVien(String maNhanvien) {
		super();
		this.maNhanvien = maNhanvien;
	}
	public NhanVien(String maNhanvien, String hoTen, String namSinh, String diaChi) {
		super();
		this.maNhanvien = maNhanvien;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.diaChi = diaChi;
	}
	public String getMaNhanvien() {
		return maNhanvien;
	}
	// khong cho set maNhanVien
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		return "NhanVien [maNhanvien=" + maNhanvien + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", diaChi=" + diaChi
				+ "]";
	}
	// phuong thuc truu tuong
	public abstract String moTaCongviec();

}
