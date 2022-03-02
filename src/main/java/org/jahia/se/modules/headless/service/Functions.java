package org.jahia.se.modules.headless.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jahia.services.render.RenderContext;
import org.jahia.services.render.Resource;

import javax.jcr.RepositoryException;

public final class Functions {
    private static final Logger logger = LoggerFactory.getLogger(Functions.class);

    private Functions() {
        //
    }

    public static String buildDataRender(Resource currentResource,RenderContext renderContext) throws RepositoryException {
        JSONObject props = new JSONObject();
        JSONObject currentNode = new JSONObject();
        JSONObject mainNode = new JSONObject();

        try{
            currentNode.put("identifier",currentResource.getNode().getIdentifier());
            currentNode.put("path",currentResource.getNode().getPath());
            mainNode.put("identifier",renderContext.getMainResource().getNode().getIdentifier());
            mainNode.put("path",renderContext.getMainResource().getNode().getPath());

            props.put("currentNode",currentNode);
            props.put("mainNode",mainNode);
            props.put("currentLocale",currentResource.getLocale().toString());
            props.put("uiLocale",renderContext.getUILocale().toString());
            props.put("user",renderContext.getUser().getUsername());
            props.put("editMode",renderContext.isEditMode());
            props.put("workspace",renderContext.getWorkspace());

        }catch (RepositoryException | JSONException e){
            logger.error("Error building data render e: "+e);
        }
        return getEncodedData(props);
    }

    private static  String getEncodedData(JSONObject data) {
//        Base64.Encoder enc= Base64.getEncoder();
//        try {
//            urec.encode(data.toString().getBytes("UTF8"))
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//"[\\u00A0-\\u9999<>\\&\";]"
//        return data.toString().replace(/[\u00A0-\u9999<>\&";]/g, i => '&#' + i.charCodeAt(0) + ';');
    }

    public static Map<String, Object> getProviderConfig() {
        Map<String, Object> properties = null;

        BundleContext bundleContext = FrameworkUtil.getBundle(Functions.class).getBundleContext();
        ServiceReference<ConfigurationAdmin> cmRef = bundleContext.getServiceReference(ConfigurationAdmin.class);
        ConfigurationAdmin configAdmin = bundleContext.getService(cmRef);
        try{
            Configuration config = configAdmin.getConfiguration("org.jahia.se.modules.widen_provider");
            Dictionary<String, ?> dict = config.getProperties();
            List<String> keys = Collections.list(dict.keys());
            properties = keys.stream()
                    .collect(Collectors.toMap(Function.identity(), dict::get));

        }catch (IOException e){
            logger.error("Error reading widen config file e: "+e);
        }
        return properties;
    }
}
