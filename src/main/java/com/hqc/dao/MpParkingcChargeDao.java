package com.hqc.dao;

import com.hqc.entity.MpParkingcChargeEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 停车消费记录数据交互接口
 * 
 * @author cxw
 * @date 2017年5月15日
 */
@Mapper
public interface MpParkingcChargeDao extends BaseDao<MpParkingcChargeEntity>{
	/**
	 * 查询可删除的数量，确认是否与输入一致；
	 * @param ids
	 * @return
	 */
	int findDelCount(long [] ids);
}
