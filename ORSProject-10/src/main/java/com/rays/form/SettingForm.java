package com.rays.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SettingDTO;

public class SettingForm extends BaseForm {
	
	@NotNull(message = "setting id is required")
	@Min(1)
	private Long settingId;

	@NotEmpty(message = "setting name is required")
	private String settingName;

	@NotEmpty(message = "setting value is required")
	private String settingValue;

	@NotEmpty(message = "setting type is required")
	private String settingType;

	@NotEmpty(message = "setting status is required")
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
	public BaseDTO getDto() {

		SettingDTO dto = initDTO(new SettingDTO());

		dto.setSettingId(settingId);
		dto.setSettingName(settingName);
		dto.setSettingStatus(settingStatus);
		dto.setSettingType(settingType);
		dto.setSettingValue(settingValue);

		return dto;
	}

}
