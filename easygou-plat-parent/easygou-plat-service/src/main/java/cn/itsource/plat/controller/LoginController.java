package cn.itsource.plat.controller;


import cn.itsource.basic.util.AjaxResult;
import cn.itsource.plat.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public AjaxResult login(@RequestBody User user){
        String username = user.getUsername();
        String password = user.getPassword();

        if("root".equals(username)&&"root".equals(password)){
            return AjaxResult.me().setSuccess(true).setMessage("登录你成功了!");
        }
        return AjaxResult.me().setSuccess(false).setMessage("登录失败，下次再来懵!");
    }
}
