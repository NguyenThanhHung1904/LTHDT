package bai08;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class CD {
	private int maCD;
	private String tuaCD;
	private double giaThanh;
	private int soBH;
	public CD() {
		super();
	}
	public CD(int maCD, String tuaCD, int soBH, double giaThanh) {
		if (maCD<=0) 
			this.maCD= 999999;
		else 
			this.maCD= maCD;
		if (tuaCD==null) 
			this.tuaCD = "Chua xac dinh";
		else 
			this.tuaCD= tuaCD;
		this.soBH =soBH;
		this.giaThanh= giaThanh;
	}
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}
	public int getSoBH() {
		return soBH;
	}
	public void setSoBH(int soBH) {
		this.soBH = soBH;
	}
	
}

	