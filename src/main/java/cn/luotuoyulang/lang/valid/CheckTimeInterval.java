package cn.luotuoyulang.lang.valid;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
import java.util.Date;

/**
 * @author liuyuhu
 * @Description
 * @Package cn.luotuoyulang.lang.valid
 * CreaterName liuyuhu
 * @Email 17600520726@163.com
 * @Date 2019/4/13
 */
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER,ElementType.ANNOTATION_TYPE,ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
//@Constraint(validatedBy = CheckTimeIntervalValidator.class)
@Documented
@Repeatable(CheckTimeInterval.List.class)
public @interface CheckTimeInterval {

    String startTime() default "from";

    String endTime() default "to";

    String message() default "hibernate ...... message...";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER,ElementType.ANNOTATION_TYPE,ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List{
        CheckTimeInterval[] value();
    }
}
