package com.lc.service.dao.rsextractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.lc.pojo.HistoryPojo;

public class HistoryPojoRSExtractor implements ResultSetExtractor<List<HistoryPojo>> {

	@Override
	public List<HistoryPojo> extractData(ResultSet rs) throws SQLException, DataAccessException {

		List<HistoryPojo> history = new ArrayList<HistoryPojo>();

		while (rs.next()) {
			HistoryPojo hs = new HistoryPojo();
			hs.setHid(rs.getInt(1));
			hs.setUid(rs.getInt(2));
			hs.setUserName(rs.getString(3));
			hs.setCrushName(rs.getString(4));
			hs.setResult(rs.getString(5));

			history.add(hs);
		}

		return history;
	}

}
