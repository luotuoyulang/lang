package cn.luotuoyulang.lang.common;

import cn.hutool.core.util.ObjectUtil;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.Map;

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

    @Override
    public Map<String, String[]> getParameterMap() {
        System.err.println("1111");
        return super.getParameterMap();
    }

    @Override
    public String[] getParameterValues(String name) {
        String[] parameterValues = super.getParameterValues(name);

        if(ObjectUtil.isNotNull(parameterValues) && parameterValues.length > 0){
            for (int i = 0; i < parameterValues.length; i++) {
                String param = parameterValues[i];
                if(StringUtils.isNotEmpty(param)){
                    parameterValues[i] = StringEscapeUtils.escapeHtml(param);
                }
            }
        }
        return parameterValues;
    }


}
