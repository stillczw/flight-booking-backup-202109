package org.czw.flight.utils;

import lombok.Data;
import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @author zhiwei_CHEN
 * @date 2021/11/14 19:45
 */
@Data
public class FlightToken extends UsernamePasswordToken {
    String type;

    public FlightToken(String username, String password, String type) {
        super(username, password);
        this.type = type;
    }
}
