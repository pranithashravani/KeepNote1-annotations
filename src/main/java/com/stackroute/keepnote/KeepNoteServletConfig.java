package com.stackroute.keepnote;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class KeepNoteServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{Keepnoteinit.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

