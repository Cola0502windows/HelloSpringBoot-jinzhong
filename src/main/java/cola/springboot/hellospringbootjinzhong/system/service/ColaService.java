package cola.springboot.hellospringbootjinzhong.system.service;


import cola.springboot.hellospringbootjinzhong.system.entity.dao.Cola;

import java.util.List;

public interface ColaService {
    List<Cola> findAll();

    Cola insert(Cola cola);
}
