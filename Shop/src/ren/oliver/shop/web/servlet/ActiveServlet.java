package ren.oliver.shop.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ren.oliver.shop.service.UserService;

public class ActiveServlet extends HttpServlet {

	private static final long serialVersionUID = 5860207310689569048L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 获得激活码
		String activeCode = request.getParameter("activeCode");

		UserService service = new UserService();
		service.active(activeCode);

		// 跳转到登录页面
		response.sendRedirect(request.getContextPath() + "/login.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
