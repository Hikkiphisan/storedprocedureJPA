package org.example.springjpastoreproceduce.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override


//    getRootConfigClasses: Định nghĩa các lớp cấu hình toàn cục cho ứng dụng.

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfiguration.class};
    }

    //getServletConfigClasses: Định nghĩa các lớp cấu hình cho Spring MVC servlet
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{};
    }

    //getServletMappings: Định nghĩa đường dẫn mà DispatcherServlet sẽ xử lý.
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}