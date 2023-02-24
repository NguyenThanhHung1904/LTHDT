package quanliCD;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class CD {
	private String maCD;
	private String tuaCD;
	private Calendar ngayPH;
	private double donGia;
	private int soBH;


	public String getMaCD() {
		return maCD;
	}
	public void setMaCD(String maCD) throws Exception {
		if(maCD!="") {
		this.maCD = maCD;
		}
		else throw new Exception("Ma loi");
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) throws Exception {
		if(tuaCD!="") {
			this.tuaCD = tuaCD;
			}
			else throw new Exception("Tua loi");
	}
	public Calendar getNgayPH() {
			return ngayPH;
	}
	public void setNgayPH(Calendar ngayPH) throws Exception {
		if(ngayPH!=null) {
			this.ngayPH = ngayPH;
			}
			else throw new Exception("Ngay phat hanh loi");
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(Double donGia) throws Exception {
		if(donGia>0) {
			this.donGia = donGia;
			}
			else throw new Exception("Don gia phai lon hon 0");
	}
	public int getSoBH() {
		return soBH;
	}
	public void setSoBH(int soBH) throws Exception {
		if(soBH>0) {
			this.soBH = soBH;
			}
			else throw new Exception("So bai hat phai lon hon 0");
	}

	public CD() {
		Calendar c1= Calendar.getInstance(lc);
		this.maCD="0000000000";
		this.tuaCD="xxxxxxxxxxx";
		Calendar ngayPH= Calendar.getInstance();
		this.ngayPH= c1;
		this.donGia= 10000;
		this.soBH=0;
	}
	public CD(String ma, String tua, Calendar ngay,double donGia, int soBH) throws Exception{
		if(ma!=null) {
			this.maCD=ma;
		} else throw new Exception("ma loi");
		if (tua!=null) {
			this.tuaCD=tua;
		} else throw new Exception("Tua rong");
		if (ngay!=null) {
			this.ngayPH=ngay;
		} else throw new Exception("ngay rong");
		if (donGia >0) {
			this.donGia= donGia;
		} else throw new Exception(" Don gia phai lon hon 0");
		if (soBH >0) {
			this.soBH= soBH;
		} else throw new Exception(" So bai hat phai lon hon 0");		
	}
	public double getThanhTien() {
		return getDonGia()*getSoBH();
	}
		public void tieuDe() {
		System.out.println("Test ket qua");
		for (int i = 0; i <72; i++)
				System.out.printf("-");
		System.out.println();
		System.out.printf("|%-10s|%-10s|%-14s|%-10s|%-10s|%-12s|\n","Ma CD","Tua CD","Ngay Phat Hanh",
				"Don Gia","So Bai Hat","Tong tien");
		for (int i = 0; i <72; i++)
				System.out.printf("-");
		System.out.println();
		}
		Locale lc= new Locale("vi", "VN");
		DateFormat df= DateFormat.getDateInstance(1, lc);
		NumberFormat sf= NumberFormat.getCurrencyInstance(lc);
		@Override
		public String toString() {
		String s="";
		s+=s.format("|%-10s|%-10s|%14s|%10s|%10s|%12s|",getMaCD(),getTuaCD(),df.format(getNgayPH().getTime()),
				sf.format(getDonGia()),getSoBH(),sf.format(getThanhTien()));
		return s;
		
	}
}