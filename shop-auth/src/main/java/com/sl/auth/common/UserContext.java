package com.sl.auth.common;

import com.sl.auth.entity.MyUser;
import org.springframework.stereotype.Component;

/**
 * @ClassName UserContext
 * @Description TODO
 * @Author leis
 * @Date 2019/8/5 14:25
 * @Version 1.0
 **/
@Component
public class UserContext {

    private static ThreadLocal<MyUser> userHold = new ThreadLocal<>();

    public MyUser getUser() {
        return userHold.get();
    }

    public void setUser(MyUser myUser) {
        userHold.set(myUser);
    }

    public void clear() {
        userHold.remove();
    }
}
