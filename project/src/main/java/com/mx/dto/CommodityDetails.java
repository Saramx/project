package com.mx.dto;

import java.util.List;

import com.mx.entity.Commodity;

public class CommodityDetails extends Commodity {

	//���л�Ψһ��ʶ��
	private static final long serialVersionUID = 1L;

	//�����˵ļ���
	private List<String> c_name_of_purchasers;
    //������
	private String c_type_name;

	public List<String> getC_name_of_purchasers() {
		return c_name_of_purchasers;
	}

	public void setC_name_of_purchasers(List<String> c_name_of_purchasers) {
		this.c_name_of_purchasers = c_name_of_purchasers;
	}

	public String getC_type_name() {
		return c_type_name;
	}

	public void setC_type_name(String c_type_name) {
		this.c_type_name = c_type_name;
	}

}
