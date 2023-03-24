package quanLiCongNhan;

public class CongNhan {
	private String maCN, mHo, mTen;
	private double mSoSP;
	public String getMaCN() {
		return maCN;
	}
	public void setMaCN(String maCN) throws Exception {
		if (maCN!=null) {
			this.maCN = maCN;
		} else throw new Exception("Ma Cong Nhan loi");
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) throws Exception {
		if (mHo!=null) {
			this.mHo = mHo;
		} else throw new Exception("Ho Cong Nhan loi");
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) throws Exception {
		if (mTen!=null) {
			this.mTen = mTen;
		} else throw new Exception("Ten Cong Nhan loi");
	}
	public double getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(double mSoSP) throws Exception {
		if (mSoSP>0) {
			this.mSoSP = mSoSP;
		} else throw new Exception("So san pham loi");
	}
	
	public CongNhan() {
		this.maCN= "xxxxxxxx";
		this.mHo="yyyyyyyyy";
		this.mTen="zzzzzzzz";
		this.mSoSP = 500;
	}
	
	public CongNhan(String maCN, String mHo, String mTen, double mSoSP) throws Exception {
		if (maCN!=null) {
			this.maCN = maCN;
		} else throw new Exception("Ma Cong Nhan loi");
		if (mHo!=null) {
			this.mHo = mHo;
		} else throw new Exception("Ho Cong Nhan loi");
		if (mTen!=null) {
			this.mTen = mTen;
		} else throw new Exception("Ten Cong Nhan loi");
		if (mSoSP>0) {
			this.mSoSP = mSoSP;
		} else throw new Exception("So san pham loi");
	}
	public double tinhLuong() {
		if (getmSoSP()>=1 && getmSoSP()<=199) {
			return getmSoSP()*0.5;
		} else {
			if (getmSoSP()>199 && getmSoSP()<=399) {
			return getmSoSP()*0.55;
			}else {
				if (getmSoSP()>399 && getmSoSP()<=599) { 
					return getmSoSP()*0.6;
				}else {
					 return getmSoSP()*0.65;}
			 		}
				}
	}
	@Override
	public String toString() {
		return "CongNhan [maCN=" + maCN + ", mHo=" + mHo + ", mTen=" + mTen + ", mSoSP=" + mSoSP + ", tinhLuong()="
				+ tinhLuong() + "]";
	}
	
}
