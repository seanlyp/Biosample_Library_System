package com.bsb.service;

import java.util.List;

import com.bsb.model.DispatchAppDetail;
import com.bsb.model.DispatchAppSum;
import com.bsb.model.DispatchRecord;

public interface DispatchService {
	
	public List<DispatchAppSum> findAllApp();
	// 显示指定单号的出库申请
	public List<DispatchAppSum> findAppByOrder(String order);
	// 申请单位
	public List<DispatchAppSum> findAppByApplicant(String applicant);
	// 时间
	public List<DispatchAppSum> findAppByTime(String time);
	// 申请结果
	public List<DispatchAppSum> findAppByResult(String result);
	// 审核员
	public List<DispatchAppSum> findAppByAuditor(String auditor);
	// 回填申请表审核结果
	public void appCheckFinal(String order, String result, String auditor);
	// 获取当前订单数量用于订单编号
	public Integer getApplyNum();
	public void insertApplySum(String order, String applicant, String time, String result);
	// 出库样本(调用出库申请详情表)
	// public List<DispatchAppSum> findAppBySample(String type);
	
}
