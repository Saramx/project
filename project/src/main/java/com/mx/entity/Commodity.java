package com.mx.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ��Ʒ��
 */
public class Commodity implements Serializable {

	//���л�Ψһ��ʶ��
	private static final long serialVersionUID = 6069108454170559457L;

	private String id;// ���۱��
	private String c_name;// ��Ʒ����
	private String c_id;// ��Ʒ���
	private Date c_production_time;// ��Ʒ����ʱ��
	private Integer c_type;// ��Ʒ����
	private BigDecimal c_price;// �۸�
	private String c_remarks;// ��ע

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
