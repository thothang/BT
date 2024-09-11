import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class DanhSachCongNhan {
      private ArrayList<CongNhan> danhSach;
      private int maxSize;
      public void DanhSachCongnhan(int maxSize) {
    	  this.maxSize = maxSize;
    	  this.danhSach = new ArrayList<>(maxSize);
      }
      public boolean themCongNhan(CongNhan cn) {
    	  if(danhSach.size() < maxSize ) {
    		  danhSach.add(cn);
    		  return true;
    	  }
    	  return false;
      }
     public void xuatToanBo() {
    	 for (CongNhan cn : danhSach) {
    		 System.out.println(cn);
    	 }
      }
     public int soLuongCongnNhan() {
    	 return danhSach.size();
     }
     public void xuatCongNhanTren200SP() {
    	 for (CongNhan cn : danhSach) {
    		 if (cn.getSoSP() > 200) {
    			 System.out.println(cn);
    		 }
    	 }
     }
     @SuppressWarnings("unchecked")
	public void xapXeptheoSoSP() {
    	Collections.sort(danhSach, new comparator<CongNhan>()); 
    	@override
        public int  compare(CongNhan cn1, CongNhan cn2) {
    		retuen Integer = compare(cn2.setsoSp, cn1.getSoSP());
    	     }
     } 
}