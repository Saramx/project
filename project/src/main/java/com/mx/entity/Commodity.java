package com.mx.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品表
 */
public class Commodity implements Serializable {

	//序列化唯一标识符
	private static final long serialVersionUID = 6069108454170559457L;

	private String id;// 销售编号
	private String c_name;// 产品名称
	private String c_id;// 产品编号
	private Date c_production_time;// 产品生产时间
	private Integer c_type;// 产品类型
	private BigDecimal c_price;// 价格
	private String c_remarks;// 备注

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public Date getC_production_time() {
		return c_production_time;
	}

	public void setC_production_time(Date c_production_time) {
		this.c_production_time = c_production_time;
	}

	public Integer getC_type() {
		return c_type;
	}

	public void setC_type(Integer c_type) {
		this.c_type = c_type;
	}

	public BigDecimal getC_price() {
		return c_price;
	}

	public void setC_price(BigDecimal c_price) {
		this.c_price = c_price;
	}

	public String getC_remarks() {
		return c_remarks;
	}

	public void setC_remarks(String c_remarks) {
		this.c_remarks = c_remarks;
	}

}
