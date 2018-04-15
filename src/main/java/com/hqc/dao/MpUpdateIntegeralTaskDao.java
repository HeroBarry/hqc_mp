package com.hqc.dao;

import java.util.List;
import java.util.Map;

import com.hqc.entity.MpMemberEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 修改会员积分定时任务
 * @author Administrator
 *
 */
@Mapper
public interface MpUpdateIntegeralTaskDao extends BaseDao<MpMemberEntity> {
	/**
	 * 修改积分
	 */
	public List<Map<String,Object>> autoUpdateIntegral();
	

	

}
