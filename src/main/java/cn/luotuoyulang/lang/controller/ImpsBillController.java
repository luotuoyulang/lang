package cn.luotuoyulang.lang.controller;


import cn.luotuoyulang.lang.entity.ImpsBill;
import cn.luotuoyulang.lang.service.IImpsBillService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 账单 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-03-20
 */
@RestController
@RequestMapping("/imps-bill")
public class ImpsBillController {

    @Resource
    private IImpsBillService impsBillService;

    @RequestMapping(value = "/a",method = RequestMethod.GET)
    public IPage<ImpsBill> a(){
        try {
            IPage<ImpsBill> page = impsBillService.page(new Page<>(0, 3));
            String sa = StringEscapeUtils.escapeHtml("<a>dddd</a>");
            return page;
                    
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(StringEscapeUtils.escapeHtml("<a>dddd</a>"));
    }
}
