package com.leslie.service.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class MyFilter extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(MyFilter.class);


    /**
     * 过滤器类型
     * pre：路由之前
     * routing: 路由之时
     * post: 路由之后
     * error: 发送错误调用
     * @date: 2019年04月04日
     * @author: leslie.zhang
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤顺序
     * @date: 2019年04月04日
     * @author: leslie.zhang
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 这里可以写逻辑判断是否要过滤，true表示永远过滤
     * @date: 2019年04月04日
     * @author: leslie.zhang
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑，可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问
     * @date: 2019年04月04日
     * @author: leslie.zhang
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        logger.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            logger.warn("token is empty");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                context.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }
        logger.info("ok");
        return null;
    }
}
