package com.chainsys.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.controller.ConnectionUtil;
import com.chainsys.model.RealEstate;

public class RealEstateDAO {
	public void add(RealEstate realEstate) throws SQLException {
		Connection connection = ConnectionUtil.getconnection();
		String sql = "insert into real_estate(flat_number,flat_owner_name,area,district,length,contact_number,amount)values(?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, realEstate.getFlatNumber());
		preparedStatement.setString(2, realEstate.getOwnerName());
		preparedStatement.setString(3, realEstate.getArea());
		preparedStatement.setString(4, realEstate.getDistrict());
		preparedStatement.setInt(5, realEstate.getLength());
		preparedStatement.setLong(6, realEstate.getContactNumber());
		preparedStatement.setInt(7, realEstate.getAmount());

		int row = preparedStatement.executeUpdate();
		System.out.println(row + "row affected");

	}

	public void delete(int id) throws SQLException {
		Connection connection = ConnectionUtil.getconnection();
		String sql = "Delete from  real_estate where flat_number=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		int row = preparedStatement.executeUpdate();
		System.out.println(row + "row affected");
	}

	public RealEstate findById(int id) throws SQLException {
		Connection connection = ConnectionUtil.getconnection();
		String sql = "select flat_number,flat_owner_name,area,district,length,contact_number,amount from real_estate where flat_number=? ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		RealEstate estate = new RealEstate();
		if (resultSet.next()) {
			estate.setFlatNumber(resultSet.getInt("flat_number"));
			estate.setOwnerName(resultSet.getString("flat_owner_name"));
			estate.setArea(resultSet.getString("area"));
			estate.setDistrict(resultSet.getString("district"));
			estate.setLength(resultSet.getInt("length"));
			estate.setContactNumber(resultSet.getLong("contact number"));
			estate.setAmount(resultSet.getInt("amount"));
		}
		return estate;
	}

	public List<RealEstate> findAll() throws SQLException {
		Connection connection = ConnectionUtil.getconnection();
		String sql = "select flat_number,flat_owner_name,area,district,length,contact_number,amount from real_estate";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		//RealEstate estate = new RealEstate();
		List<RealEstate> arrayList=new ArrayList<RealEstate>();
		while (resultSet.next()) {
			RealEstate estate = new RealEstate();
			estate.setFlatNumber(resultSet.getInt("flat_number"));
			estate.setOwnerName(resultSet.getString("flat_owner_name"));
			estate.setArea(resultSet.getString("area"));
			estate.setDistrict(resultSet.getString("district"));
			estate.setLength(resultSet.getInt("length"));
			estate.setContactNumber(resultSet.getLong("contact_Number"));
			estate.setAmount(resultSet.getInt("amount"));
		arrayList.add(estate);
		}
		return arrayList;
	}

public void update(RealEstate realEstate) throws SQLException {
	Connection connection = ConnectionUtil.getconnection();
	String sql = "update real_estate set flat_owner_name=? where flat_number=?";
	PreparedStatement preparedStatement = connection.prepareStatement(sql);
	preparedStatement.setString(1, realEstate.getOwnerName());
	preparedStatement.setInt(2, realEstate.getFlatNumber());
	int row = preparedStatement.executeUpdate();
	System.out.println(row + "row affected");
}
public boolean validateLogin(String userName, String password)
		throws Exception {

	boolean isValid = false;
	Connection connection = ConnectionUtil.getconnection();
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	try {
String		sql = "select user_name,password from admin";
		preparedStatement = connection.prepareStatement(sql);
		resultSet = preparedStatement.executeQuery(sql);

		while (resultSet.next()) {
			if (resultSet.getString("user_name").contentEquals(userName)
					&& resultSet.getString("password").contentEquals(
							password)) {
				isValid = true;
			}
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		throw new Exception("Invalid Username or Password");
	}
	
	return isValid;

}
public boolean validateUserLogin(String userName, String password)
		throws Exception {

	boolean isValid = false;
	Connection connection = ConnectionUtil.getconnection();
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	try {
String		sql = "select user_name,password from userlogin";
		preparedStatement = connection.prepareStatement(sql);
		resultSet = preparedStatement.executeQuery(sql);

		while (resultSet.next()) {
			if (resultSet.getString("user_name").contentEquals(userName)
					&& resultSet.getString("password").contentEquals(
							password)) {
				isValid = true;
			}
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		throw new Exception("Invalid Username or Password");
	}
	
	return isValid;

}

}
