package cola.springboot.hellospringbootjinzhong.system.advice;

import cola.springboot.hellospringbootjinzhong.system.exception.ColaException;
import cola.springboot.hellospringbootjinzhong.system.pojo.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(ColaException.class)
    public Result<Void> handleColaException(ColaException e) {
        log.error(e.getMessage(), e);
        return Result.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result<Void> handleException(Exception e) {
        log.error(e.getMessage(), e);
        return Result.error(e.getMessage());
    }
}
