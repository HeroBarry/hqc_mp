package com.hqc.dao;

import com.hqc.entity.MpSmsCodeEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 手机短信验证码
 * 
 * @author Joey
 * @project:hqc_mp
 * @date：2017年5月17日
 * 
 */
@Mapper
public interface MpSmsCodeDao extends BaseDao<MpSmsCodeEntity> {

}
