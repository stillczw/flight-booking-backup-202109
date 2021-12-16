package org.czw.flight.service.front;

import org.czw.flight.model.User;

import java.util.Map;

/**
 * @author zhiwei_CHEN
 * @date 2021/10/23 19:56
 */
public interface UserServiceFront {
    boolean addUser(User user);

    User getUser(User user);

    boolean updateUser(User userVo);
}
