package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"site-wrapper\">\n");
      out.write("\t\t<ul class=\"products homepage\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li class=\"preorder\"><span class=\"tagimg \"></span> <a\n");
      out.write("\t\t\t\thref=\"detail.jsp?ma_san_pham=\"> <img\n");
      out.write("\t\t\t\t\tsrc=\"img/iphone-6-plus-64gb128gb-nowatermark-190x190.jpg\" width=\" 250px\" height=\"250px\" />\n");
      out.write("\t\t\t\t\t<h3>iPhone 6 Plus 64GB</h3>\n");
      out.write("\t\t\t\t\t<h4>\n");
      out.write("\t\t\t\t\t\tGiá:\n");
      out.write("\t\t\t\t\t\t22.199.000 VNĐ\n");
      out.write("\t\t\t\t\t</h4> <span class=\"textkm\">Khuyến mãi trị giá đến <strong>500.000₫</strong>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t<p class=\"info\">\n");
      out.write("\t\t\t\t\t    <span>Màn hình: Retina HD, 5.5'</span>\n");
      out.write("\t\t\t\t\t\t<span>HĐH: IOS8</span> \n");
      out.write("\t\t\t\t\t\t<span>CPU: A8 64 bit</span>\n");
      out.write("\t\t\t\t\t\t<span>Camera: 8.0M</span>\n");
      out.write("\t\t\t\t\t\t<span>Dung lượng pin: 2900mAh</span>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t</a></li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li class=\"preorder\"><span class=\"tagimg \"></span> <a\n");
      out.write("\t\t\t\thref=\"detail.jsp?ma_san_pham=\"> <img\n");
      out.write("\t\t\t\t\tsrc=\"img/samsung-galaxy-note-edge-nowatermark-190x190.jpg\" width=\" 250px\" height=\"250px\" />\n");
      out.write("\t\t\t\t\t<h3>Galaxy Note Edge</h3>\n");
      out.write("\t\t\t\t\t<h4>\n");
      out.write("\t\t\t\t\t\tGiá:\n");
      out.write("\t\t\t\t\t\t20.990.000 VNĐ\n");
      out.write("\t\t\t\t\t</h4> <span class=\"textkm\">Khuyến mãi trị giá đến <strong>500.000₫</strong>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t<p class=\"info\">\n");
      out.write("\t\t\t\t\t\t<span>Màn hình: Retina HD, 5.5'</span>\n");
      out.write("\t\t\t\t\t\t<span>HĐH: IOS8</span> \n");
      out.write("\t\t\t\t\t\t<span>CPU: A8 64 bit</span>\n");
      out.write("\t\t\t\t\t\t<span>Camera: 8.0M</span>\n");
      out.write("\t\t\t\t\t\t<span>Dung lượng pin: 2900mAh</span>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t</a></li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li class=\"preorder\"><span class=\"tagimg \"></span> <a\n");
      out.write("\t\t\t\thref=\"detail.jsp?ma_san_pham=\"> <img\n");
      out.write("\t\t\t\t\tsrc=\"img/samsung-galaxy-s6-edge-64gb-200x200.jpg\" width=\" 250px\" height=\"250px\" />\n");
      out.write("\t\t\t\t\t<h3>Galaxy S6 Edge 64GB</h3>\n");
      out.write("\t\t\t\t\t<h4>\n");
      out.write("\t\t\t\t\t\tGiá:\n");
      out.write("\t\t\t\t\t\t18.490.000 VNĐ\n");
      out.write("\t\t\t\t\t</h4> <span class=\"textkm\">Khuyến mãi trị giá đến <strong>500.000₫</strong>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t<p class=\"info\">\n");
      out.write("\t\t\t\t\t\t<span>Màn hình: QuadHD, 5.1'</span>\n");
      out.write("\t\t\t\t\t\t<span>HĐH: Android 4.4 (KitKat)</span> \n");
      out.write("\t\t\t\t\t\t<span>CPU: 4 nhân 2.7GHz</span>\n");
      out.write("\t\t\t\t\t\t<span>Camera: 16M</span>\n");
      out.write("\t\t\t\t\t\t<span>Dung lượng pin: 3000mAh</span>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t</a></li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li class=\"preorder\"><span class=\"tagimg \"></span> <a\n");
      out.write("\t\t\t\thref=\"detail.jsp?ma_san_pham=\"> <img\n");
      out.write("\t\t\t\t\tsrc=\"img/sony-xperia-z3-icon-nowatermark-190x190.jpg\" width=\" 250px\" height=\"250px\" />\n");
      out.write("\t\t\t\t\t<h3>Sony Xperia Z3 Plus</h3>\n");
      out.write("\t\t\t\t\t<h4>\n");
      out.write("\t\t\t\t\t\tGiá:\n");
      out.write("\t\t\t\t\t\t15.990.000 VNĐ\n");
      out.write("\t\t\t\t\t</h4> <span class=\"textkm\">Khuyến mãi trị giá đến <strong>500.000₫</strong>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t<p class=\"info\">\n");
      out.write("\t\t\t\t\t\t<span>Màn hình: QuadHD, 5.1'</span>\n");
      out.write("\t\t\t\t\t\t<span>HĐH: Android 4.4 (KitKat)</span> \n");
      out.write("\t\t\t\t\t\t<span>CPU: 4 nhân 2.7GHz</span>\n");
      out.write("\t\t\t\t\t\t<span>Camera: 16M</span>\n");
      out.write("\t\t\t\t\t\t<span>Dung lượng pin: 3000mAh</span>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t</a></li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li class=\"preorder\"><span class=\"tagimg \"></span> <a\n");
      out.write("\t\t\t\thref=\"detail.jsp?ma_san_pham=\"> <img\n");
      out.write("\t\t\t\t\tsrc=\"img/htc-one-m9-200x200.jpg\" width=\" 250px\" height=\"250px\" />\n");
      out.write("\t\t\t\t\t<h3>HTC One M9</h3>\n");
      out.write("\t\t\t\t\t<h4>\n");
      out.write("\t\t\t\t\t\tGiá:\n");
      out.write("\t\t\t\t\t\t13.990.000 VNĐ\n");
      out.write("\t\t\t\t\t</h4> <span class=\"textkm\">Khuyến mãi trị giá đến <strong>500.000₫</strong>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t<p class=\"info\">\n");
      out.write("\t\t\t\t\t\t<span>Màn hình: QuadHD, 5.1'</span>\n");
      out.write("\t\t\t\t\t\t<span>HĐH: Android 4.4 (KitKat)</span> \n");
      out.write("\t\t\t\t\t\t<span>CPU: 4 nhân 2.7GHz</span>\n");
      out.write("\t\t\t\t\t\t<span>Camera: 16M</span>\n");
      out.write("\t\t\t\t\t\t<span>Dung lượng pin: 3000mAh</span>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t</a></li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li class=\"preorder\"><span class=\"tagimg \"></span> <a\n");
      out.write("\t\t\t\thref=\"detail.jsp?ma_san_pham=\"> <img\n");
      out.write("\t\t\t\t\tsrc=\"img/oppo-r5-nowatermark-190x190.jpg\" width=\" 250px\" height=\"250px\" />\n");
      out.write("\t\t\t\t\t<h3>OPPO R5</h3>\n");
      out.write("\t\t\t\t\t<h4>\n");
      out.write("\t\t\t\t\t\tGiá:\n");
      out.write("\t\t\t\t\t\t7.990.000 VNĐ\n");
      out.write("\t\t\t\t\t</h4> <span class=\"textkm\">Khuyến mãi trị giá đến <strong>500.000₫</strong>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t<p class=\"info\">\n");
      out.write("\t\t\t\t\t\t<span>Màn hình: QuadHD, 5.1'</span>\n");
      out.write("\t\t\t\t\t\t<span>HĐH: Android 4.4 (KitKat)</span> \n");
      out.write("\t\t\t\t\t\t<span>CPU: 4 nhân 2.7GHz</span>\n");
      out.write("\t\t\t\t\t\t<span>Camera: 16M</span>\n");
      out.write("\t\t\t\t\t\t<span>Dung lượng pin: 3000mAh</span>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t</a></li>\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("    </body>\n");
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
