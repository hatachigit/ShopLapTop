/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execute;

import Database.Connect;
import Model.Brand;
import Model.DanhMuc;
import Model.ThongTinLapTop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author S
 */
public class SanPhamTheoHang {
    public ArrayList<Brand> getListHangSanXuat() throws SQLException {
        Connection connection = Connect.getConn();
        //String sql = "SELECT * FROM DanhMuc WHERE HangSanXuat='"+hangSX+"'";
        //String sql = "SELECT * FROM Brand WHERE idHang='"+iDHang+"'";
        String sql = "SELECT * FROM Brand ";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Brand> list = new ArrayList<>();
        while (rs.next()) {
            Brand lt = new Brand();
            lt.setidHang(rs.getInt("idHang"));
            lt.setHangSanXuat(rs.getString("HangSanXuat"));
            list.add(lt);
        }
        return list;
    }

    public ArrayList<Brand> getListSanPhamByHangSanXuat_n(int iDHang) throws SQLException
    {
        Connection connection = Connect.getConn();
        //String sql = "SELECT * FROM DanhMuc WHERE HangSanXuat='"+hangSX+"'";
        String sql = "SELECT * FROM Brand WHERE idHang='"+iDHang+"' ";
        //String sql = "SELECT * FROM Brand ";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Brand> list = new ArrayList<>();
        while (rs.next()) {
            Brand d = new Brand();
            d.setidHang(rs.getInt("idHang"));
            d.setHangSanXuat(rs.getString("HangSanXuat"));
            list.add(d);
        }
        return list;
    }
    
    public ArrayList<ThongTinLapTop> getListThongTinTheoHang(int iDHang) throws SQLException {
        Connection connection = Connect.getConn();
        String sql = "SELECT * FROM ThongTinLapTop WHERE idHang ='"+iDHang+"' ";
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
    
    public static void main(String[] args) throws SQLException {
        SanPhamTheoHang da = new SanPhamTheoHang();
        //for (Brand lt : da.getListSanPhamByHangSanXuat_n(2)) {
        //    System.out.println(lt.getHangSanXuatID() + " - " + lt.getTenHangSanXuat());
        //}
    }
}
