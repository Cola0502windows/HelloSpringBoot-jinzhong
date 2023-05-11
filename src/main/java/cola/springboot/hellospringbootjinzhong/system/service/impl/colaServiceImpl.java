package cola.springboot.hellospringbootjinzhong.system.service.impl;

import cola.springboot.hellospringbootjinzhong.system.entity.dao.Cola;
import cola.springboot.hellospringbootjinzhong.system.mapper.ColaMapper;
import cola.springboot.hellospringbootjinzhong.system.service.ColaService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class colaServiceImpl implements ColaService {
    @Resource
    ColaMapper colaMapper;
    @Override
    public List<Cola> findAll() {
        List<Cola> colaList = colaMapper.findAll();
        return colaList;
    }

    @Override
    public Cola insert(Cola cola) {
        Cola save = colaMapper.save(cola);
        return save;
    }
}
