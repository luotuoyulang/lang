//package cn.luotuoyulang.lang.valid;
//
//import javafx.fxml.Initializable;
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
///**
// * @author liuyuhu
// * @Description
// * @Package cn.luotuoyulang.lang.valid
// * CreaterName liuyuhu
// * @Email 17600520726@163.com
// * @Date 2019/4/13
// */
//public class CheckTimeIntervalValidator implements ConstraintValidator<CheckTimeInterval,Object> {
//
//    private Date startTime;
//
//    private Date endTime;
//
//    @Override
//    public void initialize(CheckTimeInterval checkTimeInterval){
//        this.startTime = checkTimeInterval.startTime();
//        this.endTime = checkTimeInterval.endTime();
//    }
//
//    @Override
//    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
//
//        int res = endTime.compareTo(startTime);
//        return false;
//    }
//}
