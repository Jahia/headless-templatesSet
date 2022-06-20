# The Jahia Nextjs initiative : *headless-templatesSet*

## Initiative overview

This module is one of the three components of the Jahia Nextjs initiative. The aim of this initiative is
to explore and explain the Jahia capabilities to easily create and manage headless web project.

|Developers|Web Contributors|
|---|---|
|A web project is easy to create and maintain when they have an SDK in their preferred languages, and they can create, update, test and deploy component quickly.| A web project is easy to contribute and maintain when they understand the web site page structure and when they can create a content by clicking a button or just copy past a WYSIWYG content in the web page.|
| ![100] | ![101] |

## Headless-templatesSet overview
This github repository contains the source code of a Jahia **Templates Set** specially created
to manage headless projects. Usually in Jahia, this kind of module is used to pre-designed web page skeletons. But,
in the case of an headless projects, the web page skeletons and templates are not managed inside the CMS.
Also, in the Jahia Nextjs initiative this template set is used to handle other topics. This module provides :
- an [HTTP proxy][proxy] to redirect edit and preview rendering
- a [mixin][definition] to configure paths and token to interact with your Nextjs app
- a [mixin][definition] and its [contentList Initializer][initializer] to list and select headless templates for your pages
- a [graphQL extension provider][graphQL] to create content areas (temporarily in this module)



[100]: doc/images/100_DevPageTemplate.png
[101]: doc/images/101_ContribPageTempalte.png

[proxy]: ../../nextjs-proxy/src/main/java/org/jahia/se/modules/headless/ProxyServlet.java
[initializer]: ../../nextjs-proxy/src/main/java/org/jahia/se/modules/headless/initializers/TemplateNameInitializer.java
[graphQL]: ../../nextjs-proxy/src/main/java/org/jahia/se/modules/headless/graphql
[template]: ./src/main/resources/jnt_template/html/template.headless-templatesSet.jsp
[definition]: ./src/main/resources/META-INF/definitions.cnd
