package com.hqc.dao;

import com.hqc.entity.MpCashCouponEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CashCouponDao extends BaseDao<MpCashCouponEntity> {
	/**
	 * 查看代金券是否被使用
	 */
	public int queryUsingCash(Long id);
	
}
