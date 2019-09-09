package wen.druid.mapper;

import wen.druid.entity.MasterUser;

public interface MasterUserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(MasterUser masterUser);

    int insertSelective(MasterUser masterUser);

    MasterUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MasterUser masterUser);

    int updateByPrimaryKey(MasterUser masterUser);

}
