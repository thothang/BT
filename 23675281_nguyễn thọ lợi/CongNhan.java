
public class CongNhan {
       private String maCN;
       private String hoTen;
       private int soSP;
       
    public CongNhan() {
    	this.maCN ="";
    	this.soSP =0;
    	this.hoTen ="";
    }
       
    public CongNhan(String maCN, String hoTen, int soSP) {
    	this.maCN= maCN;
    	this.soSP= soSP;
    	this.hoTen = hoTen;
    }       
	public String getMaCN() {
		return maCN;
	}
	public void setMaCN(String maCN) {
		this.maCN = maCN;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getSoSP() {
		return soSP;
	}
	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}
	
	public double tinhLuong() {
		double donGia;
		if (soSP < 200) {
			donGia = 0.5;
		} else if(soSP < 400){
			donGia =0.55;
		} else if(soSP <600) {
			donGia = 0.6;
		} else {
			donGia = 0.65;
		}
		return soSP * donGia;
	}
       @Override
    public String toString() {
    	return "Cong Nhan [Ma CN: " + maCN +", Ho Ten: " + hoTen +", So SP:"+ soSP +", luong: "+ tinhLuong +"]";
    }
}
