<%-- 
    Document   : products
    Created on : Jan 22, 2018, 8:07:57 PM
    Author     : S
--%>

<%@page import="Execute.BrandDropDown"%>
<%@page import="Model.ThongTinLapTop"%>
<%@page import="Model.Brand"%>
<%@page import="Execute.SanPhamHome"%>
<%@page import="java.lang.String"%>
<%@page import="Model.DanhMuc"%>
<%@page import="Execute.SanPhamTheoHang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" >
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/css/dropdownlist.css" rel="stylesheet" type="text/css" >
        <title>JSP Page</title>
    </head>
    <body>
        <%
           SanPhamHome spHome = new SanPhamHome();
           SanPhamTheoHang spTheoHang = new SanPhamTheoHang();
           BrandDropDown brandDropDown = new BrandDropDown();
            //for(SanPham s : spTheoHang.getListProductByHangSanXuat(String hangSX) ) {
        %>
        <header>
        <div id="action">
            <a href="#">Menu</a>
            <ul id="nav">
                <li id="action"><a href="indexHome.jsp">Home</a></li>
                <li id="action"><a href="#">Danh Muc</a></li>
                    
                <div class="dropdown">
                        <button class="dropbtn">Nhà sản xuất</button>
                        <div class="dropdown-content">
                            <%
                                for(Brand b : brandDropDown.getListBrand()) {
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

        <!-- ------------------------------------------------------ -->
        
        <div id="site-wrapper">
		<div class="products.homepage">
                <!-- products.homepage productsHomepage -->
                    <ul style="margin-left: 10px;">
                            <%
                                //String ind = "";
                                String val="";

                                if(request.getParameter("loai")!=null){
                                    val = request.getParameter("loai");
                                }
                                //for(ThongTin t: spHome.getListThongTin(Integer.parseInt(val))) {
                                for(ThongTinLapTop t: spTheoHang.getListThongTinTheoHang(Integer.valueOf(val))) {
                            %>
                            <li class="preorder"><span class="tagimg "></span> <a
                            href="detail.jsp?ma_san_pham="> 
                                <!--    <img src="img/samsung-galaxy-s6-edge-64gb-200x200.jpg" width=" 250px" height="250px" /> -->
                                <!--    <img id="hinhanh" src="<c:url value='/img/HP-Probook-450.png'/>" alt=.../>  -->
                                
                                <!--   <img src="<%=request.getContextPath()%>/img/HP-Probook-450.png " width=" 250px" height="250px"/> -->
                                    <img src="<%=request.getContextPath()%><%=t.getLinkHinhAnh()%> " width=" 250px" height="250px"/>  

				<!--	<h3>Galaxy S6 Edge 64GB</h3>    -->
                                        <h3><%=t.getTenLapTop() %></h3>
					<h4>
						Giá:
						18.490.000 VNĐ
					</h4> <span class="textkm">Khuyến mãi trị giá đến <strong>500.000₫</strong>
				</span>
                                <p class="info">
					<!--	<span>Màn hình: QuadHD, 5.1'</span>
						<span>HĐH: Android 4.4 (KitKat)</span> 
						<span>CPU: 4 nhân 2.7GHz</span>
						<span>Camera: 16M</span>
						<span>Dung lượng pin: 3000mAh</span>
                                        -->
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
        
    </body>
</html>
