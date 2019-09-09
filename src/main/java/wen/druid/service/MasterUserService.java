package wen.druid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wen.druid.entity.MasterUser;
import wen.druid.mapper.MasterUserMapper;

@Service
public class MasterUserService {

    @Autowired
    private MasterUserMapper masterUserMapper;

    public MasterUser getMasterUser(Integer id) {
        return masterUserMapper.selectByPrimaryKey(id);
    }

    public int insert() {

        MasterUser masterUser = new MasterUser();
        masterUser.setName("your papa");
        masterUser.setAge(48);
        masterUser.setGender("M");

        return masterUserMapper.insert(masterUser);
    }
}
