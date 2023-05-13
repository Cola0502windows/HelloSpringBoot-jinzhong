package cola.springboot.hellospringbootjinzhong.system.service.impl;

import cola.springboot.hellospringbootjinzhong.system.exception.ColaException;
import cola.springboot.hellospringbootjinzhong.system.pojo.dao.UserDao;
import cola.springboot.hellospringbootjinzhong.system.pojo.entity.User;
import cola.springboot.hellospringbootjinzhong.system.service.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserDao, User> implements UserService {
    @Resource
    private AuthenticationManager authenticationManager;

    @Resource
    private BCryptPasswordEncoder encoder;

    @Override
    public void save(User entity) {
        entity.setPassword(encoder.encode(entity.getPassword()));
        super.save(entity);
    }

    @Override
    public void login(User user) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword());
        // 使用spring security的认证方法
        try {
            authenticationManager.authenticate(token);
        } catch (AuthenticationException e) {
            throw new ColaException("用户名或密码错误", e);
        }

    }
}
