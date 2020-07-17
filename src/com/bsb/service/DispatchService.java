package com.bsb.service;

import java.util.List;

import com.bsb.model.DispatchAppDetail;
import com.bsb.model.DispatchAppSum;
import com.bsb.model.DispatchRecord;

public interface DispatchService {
	
	//Apply Detail
	public void insertApplyDetail(String order, String type, int num, String condition, String result);
	// 显示指定单号出库申请详情
	public List<DispatchAppDetail> findAppDetailByOrder(String order);
	// 填写详情表
	public void appCheck(String order, String name, String result, String reason);
	// 指定单显示出库位置详情
	public List<String> getPosByOrder(String order);
	
	public void insertApplySummary(String order, String applicant, String time, String result);
	//获得订单编号
	public Integer getApplyNum();
}
