package com.hqc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import com.hqc.dao.MpBannerDao;
import com.hqc.entity.MpBannerEntity;
import com.hqc.service.MpBannerService;
import com.hqc.util.Constant;

/**
 * 横幅图片服务实现类
 * 
 * @author Joey
 * @project:hqc_mp
 * @date：2017年5月17日
 * 
 */
@Service
@CacheConfig(cacheNames = Constant.REDIS_CACHE_NAME)
public class MpBannerServiceImpl implements MpBannerService {

	@Resource
	private MpBannerDao dao;

	@Override
	public void save(MpBannerEntity entity) {
		dao.save(entity);
	}

	@Override
	public List<MpBannerEntity> queryList(Map<String, Object> map) {
		return dao.queryList(map);
	}

	@Override
	public MpBannerEntity queryObject(Long id) {
		return dao.queryObject(id);
	}

	@Override
	public int queryTotal(Map<String, Object> map) {
		return dao.queryTotal(map);
	}

	@Override
	public int updateByPrimaryKey(MpBannerEntity entity) {
		return dao.update(entity);
	}

	@Override
	public int delete(Long id) {
		Map<String, Object> map=new HashMap<>();
		map.put("id",id);
		return dao.delete(map);
	}

	@Override
	public void deleteBatch(long[] ids) {
		this.dao.deleteBatch(ids);	
	}

}
