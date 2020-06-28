package cn.yykjc.jiaochengdemo1.user.controller;

import cn.yykjc.jiaochengdemo1.user.entity.UserEntity;
import cn.yykjc.jiaochengdemo1.user.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {


//    @RequestMapping("test")
//    public String test(){
//
//        return "test...";
//    }
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("getAll")
    public List<UserEntity> getAll(Map map){

        return userService.getAll(map);
    }

    @RequestMapping("delById")
    public String delById(Integer id){
        userService.delById(id);
        return "redirect:/index.html";
    }

    //保存用户
    @RequestMapping("save")
    //@ResponseBody
    public String save(@RequestBody UserEntity userEntity){

        System.out.println("用户注册" + userEntity.toString());

        userService.save(userEntity);

        return "redirect:/index.html"; //相当于返回json字符串
        //return "success";
    }

    //根据ID查询用户信息
    @RequestMapping("getUserById")
    @ResponseBody
    public UserEntity getUserById(Integer id){
        return userService.getUserById(id);
    }

    //根据ID修改用户信息
    @RequestMapping("updataUserById")
    @ResponseBody
    public void updataUserById(@RequestBody UserEntity userEntity){

        userService.updataUserById(userEntity);

//        return "updataUserByIdSuccess";

//        return "ok";
    }


}
