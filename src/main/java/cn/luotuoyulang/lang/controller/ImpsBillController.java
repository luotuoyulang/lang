package cn.luotuoyulang.lang.controller;


import cn.luotuoyulang.lang.entity.ImpsBill;
import cn.luotuoyulang.lang.exception.MyRuntimeException;
import cn.luotuoyulang.lang.service.IImpsBillService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 账单 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-03-20
 */
@Slf4j
@RestController
@RequestMapping("/imps-bill")
public class ImpsBillController {

    @Resource
    private IImpsBillService impsBillService;

    @RequestMapping(value = "/a",method = RequestMethod.GET)
    public String a(String va){
        try {
            log.info("进来啦   [{}]  " ,va);
            IPage<ImpsBill> page = impsBillService.page(new Page<>(0, 3));
            String sa = StringEscapeUtils.escapeHtml("<a>dddd</a>");
            return va;
        } catch (Exception e) {
            e.printStackTrace();
            throw new MyRuntimeException();
        }
    }

}
