package cola.springboot.hellospringbootjinzhong.system.controller;

import cola.springboot.hellospringbootjinzhong.system.entity.dao.Cola;
import cola.springboot.hellospringbootjinzhong.system.service.ColaService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("v1/api/cola")
public class ColaController {

    @Resource
    ColaService colaService;

    @GetMapping("sayHello")
    public String sayHello(){
        return "Cola-Hello SpringBoot-jinzhong";
    }

    @GetMapping("findAll")
    public List<Cola> findAll(){
        List<Cola> colaList = colaService.findAll();
        return colaList;
    }

    @PostMapping("insert")
    public Cola insert(Cola cola){
        Cola save_cola = colaService.insert(cola);
        return save_cola;
    }
}
