package wen.druid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wen.druid.entity.CustomUser;
import wen.druid.mapper.CustomUserMapper;

@Service
public class CustomUserService {

    @Autowired
    private CustomUserMapper customUserMapper;

    public CustomUser getCustomUser(Integer id) {
        return customUserMapper.selectByPrimaryKey(id);
    }

    public int insert() {

        CustomUser customUser = new CustomUser();
        customUser.setName("mama");
        customUser.setAge(49);
        customUser.setGender("F");

        return customUserMapper.insert(customUser);
    }
}
