package cola.springboot.hellospringbootjinzhong.system.controller;

import cola.springboot.hellospringbootjinzhong.system.pojo.entity.OperationLog;
import cola.springboot.hellospringbootjinzhong.system.pojo.entity.Result;
import cola.springboot.hellospringbootjinzhong.system.service.OperationLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/v1/operationLog")
@Slf4j
public class OperationLogController {


    @Resource
    private OperationLogService operationLogService;

    @GetMapping("/{id}")
    Result<OperationLog> getById(@PathVariable Long id) {
        return Result.ok(operationLogService.findById(id));
    }

    @PostMapping("/save")
    Result<Void> save(@RequestBody OperationLog operationLog) {
        operationLogService.save(operationLog);
        return Result.ok();
    }

    @PutMapping("/update")
    Result<Void> update(@RequestBody OperationLog operationLog) {
        operationLogService.updateById(operationLog);
        return Result.ok();
    }

    @DeleteMapping("/{id}")
    Result<Void> deleteById(@PathVariable Long id) {
        operationLogService.deleteById(id);
        return Result.ok();
    }


}
