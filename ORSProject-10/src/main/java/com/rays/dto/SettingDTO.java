package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_setting")
public class SettingDTO extends BaseDTO {
	
	@Column(name = "setting_id", length = 50)
	private Long settingId;
	
	@Column(name = "setting_name", length = 50)
	private String settingName;
	
	@Column(name = "setting_value", length = 50)
	private String settingValue;
	
	@Column(name = "setting_type", length = 50)
	private String settingType;
	
	@Column(name = "setting_status", length = 50)
	private String settingStatus;

	public Long getSettingId() {
		return settingId;
	}

	public void setSettingId(Long settingId) {
		this.settingId = settingId;
	}

	public String getSettingName() {
		return settingName;
	}

	public void setSettingName(String settingName) {
		this.settingName = settingName;
	}

	public String getSettingValue() {
		return settingValue;
	}

	public void setSettingValue(String settingValue) {
		this.settingValue = settingValue;
	}

	public String getSettingType() {
		return settingType;
	}

	public void setSettingType(String settingType) {
		this.settingType = settingType;
	}

	public String getSettingStatus() {
		return settingStatus;
	}

	public void setSettingStatus(String settingStatus) {
		this.settingStatus = settingStatus;
	}


	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "settingType";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return settingType;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "SettingType";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Setting";
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return settingType;
	}
	
}
