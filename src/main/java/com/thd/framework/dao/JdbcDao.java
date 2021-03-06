package com.thd.framework.dao;

import java.util.List;
import java.util.Map;

import com.thd.framework.bean.Page;


public interface JdbcDao {
	public List<Map<String,Object>> query(String sql,Object[] params,Integer currentPage ,Integer pageSize);
	public List<Map<String,Object>> query(String sql,Object[] params,Page p);
	public int queryCount(String sql,Object[] params);
}
