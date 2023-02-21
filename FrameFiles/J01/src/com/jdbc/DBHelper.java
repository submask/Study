package com.jdbc;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * JDBC������
 */
public class DBHelper {
	private static String driver = "com.mysql.cj.jdbc.Driver";// ��������������
	private static String url = "jdbc:mysql://localhost:3306/student_db";// ���ݿ����ӵ�ַ
	private static String username = "root";// ���ݿ��¼�û���
	private static String password = "root";// ���ݿ��¼����

	// �ھ�̬������м������ݿ�������ִֻ��һ�Σ�
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/***
	 * ��ȡ���ݿ����Ӷ���
	 * 
	 * @return ���ݿ����Ӷ���
	 */
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

	/**
	 * �ر����ӣ��ͷ���Դ
	 * 
	 * @param conn ���Ӷ���
	 */
	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * �ر����ӣ��ͷ���Դ
	 * 
	 * @param stmt ������
	 */
	public static void close(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * �ر����ӣ��ͷ���Դ
	 * 
	 * @param rs �����
	 */
	public static void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * �ر����ӣ��ͷ���Դ
	 * 
	 * @param conn ���Ӷ���
	 * @param stmt ������
	 */
	public static void close(Connection conn, Statement stmt) {
		close(stmt);
		close(conn);
	}

	/**
	 * �ر����ӣ��ͷ���Դ
	 * 
	 * @param conn ���Ӷ���
	 * @param stmt ������
	 * @param rs   �����
	 */
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		close(rs);
		close(conn, stmt);
	}

	/**
	 * ִ�� ���/ɾ��/�޸� ��䣬����Ӱ������
	 * 
	 * @param sql    ���/ɾ��/�޸� ���
	 * @param values ռλ����ֵ
	 * @return Ӱ������,-1��ʾִ���쳣
	 */
	public static int executeUpdate(String sql, Object... values) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = DBHelper.getConnection();
			stmt = conn.prepareStatement(sql);
			// ����ռλ����ֵ
			for (int i = 0; i < values.length; i++) {
				// ռλ����������1��ʼ
				stmt.setObject(i + 1, values[i]);
			}
			return stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			DBHelper.close(conn, stmt);
		}
	}

	/**
	 * �� ��ǰrs�е����� ת���� ���ʵ�����
	 * 
	 * @param clazz ʵ�����Class����
	 * @param rs    ��ǰrs�е�����
	 * @return T���͵Ķ���
	 */
	public static <T> T getObject(Class<T> clazz, ResultSet rs) {
		// ʵ����T������͵Ķ���T�����Ͳ����ı���
		// ���� ������ƣ���ʵ����T����������͵ı���
		// ʵ����������ʵ����ִ����Ĺ��캯������ô��Ҫ��ȡ��Ĺ��캯��
		T obj = null;
		try {
			// ���� Ĭ�ϵĹ��캯����ʵ����T����
			obj = clazz.getConstructor().newInstance();
			// �����ǵ����Ը�ֵ
			Field[] fields = clazz.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				// ��ȡ��������
				String fieldName = fields[i].getName();
				// �����������������е�����һ�£�������ǿ���ͨ���������ƻ�ȡ���еĵ�Ԫ��ֵ
				Object fieldValue = rs.getObject(fieldName);
				// ��obj����� fields[i] ������Ը�ֵ
				fields[i].setAccessible(true);
				fields[i].set(obj, fieldValue);
			}
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return obj;
	}

	/**
	 * ִ�� ��ѯ��䣬���� ʵ�弯��
	 * 
	 * @param <T>
	 * @param clazz  ʵ�����Class����
	 * @param sql    ��ѯ���
	 * @param values ռλ����ֵ
	 * @return ʵ�弯��
	 */
	public static <T> List<T> executeQuerys(Class<T> clazz, String sql, Object... values) {
		// ���� T���͵ļ���
		List<T> list = new ArrayList<T>();

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			stmt = conn.prepareStatement(sql);
			// ����ռλ����ֵ
			for (int i = 0; i < values.length; i++) {
				// ռλ���������� 1 ��ʼ
				stmt.setObject(i + 1, values[i]);
			}
			rs = stmt.executeQuery();
			while (rs.next()) {
				// �� rs����� ת���� T���͵Ķ���
				T t = DBHelper.getObject(clazz, rs);
				// ����ǰrs�е�����ת����ѧ������
				list.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(conn, stmt, rs);
		}

		return list;
	}

	/**
	 * ִ�� ��ѯ��䣬���� ʵ�����
	 * 
	 * @param <T>
	 * @param clazz  ʵ�����Class����
	 * @param sql    ��ѯ���
	 * @param values ռλ����ֵ
	 * @return ʵ�����
	 */
	public static <T> T executeQuery(Class<T> clazz, String sql, Object... values) {
		// ���� T���Ͷ���
		T obj = null;

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			stmt = conn.prepareStatement(sql);
			// ����ռλ����ֵ
			for (int i = 0; i < values.length; i++) {
				// ռλ���������� 1 ��ʼ
				stmt.setObject(i + 1, values[i]);
			}
			rs = stmt.executeQuery();
			if (rs.next()) {
				// �� rs����� ת���� T���͵Ķ���
				obj = DBHelper.getObject(clazz, rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(conn, stmt, rs);
		}

		return obj;
	}
}