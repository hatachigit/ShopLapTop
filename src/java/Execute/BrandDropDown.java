/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execute;

import Database.Connect;
import Model.Brand;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author S
 */
public class BrandDropDown {
        
    public ArrayList<Brand> getListBrand() throws SQLException {
        Connection connection = Connect.getConn();
        String sql = "SELECT * FROM Brand ";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Brand> list = new ArrayList<>();
        while (rs.next()) {
            Brand t = new Brand();
            t.setidHang(rs.getInt("idHang"));
            t.setHangSanXuat(rs.getString("HangSanXuat"));
            list.add(t);
        }
        return list;
    }
    
    public static void main(String[] args) throws SQLException {
        BrandDropDown bd = new BrandDropDown();
        //for (Brand lt : da.getListSanPhamByHangSanXuat_n(2)) {
        //    System.out.println(lt.getHangSanXuatID() + " - " + lt.getTenHangSanXuat());
        //}
    }
}
