package Model;

public class DanhMuc {
 
    private int id;
    private int idHang;
    private String MaLapTop;
    private String TenLapTop;
    private String HangSanXuat;
    private String HinhAnh;
    private String Description;
 
    public DanhMuc() {
    }
 
    public DanhMuc(int iD, String maLapTop) {
        this.id = iD;
        this.MaLapTop = maLapTop;
    }
 
    public int getSanPhamID() {
        return id;
    }
    public void setSanPhamID(int iD) {
        this.id = iD;
    }
 
    public String getMaLapTop() {
        return MaLapTop;
    }
    public void setMaLapTop(String maLapTop) {
        this.MaLapTop = maLapTop;
    }
    
    public String getTenLapTop() {
        return TenLapTop;
    }
    public void setTenLapTop(String tenLapTop) {
        this.TenLapTop = tenLapTop;
    }
    
    public int getHangSanXuatID() {
        return idHang;
    }
    public void setHangSanXuatID(int iD) {
        this.idHang = iD;
    }
    public String getTenHangSanXuat(){
        return HangSanXuat;
    }
    public void setTenHangSanXuat(String hangSanXuat){
        this.HangSanXuat= hangSanXuat;
    }
    
    public String getHinhAnh(){
        return HinhAnh;
    }
    public void setHinhAnh(String hinhAnh){
        this.HinhAnh= hinhAnh;
    }
    
    public String getDescription(){
        return Description;
    }
    public void setDescription(String description){
        this.Description= description;
    }
}
