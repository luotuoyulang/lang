package cn.luotuoyulang.lang.common;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import org.apache.commons.lang.StringEscapeUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class XssHttpServletRequestWrapper extends HttpServletRequestWrapper {

    public XssHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String name) {
        String parameterValue = super.getParameter(name);
        if(StringUtils.isNotEmpty(parameterValue)){
            parameterValue = StringEscapeUtils.escapeHtml(parameterValue);
        }
        return parameterValue;
    }
}
