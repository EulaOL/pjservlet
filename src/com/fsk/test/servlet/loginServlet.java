package com.fsk.test.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fsk.test.dao.UserDao;
import com.fsk.test.pojo.User;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/Login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		this.doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setHeader("content-type", "text/html;charset = UTF-8");
		
		User u=new User();
		String aname=request.getParameter("aname");
		int apassword=Integer.parseInt(request.getParameter("apassword"));
		//测试数据
		System.out.println(aname+" "+apassword);
		//获取login页面的数据设置到实体类中
		u.setAname(aname);
		u.setApassword(apassword);
		
		UserDao userDao = new UserDao();
		User user=userDao.Login(u);
		if(user!=null) {
			request.setAttribute("msg", "登录成功");
			request.getRequestDispatcher("/Welcome.jsp").forward(request, response);
		}
		else {
			request.setAttribute("msg", "登录失败");
		}
		
	}

}
