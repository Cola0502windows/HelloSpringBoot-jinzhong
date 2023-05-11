package cola.springboot.hellospringbootjinzhong.system.service;

import cola.springboot.hellospringbootjinzhong.system.pojo.entity.User;

public interface UserService extends BaseService<User>{
    void login(User user);
}
