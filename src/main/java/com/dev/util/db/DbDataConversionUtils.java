package com.dev.util.db;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Clob;
import java.sql.SQLException;

public class DbDataConversionUtils {

	public static String clobStringConversion(Clob clb) throws IOException, SQLException {
		if (clb == null)
			return "";

		StringBuffer str = new StringBuffer();
		String strng;

		BufferedReader bufferRead = new BufferedReader(clb.getCharacterStream());

		while ((strng = bufferRead.readLine()) != null)
			str.append(strng);

		return str.toString();
	}

}
