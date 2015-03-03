package com.springapp.mvc.common;

import com.ibatis.sqlmap.client.SqlMapClient;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class BaseDAO {
	
	@Resource(name="sqlMapClient")
	private SqlMapClient sqlMapClient;

	public Object queryForObject(String id, Object parameterObject) throws SQLException {
        return sqlMapClient.queryForObject(id, parameterObject);
	}

	public List queryForList(String id, Object parameterObject) throws SQLException {
        return sqlMapClient.queryForList(id, parameterObject);
	}
	
	public Map queryForMap(String id, Object parameterObject, String mapKey, String value) throws SQLException {
        return sqlMapClient.queryForMap(id, parameterObject, mapKey, value);
	}
	
	public Map queryForMap(String id, Object parameterObject, String mapKey) throws SQLException {
        return sqlMapClient.queryForMap(id, parameterObject, mapKey);
	}

	public Object insert(String id, Object parameterObject) throws SQLException {
        return sqlMapClient.insert(id, parameterObject);
	}

	public int update(String id, Object parameterObject) throws SQLException {
        return sqlMapClient.update(id, parameterObject);
	}

	public int delete(String id, Object parameterObject) throws SQLException {
        return sqlMapClient.delete(id, parameterObject);
	}
}
