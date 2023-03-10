package nguyenThanhHung_09;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;



public class HangThucPham {
	private String maTP;
	private String tenTP;
	private Calendar ngaySX, ngayHH;
	private double donGia;
	
	public String getMaTP() {
		return maTP;
	}
	public void setMaTP(String maTP) throws Exception {
		if (maTP!="") {
			this.maTP = maTP;
		}
		else throw new Exception("Ma San Pham Loi:");
	}
	public String getTenTP() {
		return tenTP;
	}
	public void setTenTP(String tenTP) throws Exception {
		if (tenTP!="") {
			this.tenTP = tenTP;
		}
		else throw new Exception("Ten San Pham sai:");
	}
	public Calendar getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(Calendar ngaySX) throws Exception {
		if (ngaySX!=null) {
			this.ngaySX = ngaySX;
		}
		else throw new Exception("Ngay San Xuat loi:");
	}
	public Calendar getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(Calendar ngayHH) throws Exception {
		if (ngayHH!=null) {
			this.ngayHH = ngayHH;
		}
		else throw new Exception("Ngay Het Han loi:");
	}
	public double getDonGia()  {
		return donGia;
	}
	public void setDonGia(double donGia) throws Exception {
		if (donGia>0) {
			this.donGia = donGia;
		}
		else throw new Exception("Don Gia loi:");
	}
	
	public HangThucPham(String maTP, String tenTP, Calendar ngaySX, Calendar ngayHH, double donGia) throws Exception {

		if (maTP!="") {
			this.maTP = maTP;
		}
		else throw new Exception("Ma San Pham Loi:");
		if (tenTP!="") {
			this.tenTP = tenTP;
		}
		else throw new Exception("Ten San Pham sai:");
		if (ngaySX!=null) {
			this.ngaySX = ngaySX;
		}
		else throw new Exception("Ngay San Xuat loi:");
		if (ngayHH!=null) {
			this.ngayHH = ngayHH;
		}
		else throw new Exception("Ngay Het Han loi:");
		if (donGia>0) {
			this.donGia = donGia;
		}
		else throw new Exception("Don Gia loi:");
	}
	

	public HangThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		Locale lc = new Locale("vi", "VN");
		DateFormat df = DateFormat.getDateInstance(0, lc);
		return "HangThucPham [maTP=" + maTP + ", tenTP=" + tenTP + ", ngaySX=" + ngaySX + ", ngayHH=" + ngayHH.getCalendarType()
				+ ", donGia=" + donGia + "]";
	}
	
}
	

