package com.main.homePage.mapper;

import com.main.homePage.dto.option.OptionListDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OptionMapper {

    public void selectOptionList(OptionListDto optionListDto);

}