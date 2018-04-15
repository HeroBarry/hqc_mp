package com.hqc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hqc.dao.MpTicketDao;
import com.hqc.entity.MpTicketEntity;
import com.hqc.service.MpTicketService;

/**
 * 景区门票服务实现类
 * 
 * @author Joey
 * @email:2434387555@qq.com
 * @date：2017年6月2日
 * 
 */
@Service
public class MpTicketServiceImpl implements MpTicketService {

	@Resource
	private MpTicketDao mpTicketDao;

	@Override
	public void save(MpTicketEntity entity) {
		 mpTicketDao.save(entity);
	}

	@Override
	public List<MpTicketEntity> queryList(Map<String, Object> map) {
		return mpTicketDao.queryList(map);
	}

	@Override
	public MpTicketEntity queryObject(Long id) {
		return mpTicketDao.queryObject(id);
	}

	@Override
	public int queryTotal(Map<String, Object> map) {
		return mpTicketDao.queryTotal(map);
	}

	@Override
	public int updateByPrimaryKey(MpTicketEntity entity) {
		return mpTicketDao.update(entity);
	}

	@Override
	public int delete(Long id) {
		Map<String, Object> map=new HashMap<>();
		map.put("id",id);
		return mpTicketDao.delete(map);
	}
	
	@Override
	public int deleteBatch(long[] ids){
		return mpTicketDao.deleteBatch(ids);
	}

}
