package com.bsb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsb.dao.DispatchMapper;
import com.bsb.model.DispatchAppDetail;
import com.bsb.service.DispatchService;

@Service("DispatchService")
public class DispatchServiceImpl implements DispatchService{
	
	@Autowired
	private DispatchMapper dispatchMapper;
	
	@Override
	public void insertApplyDetail(String order, String type, int num, String condition, String result) {
		dispatchMapper.insertApplyDe(order, type, num, condition, result);
	}
	// 显示指定单号出库申请详情
	@Override
	public List<DispatchAppDetail> findAppDetailByOrder(String order){
		return dispatchMapper.findAppDetailByOrder(order);
	}
	// 填写详情表
	@Override
	public void appCheck(String order, String type, String result, String reason_pos) {
		dispatchMapper.appCheck(order, type, result, reason_pos);
	}
	// 指定单显示出库位置详情
	@Override
	public List<String> getPosByOrder(String order){
		return dispatchMapper.getPosByOrder(order);
	}
}
