package cn.yykjc.jiaochengdemo1.user.service;

import cn.yykjc.jiaochengdemo1.user.dao.UserDao;
import cn.yykjc.jiaochengdemo1.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> getAll(Map map) {
        return userDao.getAll(map);
    }

    @Override
    public void delById(Integer id) {
        userDao.delById(id);
    }

    @Override
    public void save(UserEntity userEntity) {
        userEntity.setCreatetime(new Date());
        userEntity.setStauts(1);
        userDao.save(userEntity);
    }

    @Override
    public UserEntity getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public void updataUserById(UserEntity userEntity) {
        userDao.updataUserById(userEntity);
    }
}
