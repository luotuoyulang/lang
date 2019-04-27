package cn.luotuoyulang.lang.entity;

import cn.luotuoyulang.lang.valid.CheckTimeInterval;
import cn.luotuoyulang.lang.valid.QueryGroup;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author liuyuhu
 * @Description
 * @Package cn.luotuoyulang.lang.entity
 * CreaterName liuyuhu
 * @Email 17600520726@163.com
 * @Date 2019/4/13
 */

@Data
//@CheckTimeInterval(startTime = "startTime" , endTime = "endTime" ,message = "开始时间不得大于结束时间")
public class UserValidation {

    @NotNull(message = "用户不能为空")
//    @NotNull(groups = QueryGroup.class,message = "用户不能为空")
    private String userName;
    private Integer userAge;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date startTime;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date endTime;

}
