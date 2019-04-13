package cn.luotuoyulang.lang.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuyuhu
 * @Description
 * @Package cn.luotuoyulang.lang.exception
 * CreaterName liuyuhu
 * @Email 17600520726@163.com
 * @Date 2019/4/13
 */
@RestControllerAdvice
public class GlobalException {

    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(Exception ex) {
        Map map = new HashMap();
        map.put("code", 100);
        map.put("msg", ex.getMessage());
        return map;
    }

    /**
     * 拦截捕捉自定义异常 MyException.class
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = MyRuntimeException.class)
    public Map myErrorHandler(MyRuntimeException ex) {
        Map map = new HashMap();
        return map;
    }
}
