package cola.springboot.hellospringbootjinzhong.system.service.impl;

import cola.springboot.hellospringbootjinzhong.system.pojo.dao.UserDao;
import cola.springboot.hellospringbootjinzhong.system.pojo.entity.Permission;
import cola.springboot.hellospringbootjinzhong.system.pojo.entity.Role;
import cola.springboot.hellospringbootjinzhong.system.pojo.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private UserDao userDao;
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);
        List<Role> roles = user.getRoles();
        List<Permission> permissions = roles.stream().flatMap(r->r.getPermissions().stream()).distinct().toList();
        user.setAuthorities(permissions);
        return user;
    }
}
