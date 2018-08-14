package team.redrock.redis.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Member implements Serializable {
	private String name;
	private Integer age;
	public String getMid() {
		return name;
	}
	public void setMid(String mid) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
