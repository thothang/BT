
public class test {
	public class Main {
	  {
	        DanhSachCongNhan danhSach = new DanhSachCongNhan(10);
	              
	        danhSach.themCongNhan(new CongNhan("CN001", "Nguyen Van A", 150));
	        danhSach.themCongNhan(new CongNhan("CN002", "Tran Thi B", 250));
	        danhSach.themCongNhan(new CongNhan("CN003", "Le Van C", 300));
	        
	        System.out.println("Thông tin tất cả công nhân:");
	        danhSach.xuatToanBo();
	        
	        System.out.println("Số lượng công nhân: " + danhSach.soLuongCongNhan());
	        
	  	    System.out.println("Công nhân làm trên 200 sản phẩm:");
	        danhSach.xuatCongNhanTren200SP();
	        	    
	        danhSach.sapXepTheoSoSP();
	        System.out.println("Danh sách công nhân sau khi sắp xếp:");
	        danhSach.xuatToanBo();
	    }
	}
}
