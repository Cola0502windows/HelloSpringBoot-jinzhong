package cola.springboot.hellospringbootjinzhong.system.service.impl;

import cola.springboot.hellospringbootjinzhong.system.pojo.entity.Cola;
import cola.springboot.hellospringbootjinzhong.system.pojo.dao.ColaDao;
import cola.springboot.hellospringbootjinzhong.system.service.ColaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ColaServiceImpl implements ColaService {
    @Resource
    ColaDao colaDao;
    @Override
    public List<Cola> findAll() {
        List<Cola> colaList = colaDao.findAll();
        return colaList;
    }

    @Override
    public Cola insert(Cola cola) {
        Cola save = colaDao.save(cola);
        return save;
    }
}
