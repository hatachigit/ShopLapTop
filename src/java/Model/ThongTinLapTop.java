/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author S
 */
public class ThongTinLapTop {
    private int idThongTin;
    private int id;
    private int idHang;
    private String HangSanXuat;
    private String MaLapTop;
    private String TenLapTop;
    private String ManHinh;
    private String CPU;
    private String RAM;
    private String VGA;
    private String HDH;
    private String TrongLuong;
    private String LinkHinhAnh;
    
    public ThongTinLapTop(){
        
    }
    public ThongTinLapTop(int iDThongTin, int iD, int iDHang, String hangsanxuat, String manhinh, String cpu, String ram, String vga, String hdh, String trongluong, String linkhinhanh){
        this.idThongTin = iDThongTin;
        this.id = id;
        this.idHang = iDHang;
        this.HangSanXuat = hangsanxuat;
        this.ManHinh = manhinh;
        this.CPU = cpu;
        this.RAM = ram;
        this.VGA = vga;
        this.HDH = hdh;
        this.TrongLuong = trongluong;
        this.LinkHinhAnh = linkhinhanh;
    }
    /*
    public String getTenHangSanXuat() {
        return TenHang;
    }
    public void setTenHangSanXuat(String tenhang) {
        this.TenHang = tenhang;
    }
    */
    public int getidThongTin() {
        return idThongTin;
    }
    public void setidThongTin(int iDThongTin) {
        this.idThongTin = iDThongTin;
    }
    
    public int getSanPhamID() {
        return id;
    }
    public void setSanPhamID(int iD) {
        this.id = iD;
    }
    
    public int getidHang() {
        return idHang;
    }
    public void setidHang(int iDHang) {
        this.idHang = iDHang;
    }
    
    public String getHangSanXuat() {
        return HangSanXuat;
    }
    public void setHangSanXuat(String hangsanxuat) {
        this.HangSanXuat = hangsanxuat;
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
    
    public String getManHinh(){
        return ManHinh;
    }
    public void setManHinh(String manhinh){
        this.ManHinh= manhinh;
    }
    
    public String getCPU() {
        return CPU;
    }
    public void setCPU(String cpu) {
        this.CPU = cpu;
    }
    
    public String getRAM() {
        return RAM;
    }
    public void setRAM(String ram) {
        this.RAM = ram;
    }
    
    public String getVGA() {
        return VGA;
    }
    public void setVGA(String vga) {
        this.VGA = vga;
    }
    
    public String getHDH() {
        return HDH;
    }
    public void setHDH(String hdh) {
        this.HDH = hdh;
    }
    
    public String getTrongLuong() {
        return TrongLuong;
    }
    public void setTrongluong(String trongluong) {
        this.TrongLuong = trongluong;
    }
    
    public String getLinkHinhAnh() {
        return LinkHinhAnh;
    }
    public void setLinkHinhAnh(String linkhinhanh){
        this.LinkHinhAnh = linkhinhanh;
    }
}
