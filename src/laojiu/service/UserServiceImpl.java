package laojiu.service;

import laojiu.dao.UserMapper;
import laojiu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User loginIn(User user) {
        return userMapper.loginIn(user);
    }
}
