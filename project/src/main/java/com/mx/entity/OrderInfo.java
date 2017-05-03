package com.mx.entity;

/**
 * 订单表
 */
import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo {
	private Integer id;// 销售编号
	private String c_id;// 产品编号
	private Date o_date;// 卖出时间
	private String c_name_of_purchaser;// 购买人名称
	private BigDecimal o_price;// 价格

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public Date getO_date() {
		return o_date;
	}

	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}

	public String getC_name_of_purchaser() {
		return c_name_of_purchaser;
	}

	public void setC_name_of_purchaser(String c_name_of_purchaser) {
		this.c_name_of_purchaser = c_name_of_purchaser;
	}

	public BigDecimal getO_price() {
		return o_price;
	}

	public void setO_price(BigDecimal o_price) {
		this.o_price = o_price;
	}

}
