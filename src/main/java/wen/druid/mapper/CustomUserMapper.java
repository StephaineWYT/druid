package wen.druid.mapper;

import wen.druid.entity.CustomUser;

public interface CustomUserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(CustomUser customUser);

    int insertSelective(CustomUser customUser);

    CustomUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomUser customUser);

    int updateByPrimaryKey(CustomUser customUser);

}
