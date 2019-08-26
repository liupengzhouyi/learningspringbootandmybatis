/*
package cn.liupengstudy.learningspringbootandmybatis.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.wukong.dao.BaseDao;
import com.wukong.dao.UserDao;
import com.wukong.entity.User;

public class UserDaoImpl implements UserDao {

	@Override
	public int addUser(User u) {     //ע��
		String sql = "insert into user(userName,password,introduce) values(?,?,?)";
		
		Object[] params = new Object[3];
		params[0] = u.getUsername();
		params[1] = u.getPassword();
		params[2] = null;
		
		int i = executeIUD(sql,params);
		return i;
	}

	@Override
	public int modifyUserIntro(User u) {    //�޸��û����˽���
		String sql = "update user set introduce=? where userName=?";
		
		Object[] params = new Object[2];
		params[0] = u.getIntroduce();
		params[1] = u.getUsername();
		
		int i = executeIUD(sql,params);
		return i;
	}

	@Override
	public User queryByExample(String username, String pass) {
		User u = new User();
		try{
			String sql = "select * from user where userName=? and password=?";
			
			Object[] params = new Object[2];
			params[0] = username;
			params[1] = pass;
			
			ResultSet rs = executeSelect(sql,params);
			
			while(rs.next()){
				u.setUsername(rs.getString(1));
				u.setPassword(rs.getString(2));
				u.setIntroduce(rs.getString(3));
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return u;
		
	}

	*/
/**
	 * 获取被关注者数量
	 * @param userID
	 * @return
	 *//*

	@Override
	public int getfollowNumber(String userID) throws SQLException {
		int funsNumbers = 0;
		String sql = "select followNumber from user where userName =?";
		Object[] params = new Object[2];
		params[0] = userID;
		ResultSet rs = executeSelect(sql,params);
		while (rs.next()) {
			funsNumbers = rs.getInt(1);
		}
		return funsNumbers;
	}

	*/
/**
	 * 获取关注者数量
	 * @param userID
	 * @return
	 *//*

	@Override
	public int getFansNumber(String userID) throws SQLException {
		int funsNumbers = 0;
		String sql = "select fansNumber from user where userName =?";
		Object[] params = new Object[1];
		params[0] = userID;
		ResultSet rs = executeSelect(sql,params);
		while (rs.next()) {
			funsNumbers = rs.getInt(1);
		}
		return funsNumbers;
	}

	*/
/**
	 * 添加一个关注
	 * @param userID
	 * @return
	 *//*
	@Override
	public int addFunsNumber(String userID) throws SQLException {
	 	int funsNumbers = this.getFansNumber(userID);
		funsNumbers = funsNumbers + 1;
		String sql = "update user set fansNumber =? where userName =?";
		Object[] newParams = new Object[2];
		newParams[0] = funsNumbers;
		newParams[1] = userID;
		int i = executeIUD(sql,params);
		return i;
	}

	*/
/**
	 * 删除一个关注
	 * @param userID
	 * @return
	 *//*

	@Override
	public int delFunsNumber(String userID) throws SQLException {
		int funsNumbers = this.getFansNumber(userID);
		funsNumbers = funsNumbers - 1;
		String sql = "update user set fansNumber =? where userName =?";
		Object[] newParams = new Object[2];
		newParams[0] = funsNumbers;
		newParams[1] = userID;
		int i = executeIUD(sql,params);
		return i;
	}

	*/
/**
	 * 添加被关注的数量
	 * @param userID
	 * @return
	 *//*

	@Override
	public int addFollowNumber(String userID) throws SQLException {
		int followNumber = this.getFansNumber(userID);
		followNumber = followNumber + 1;
		String sql = "update user set fansNumber =? where userName =?";
		Object[] newParams = new Object[2];
		newParams[0] = funsNumbers;
		newParams[1] = userID;
		int i = executeIUD(sql,params);
		return i;
	}

	*/
/**
	 * 删除被关注的数量
	 * @param userID
	 * @return
	 *//*

	@Override
	public int delFollowNumber(String userID) throws SQLException {
		int followNumber = this.getFansNumber(userID);
		followNumber = followNumber - 1;
		String sql = "update user set followNumber =? where userName =?";
		Object[] newParams = new Object[2];
		newParams[0] = followNumber;
		newParams[1] = userID;
		int i = executeIUD(sql,params);
		return i;
	}
}
*/
