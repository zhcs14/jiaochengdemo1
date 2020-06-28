package cn.yykjc.jiaochengdemo1.user.service;

import cn.yykjc.jiaochengdemo1.user.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserEntity> getAll(Map map);

    void delById(Integer id);

    //保存用户
    void save(UserEntity userEntity);

    //根据Id查询用户信息
    UserEntity getUserById(Integer id);

    //根据ID修改用户信息
    void updataUserById(UserEntity userEntity);

}
