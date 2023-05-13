package cola.springboot.hellospringbootjinzhong.system.pojo.dao;

import cola.springboot.hellospringbootjinzhong.system.pojo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends BaseDao<User>{
    /**
     * 根据用户名查询用户
     */
    User findByUsername(String username);
}
