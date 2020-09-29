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
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		User user=new User();
		
		//获取页面提交的账号密码
		String aname=request.getParameter("aname");
		int apassword=Integer.parseInt(request.getParameter("apassword"));
		//设置到实体中
		user.setAname(aname);
		user.setApassword(apassword);
		//
		UserDao userDao = new UserDao();
		boolean flag = userDao.Register(user);
		if(flag) {
			request.setAttribute("msg", "注册成功");
		}else {
			request.setAttribute("msg", "注册失败");
		}
		request.getRequestDispatcher("/login.jsp").forward(request, response);	
	}

}
