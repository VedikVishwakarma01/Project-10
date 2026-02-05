package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.SettingDTO;
import com.rays.form.SettingForm;
import com.rays.service.SettingServiceInt;

@RestController
@RequestMapping(value = "Setting")
public class SettingCtl extends BaseCtl<SettingForm, SettingDTO, SettingServiceInt>{

}
