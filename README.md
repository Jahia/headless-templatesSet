# The Jahia Nextjs initiative : *headless-templatesSet*

## Initiative overview

The aim of the Jahia Nextjs initiative is to explore and explain
the Jahia capabilities, to easily create and manage headless web project.
Solutions we use are :
- [Jahia][jahia-website] : a Cloud / On-premise *DXP* solution to create and contribute
- [Vercel][vercel-website] a next-js Cloud platform provider to render the web project

To know more about the Jahia Nextjs initiative [read this dedicated page][initiative.md].

|Developers|Web Contributors|
|---|---|
|A web project is easy to create and maintain when they have an SDK in their preferred languages, and they can create, update, test and deploy component quickly.| A web project is easy to contribute and maintain when they understand the web site page structure and when they can create a content by clicking a button or just copy past a WYSIWYG content in the web page.|
| ![100] | ![101] |

## Headless-templatesSet overview
This github repository contains the source code of a Jahia **Templates Set** specially created
to manage headless projects. Usually in Jahia, this kind of module is used to pre-designed web page skeletons. But,
in the case of an headless projects, the web page skeletons and templates are not managed inside the CMS.
Also, in the Jahia Nextjs initiative this template set is used to handle simpler topics. This module provides :
- a [default template][template] to inform that the templateSet must be used in conjunction with a proxy like the [nextjs-proxy].
- a [drools rule][rule] to configure a default for each page. In headless project templates are not managed by jahia, but the proxy
can offer a selector to list the templates manage by the headless framework.

[100]: doc/images/100_DevPageTemplate.png
[101]: doc/images/101_ContribPageTempalte.png

[jahia-website]: https://www.jahia.com
[vercel-website]: https://vercel.com
[initiative.md]: https://github.com/Jahia/jahia-nextjs-initiative/blob/main/README.md
[nextjs-proxy]: https://github.com/Jahia/nextjs-proxy

[template]: ./src/main/resources/jnt_template/html/template.headless-templatesSet.jsp
[rule]: ./src/main/resources/META-INF/rules.drl
