package com.ysj.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String name = request.getParameter("uname");
		request.setAttribute("uname", name);
		if(null==name||""==name){
			//HttpServletResponse hsr= (HttpServletResponse) response;
			//hsr.setHeader("refresh","3;/LoginCheck/index.jsp"); //3秒后跳转到指定页面
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			System.out.println("123123");
		}
		if("admin".equals(name)){
			request.getRequestDispatcher("one.jsp").forward(request, response);
		
		}else if("jack".equals(name)){
			request.getRequestDispatcher("two.jsp").forward(request, response);
		}else{
			chain.doFilter(request, response);
		}
			
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
