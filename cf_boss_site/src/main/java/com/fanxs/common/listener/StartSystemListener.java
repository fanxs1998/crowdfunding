package com.fanxs.common.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author fanxs
 * @date 2021/2/7
 */
public class StartSystemListener implements ServletContextListener {
    //在服务器启动时,创建application对象时需要执行的方法.
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //1.将项目上下文路径(request.getContextPath())放置到application域中.
        ServletContext application = sce.getServletContext();
        String contextPath = application.getContextPath();
        application.setAttribute("APP_PATH", contextPath);
        System.out.println("APP_PATH >>>>>>>>  "+contextPath);

        //2.加载所有许可路径
/*        ApplicationContext ioc = WebApplicationContextUtils.getWebApplicationContext(application);
        PermissionService permissionService = ioc.getBean(PermissionService.class);
        List<Permission> queryAllPermission = permissionService.queryAllPermission();

        Set<String> allURIs = new HashSet<String>();

        for (Permission permission : queryAllPermission) {
            allURIs.add("/"+permission.getUrl());
        }

        application.setAttribute(Const.ALL_PERMISSION_URI, allURIs);*/
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
