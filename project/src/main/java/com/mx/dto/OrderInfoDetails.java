package com.mx.dto;
/**
 * �������
 */
import java.math.BigDecimal;
import java.util.Date;

import com.mx.entity.OrderInfo;

public class OrderInfoDetails{
	//��Ʒ����
	private String c_name;
	//��Ʒ���
	private String c_type_name;
	//��Ʒ����ʱ��
	private String c_production_time;
	//��Ʒ����
	private String c_remarks;
	// ����ʱ��
	private String o_date;
	// ���۱��
	private Integer id;
	// ��Ʒ���
	private String c_id;
	// ����������
	private String c_name_of_purchaser;
	// �۸�
	private BigDecimal o_price;

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_type_name() {
		return c_type_name;
	}

	public void setC_type_name(String c_type_name) {
		this.c_type_name = c_type_name;
	}

	public String getC_production_time() {
		return c_production_time.split(" ")[0];
	}

	public void setC_production_time(String c_production_time) {
		this.c_production_time = c_production_time;
	}

	public String getC_remarks() {
		return c_remarks;
	}

	public void setC_remarks(String c_remarks) {
		this.c_remarks = c_remarks;
	}

	public String getO_date() {
		return o_date.split(" ")[0];
	}

	public void setO_date(String o_date) {
		this.o_date = o_date;
	}

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
