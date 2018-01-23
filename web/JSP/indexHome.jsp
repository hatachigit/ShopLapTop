<%-- 
    Document   : HomeSanPham
    Created on : Jan 22, 2018, 5:01:30 PM
    Author     : S
--%>

<%@page import="Execute.BrandDropDown"%>
<%@page import="Model.ThongTinLapTop"%>
<%@page import="Execute.SanPhamTheoHang"%>
<%@page import="Execute.SanPhamHome"%>
<%@page import="Model.DanhMuc"%>
<%@page import="Model.Brand"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sản phẩm</title>
<link rel="stylesheet" href="css/product.css" type="text/css"/>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" >
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/dropdownlist.css" rel="stylesheet" type="text/css" >
</head>
<body>
    <header>
        <%
            SanPhamHome spHome = new SanPhamHome();
            SanPhamTheoHang spTheoHang = new SanPhamTheoHang();
            BrandDropDown brandDropDown = new BrandDropDown();
        %>
        <div id="action">
            <a href="#">Menu</a>
            <ul id="nav">
                <li id="action"><a href="indexHome.jsp">Trang Chủ</a></li>
                <li id="action"><a href="#">Danh Mục</a></li>
                    <div class="dropdown">
                        <button class="dropbtn">Nhà sản xuất</button>
                        <div class="dropdown-content">
                            <%
                                for(Brand b : spTheoHang.getListHangSanXuat()) {
                            %>
                            <li><a href="products.jsp?loai=<%=b.getidHang()%>"><%=b.getHangSanXuat()%></a></li>
                            <%
                                }
                            %>
                        </div>
                    </div>
            </ul>
        </div>
    </header>


    <br>
        <div id="site-wrapper">
		<ul class="products.homepage">
                <!-- products.homepage productsHomepage -->
                    <div style="margin-left: 10px;">
                        <%
                                //for(ThongTin t: spHome.getListThongTin(Integer.parseInt(val))) {
                                for(ThongTinLapTop t : spHome.getListThongTin()) {
                        %>

                        <li class="preorder"><span class="tagimg "></span> <a
				href="detail.jsp?ma_san_pham="> 
                            <!--    <img src="img/samsung-galaxy-s6-edge-64gb-200x200.jpg" width=" 250px" height="250px" /> -->
                                <img src="<%=request.getContextPath()%><%=t.getLinkHinhAnh()%> " width=" 250px" height="250px"/>
					<h3><%=t.getTenLapTop()%></h3>
					<h4>
						Giá:
						18.490.000 VNĐ
					</h4> <span class="textkm">Khuyến mãi trị giá đến <strong>500.000₫</strong>
				</span>
					<p class="info">
                                            <span><%=t.getManHinh()%></span> <br>
						<span><%=t.getCPU()%></span> <br>
						<span><%=t.getRAM()%></span> <br>
						<span><%=t.getVGA()%></span> <br>
						<span><%=t.getHDH()%></span> <br>
                                                <span><%=t.getTrongLuong()%></span> <br>
					</p>
			</a></li>
                        <%
                            }
                        %>
                    </div>
		</ul>
	</div>
    <footer>
          Footer                  
    </footer>
</body>
</html>
