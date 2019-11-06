package com.zking.gateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

public class TokenFilter extends ZuulFilter {
        @Override
        public String filterType() {
            return "pre"; //定义filter的类型，有pre、route、post、error四种
        }

        @Override
        public int filterOrder() {
            return 0; //定义filter的顺序，数字越小表示顺序越高，越先执行
        }

        @Override
        public boolean shouldFilter() {
            return true; //表示是否需要执行该filter，true表示执行，false表示不执行
        }

        @Override
        public Object run() {
            RequestContext requestContext = RequestContext.getCurrentContext();
            HttpServletRequest request = requestContext.getRequest();
            //获取请求参数中的token
            String token = request.getParameter("token");
            if (null==token){
                requestContext.setSendZuulResponse(false); //不对其进行路由
                requestContext.setResponseStatusCode(400);
                requestContext.setResponseBody("token is empty");
                requestContext.set("isSuccess", false);
            }else {
                requestContext.setSendZuulResponse(true); //对请求进行路由
                requestContext.setResponseStatusCode(200);
                requestContext.set("isSuccess", true);
            }
            return null; //filter需要执行的具体操作
        }
}
