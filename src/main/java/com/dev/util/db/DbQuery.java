package com.dev.util.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

public class DbQuery {
public List<Map<String, Object>> retriveDBQueryResults(Connection connection, String Sql, Object[] params)
			throws SQLException {
		List<Map<String, Object>> list = null;
		try {
			MapListHandler beanListHandler = new MapListHandler();
			QueryRunner runner = new QueryRunner();
			list = runner.query(connection, Sql, beanListHandler, params);
			if (list.isEmpty()) {
				System.out.println(" Number of Records Fetched :" + list.size());
			}
		} catch (Exception e) {
			System.err.println(" Exception :" + e);
			e.printStackTrace();
		}
	return list;
	}
}
