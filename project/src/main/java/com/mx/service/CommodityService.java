package com.mx.service;

import java.util.List;

import com.mx.entity.Commodity;

public interface CommodityService {
	// ��ѯ������Ʒ
	public List<Commodity> getAll();

	// �����ѯһ����Ʒ
	public Commodity getCommodityByRandom();
}
