package bai08;

public class DanhSachCD {
	public CD[] ls;
	int count;
	public DanhSachCD(int n) {
		ls = new CD[n];
		count=0;
	}
	public boolean themCD(CD cdr) {
		for(  int i=0; i<count; i++)
			if(cdr.getMaCD() == ls[i].getMaCD())	{
				return false;
			}
		ls[count]= cdr;
		count++;
		return true;
	}
	public void inKQ() {
		for(CD cd : ls)
			if(cd!=null)
			System.out.printf("|%10s|%10s|%10s|%10s\n",cd.getMaCD(),cd.getTuaCD(),cd.getSoBH(),cd.getGiaThanh());
	}
	public double tongGiaThanh() {
		double tong = 0;
		for( int i = 0; i < count; i++) 
			tong += ls[i].getGiaThanh();
			return tong;
	}
	public int timKiemCD(int maCD) {
		for( int i = 0 ; i< count; i++)
			if(ls[i].getMaCD()== maCD)
				return i;
		return -1;
	}
	public void xoaCD(int maCD) {
		int p = timKiemCD(maCD);
		if(p!= -1)
			for( int i = p; i< count; i++)
			{
				ls[i]= ls[i+1];
				count -= 1;
			}
	}
	public void sapXepGiaThanh() {
		for(int i=0; i< count-1; i++) {
			for( int j= i+1; j< count; j++) {
				CD tam = null;
				if(ls[i].getGiaThanh()<ls[j].getGiaThanh()) {
					tam = ls[i];
					ls[i]= ls[j];
					ls[j]= tam;
				}
			}
		}
	}
	public void sapXepTenCD() {
		for(int i=0; i< count; i++)
			for( int j= i+1; j< count ; j++) {
				CD tam = null;
				if(ls[i].getTuaCD().compareTo(ls[j].getTuaCD())>0) {
					tam = ls[i];
					ls[i]= ls[j];
					ls[j]= tam;
				}
			}
	}
}
