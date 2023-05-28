package com.ecommerce;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class HeaderFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        // Thiết lập X-Frame-Options để chống clickjacking
        httpResponse.setHeader("X-Frame-Options", "DENY");
        chain.doFilter(request, response);
    }
    public void init(FilterConfig config) throws ServletException {}
    public void destroy() {}
}
