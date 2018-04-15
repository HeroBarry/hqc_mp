package com.hqc.dao;

import java.util.List;
import java.util.Map;

import com.hqc.entity.MpIntegralRecordEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 微信端我的积分
 * @author Administrator
 *
 */
@Mapper
public interface WxMemberIntegerRecordDao extends BaseDao<MpIntegralRecordEntity> {
   /**
    * 查询数据
    * @param map
    * @return
    */
	 List<MpIntegralRecordEntity> queryList(Map<String, Object> map);

}
