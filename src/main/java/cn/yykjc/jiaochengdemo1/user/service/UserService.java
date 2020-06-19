package cn.yykjc.jiaochengdemo1.user.service;

import cn.yykjc.jiaochengdemo1.user.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserEntity> getAll(Map map);

    void delById(Integer id);

    void save(UserEntity userEntity);
}
