package com.mx.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mx.dto.OrderInfoDetails;
import com.mx.service.CommodityService;
import com.mx.service.OrderInfoService;
import com.mx.service.UsersService;
import com.mx.utils.Kit;

/**
 * @Component  组件
 *
 */
@Component
@Path("/users")
public class UsersController {


	@Autowired
	private UsersService usersService;

	@Autowired
	private CommodityService commodityService;

	@Autowired
	private OrderInfoService orderInfoService;

	/**
	 * 登陆
	 * 
	 * @Consumes 指定http请求的MIME类型
	 * get 一般用户请求数据 
	 * post一般用户提交数
	 * @FormParam 客户端以form(MIME为application/x-www-form-urlencoded)的方式提交表单，服务端使用@FormParam解析form表单中的参数
	 * 
	 */
	@POST
	@Path("/login")
	@Consumes("application/x-www-form-urlencoded")
	public String login(@FormParam("name") String name,
			@FormParam("password") String password,
			@Context HttpServletResponse response) throws IOException {
		boolean b = usersService.login(name, password);
		if (b) {
			response.sendRedirect("/project/index.jsp");
			return "";
		} else {
			return ("用户名或者密码错误");
		}
	}

	/**
	 * 获得订单详情
	 * 
	 * @Produces 指定http响应的MIME类型
	 * 
	 * 
	 */

	@POST
	@Path("/getOrderinfo")
	@Produces(MediaType.APPLICATION_JSON)
	public String getOrderinfo(@FormParam("page") int page,
			@FormParam("rows") int rows,
			@FormParam("whereName") String whereName,
			@FormParam("whereValue") String whereValue) {
		Map<String, Object> map = new HashMap<String, Object>();
		// total 获得总条数
		map.put("total", orderInfoService.getOrderInfoCountDetailsByWhere(
				whereName, whereValue));
		// rows 获得订单详情的数据
		map.put("rows", orderInfoService.getOrderInfoDetailsByWhere(page, rows,
				whereName, whereValue));
		// 将map集合转换成json
		return Kit.GSON.toJson(map);
	}
}
