/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execute;

import Database.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Model.DanhMuc;
import Model.ThongTinLapTop;

/**
 *
 * @author TUNGDUONG
 */
public class SanPhamHome {

    // get danh sách thể loại
    public ArrayList<DanhMuc> getListSanPham() throws SQLException {
        Connection connection = Connect.getConn();
        String sql = "SELECT * FROM DanhMuc";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<DanhMuc> list = new ArrayList<>();
        while (rs.next()) {
            DanhMuc sp = new DanhMuc();
            sp.setSanPhamID(rs.getInt("id"));
            //sp.setHangSanXuatID(rs.getInt("idHang"));
            sp.setMaLapTop(rs.getString("MaLapTop"));
            sp.setTenLapTop(rs.getString("TenLapTop"));
            sp.setTenHangSanXuat(rs.getString("HangSanXuat"));
            sp.setHinhAnh(rs.getString("HinhAnh"));
            sp.setDescription(rs.getString("Description"));
            list.add(sp);
        }
        return list;
    }
    //--------------------------------------------------------------
    public ArrayList<DanhMuc> getListSanPhamByHangSanXuat(int iDHang) throws SQLException {
        Connection connection = Connect.getConn();
        String sql = "SELECT * FROM DanhMuc WHERE idHang='"+iDHang+"' ";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<DanhMuc> list = new ArrayList<>();
        while (rs.next()) {
            DanhMuc s = new DanhMuc();
            s.setHangSanXuatID(rs.getInt("id"));
            s.setHangSanXuatID(rs.getInt("idHang"));
            s.setMaLapTop(rs.getString("MaLapTop"));
            s.setTenLapTop(rs.getString("TenLapTop"));
            s.setTenHangSanXuat(rs.getString("HangSanXuat"));
            s.setHinhAnh(rs.getString("HinhAnh"));
            s.setDescription(rs.getString("Description"));
            list.add(s);
        }
        return list;
    }
    
    public ArrayList<ThongTinLapTop> getListThongTin() throws SQLException {
        Connection connection = Connect.getConn();
        String sql = "SELECT * FROM ThongTinLapTop";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<ThongTinLapTop> list = new ArrayList<>();
        while (rs.next()) {
            ThongTinLapTop t = new ThongTinLapTop();
            t.setidThongTin(rs.getInt("idThongTin"));
            t.setSanPhamID(rs.getInt("id"));
            t.setidHang(rs.getInt("idHang"));
            t.setHangSanXuat(rs.getString("HangSanXuat"));
            t.setMaLapTop(rs.getString("MaLapTop"));
            t.setTenLapTop(rs.getString("TenLapTop"));
            t.setManHinh(rs.getString("ManHinh"));
            t.setCPU(rs.getString("CPU"));
            t.setRAM(rs.getString("RAM"));
            t.setVGA(rs.getString("VGA"));
            t.setHDH(rs.getString("HDH"));
            t.setTrongluong(rs.getString("TrongLuong"));
            t.setLinkHinhAnh(rs.getString("LinkHinhAnh"));
            list.add(t);
        }
        return list;
    }
    //-------------------------------
    public static void main(String[] args) throws SQLException {
        SanPhamHome dao = new SanPhamHome();
        
        for (DanhMuc ds : dao.getListSanPham()) {
            System.out.println(ds.getSanPhamID() + " - " + ds.getMaLapTop());
        }
    }

}
