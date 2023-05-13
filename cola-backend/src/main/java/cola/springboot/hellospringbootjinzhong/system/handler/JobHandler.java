package cola.springboot.hellospringbootjinzhong.system.handler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;


@Component
public class JobHandler {

    @XxlJob("demoJobHandler")
    public ReturnT<String> demoJobHandler(String param) throws Exception {
        System.out.println("Hello XXL-JOB.");
        return ReturnT.SUCCESS;
    }
}
