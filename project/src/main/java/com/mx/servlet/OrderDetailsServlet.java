package com.mx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mx.dto.OrderInfoDetails;
import com.mx.service.OrderInfoService;

@WebServlet(urlPatterns = "/details")
public class OrderDetailsServlet extends HttpServlet {

	private static final long serialVersionUID = -1714071934369953347L;
	private OrderInfoService orderInfoService;
	/**
	 * ��ʼ��spring
	 */
	@Override
	public void init() throws ServletException {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		orderInfoService = applicationContext.getBean(OrderInfoService.class);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//����ǰ̨��������id ��ö���������
		String id = req.getParameter("id");
		OrderInfoDetails orderInfoDetails = orderInfoService
				.getOrderInfoById(id);
		//��orderInfoDetails����������
		req.setAttribute("orderInfoDetails", orderInfoDetails);
		req.getRequestDispatcher("/details.jsp").forward(req, resp);
	}

}
