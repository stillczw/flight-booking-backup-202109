package org.czw.flight.service.front;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.subject.Subject;
import org.czw.flight.mapper.UserMapper;
import org.czw.flight.model.User;
import org.czw.flight.model.UserExample;
import org.czw.flight.utils.FlightToken;
import org.czw.flight.utils.md5.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhiwei_CHEN
 * @date 2021/10/23 20:00
 */
@Service
public class UserServiceFrontImpl implements UserServiceFront {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean addUser(User userVo) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(userVo.getUsername()).andIsDeletedEqualTo(0);
        if (userMapper.selectByExample(userExample).size() != 0) {
            return false;
        }
        userVo.setAddTime(new Date());
        userVo.setUpdateTime(new Date());
        userVo.setIsDeleted(0);
        return userMapper.insert(userVo) == 1;
    }

    @Override
    public User getUser(User userVo) {
        String username = userVo.getUsername();
        String password = userVo.getPassword();


//        Subject subject= SecurityUtils.getSubject();
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password).andIsDeletedEqualTo(0);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size() > 0) {
            return users.get(0);
        }

//        String md5password = Md5Utils.getMd5(password, "2590312");
//        System.out.println(md5password);
//        System.out.println(user.getPassword());
        /*try {
            subject.login(new FlightToken(username, md5password, "users"));
            return true;
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }*/
        return null;
    }

    @Override
    public boolean updateUser(User userVo) {
        Map<String, Object> map = new HashMap<>();
        map.put("nickname", userVo.getNickname());
        map.put("password", userVo.getPassword());
        map.put("phoneNumber", userVo.getPhoneNumber());
        map.put("updateTime", new Date());
        map.put("username", userVo.getUsername());
//        User user = new User(userVo.getUserId(), userVo.getUsername(), userVo.getPassword(), userVo.getPhoneNumber(), userVo.getNickname(), userVo.getAddTime(), new Date(), userVo.getIsDeleted());
        int i = userMapper.updateByUsername(map);
        return i != 0;

    }
}
