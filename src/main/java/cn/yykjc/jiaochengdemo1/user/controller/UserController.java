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

    @RequestMapping("save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity){

        System.out.println("用户注册" + userEntity.toString());

        userService.save(userEntity);

//        return "redirect:/index.html";
        return "success";
    }

}
