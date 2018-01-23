package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Execute.BrandDropDown;
import Model.ThongTinLapTop;
import Execute.SanPhamTheoHang;
import Execute.SanPhamHome;
import Model.DanhMuc;
import Model.Brand;

public final class indexHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<!DOCTYPE html >\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Sản phẩm</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/product.css\" type=\"text/css\"/>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/style.css\" rel=\"stylesheet\" type=\"text/css\" >\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/dropdownlist.css\" rel=\"stylesheet\" type=\"text/css\" >\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        ");

            SanPhamHome spHome = new SanPhamHome();
            SanPhamTheoHang spTheoHang = new SanPhamTheoHang();
            BrandDropDown brandDropDown = new BrandDropDown();
        
      out.write("\n");
      out.write("        <div id=\"action\">\n");
      out.write("            <a href=\"#\">Menu</a>\n");
      out.write("            <ul id=\"nav\">\n");
      out.write("                <li id=\"action\"><a href=\"indexHome.jsp\">Trang Chủ</a></li>\n");
      out.write("                <li id=\"action\"><a href=\"#\">Danh Mục</a></li>\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"dropbtn\">Nhà sản xuất</button>\n");
      out.write("                        <div class=\"dropdown-content\">\n");
      out.write("                            ");

                                for(Brand b : spTheoHang.getListHangSanXuat()) {
                            
      out.write("\n");
      out.write("                            <li><a href=\"products.jsp?loai=");
      out.print(b.getidHang());
      out.write('"');
      out.write('>');
      out.print(b.getHangSanXuat());
      out.write("</a></li>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("        <div id=\"site-wrapper\">\n");
      out.write("\t\t<ul class=\"products.homepage\">\n");
      out.write("                <!-- products.homepage productsHomepage -->\n");
      out.write("                    <div style=\"margin-left: 10px;\">\n");
      out.write("                        ");

                                //for(ThongTin t: spHome.getListThongTin(Integer.parseInt(val))) {
                                for(ThongTinLapTop t : spHome.getListThongTin()) {
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"preorder\"><span class=\"tagimg \"></span> <a\n");
      out.write("\t\t\t\thref=\"detail.jsp?ma_san_pham=\"> \n");
      out.write("                            <!--    <img src=\"img/samsung-galaxy-s6-edge-64gb-200x200.jpg\" width=\" 250px\" height=\"250px\" /> -->\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath());
      out.print(t.getLinkHinhAnh());
      out.write(" \" width=\" 250px\" height=\"250px\"/>\n");
      out.write("\t\t\t\t\t<h3>");
      out.print(t.getTenLapTop());
      out.write("</h3>\n");
      out.write("\t\t\t\t\t<h4>\n");
      out.write("\t\t\t\t\t\tGiá:\n");
      out.write("\t\t\t\t\t\t18.490.000 VNĐ\n");
      out.write("\t\t\t\t\t</h4> <span class=\"textkm\">Khuyến mãi trị giá đến <strong>500.000₫</strong>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t<p class=\"info\">\n");
      out.write("                                            <span>");
      out.print(t.getManHinh());
      out.write("</span> <br>\n");
      out.write("\t\t\t\t\t\t<span>");
      out.print(t.getCPU());
      out.write("</span> <br>\n");
      out.write("\t\t\t\t\t\t<span>");
      out.print(t.getRAM());
      out.write("</span> <br>\n");
      out.write("\t\t\t\t\t\t<span>");
      out.print(t.getVGA());
      out.write("</span> <br>\n");
      out.write("\t\t\t\t\t\t<span>");
      out.print(t.getHDH());
      out.write("</span> <br>\n");
      out.write("                                                <span>");
      out.print(t.getTrongLuong());
      out.write("</span> <br>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t</a></li>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("    <footer>\n");
      out.write("          Footer                  \n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
