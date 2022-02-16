package org.jahia.se.modules.headless;


import org.jahia.services.render.RenderContext;
import org.jahia.services.render.Resource;
import org.jahia.services.render.filter.AbstractFilter;
import org.jahia.services.render.filter.RenderChain;
import org.jahia.services.render.filter.RenderFilter;
import org.osgi.service.component.annotations.Component;

@Component(service = RenderFilter.class, immediate = true)
public class HeadlessRenderFilter extends AbstractFilter {
//    @Override
//    public String prepare(RenderContext renderContext, Resource resource, RenderChain chain) throws Exception {
////        return super.prepare(renderContext, resource, chain);
//        renderContext.getResponse().sendRedirect("http://localhost:3000");
//        return "";
//    }
//    public HeadlessRenderFilter(){
////        setApplyOnModules("Templates Set for headless project");
//        setApplyOnSiteTemplateSets("headless-templatesSet");
//        setPriority(-9999f);
//        setApplyOnConfigurations("page");
//    }
}
