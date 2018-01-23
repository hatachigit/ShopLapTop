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
    
public class Brand {
    private int idHang;
    private String HangSanXuat;
    
    public Brand(){
        
    }
    public Brand(int iDhang, String tenhang){
        this.idHang = iDhang;
        this.HangSanXuat = tenhang;
    }
    /*
    public String getTenHangSanXuat() {
        return TenHang;
    }
    public void setTenHangSanXuat(String tenhang) {
        this.TenHang = tenhang;
    }
    */
    public int getidHang() {
        return idHang;
    }
    public void setidHang(int iDHang) {
        this.idHang = iDHang;
    }
    
    public String getHangSanXuat(){
        return HangSanXuat;
    }
    public void setHangSanXuat(String hangsanxuat){
        this.HangSanXuat= hangsanxuat;
    }
}
