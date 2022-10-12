package entity;

import java.util.Objects;

public class NhaXuatBan {
	private String maNhaXuatBan, tenNhaXuatBan, diaChi, soDienThoai, email;

	public NhaXuatBan(String maNhaXuatBan, String tenNhaXuatBan, String diaChi, String soDienThoai, String email) {
		super();
		this.maNhaXuatBan = maNhaXuatBan;
		this.tenNhaXuatBan = tenNhaXuatBan;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.email = email;
	}

	public NhaXuatBan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMaNhaXuatBan() {
		return maNhaXuatBan;
	}

	public void setMaNhaXuatBan(String maNhaXuatBan) {
		this.maNhaXuatBan = maNhaXuatBan;
	}

	public String getTenNhaXuatBan() {
		return tenNhaXuatBan;
	}

	public void setTenNhaXuatBan(String tenNhaXuatBan) {
		this.tenNhaXuatBan = tenNhaXuatBan;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "NhaXuatBan [maNhaXuatBan=" + maNhaXuatBan + ", tenNhaXuatBan=" + tenNhaXuatBan + ", diaChi=" + diaChi
				+ ", soDienThoai=" + soDienThoai + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(maNhaXuatBan);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhaXuatBan other = (NhaXuatBan) obj;
		return Objects.equals(maNhaXuatBan, other.maNhaXuatBan);
	}

	public NhaXuatBan(String tenNhaXuatBan) {
		super();
		this.tenNhaXuatBan = tenNhaXuatBan;
	}
	
}
