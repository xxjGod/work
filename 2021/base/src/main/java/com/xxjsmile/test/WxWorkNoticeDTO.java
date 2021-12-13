package com.xxjsmile.test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Auther: hao.liu.c
 * @Date: 2021/5/14 10:10
 * @Description:
 */
@ToString
@Getter
@Setter
public class WxWorkNoticeDTO implements Serializable {

	private static final long serialVersionUID = -5891690329315703120L;

	private String ChangeType;
	private String UserID;
	private String CreateTime;
	private String Event;
	private String ExternalUserID;
	private String ToUserName;
	private String FromUserName;
	private String MsgType;
	private String State;
	private String WelcomeCode;
	private String ChatId;
	private String FailReason;
	// tag
	private String Id;
	private String TagType;
	// 成员的
	private String NewUserID;
	private String Name;
	private String Department;
	private String MainDepartment;
	private String Position;
	private String Mobile;
	private String Status;
	private String Gender;
	private String Avatar;
	private String Alias;
	private String Telephone;
	private String Address;

}
