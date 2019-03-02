package user.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserVO implements Serializable {

	private static final long serialVersionUID = -5000003136507767418L;
	
	private String userId;
	private String name;
	private String gender;
	private String city;

	public UserVO() {}
	
	public UserVO(String userId, String name, String gender, String city) {
		this.userId = userId;
		this.name = name;
		this.gender = gender;
		this.city = city;
	}

	//@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", gender="
				+ gender + ", city=" + city + "]";
	}
	
}
