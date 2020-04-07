Application structure:
----------------------
In the zkspringboot-demo-jar example the zul files are located below the class web resource folder src/main/resources/web/zul/

You can configure any folder below src/main/resources/web in using a the zk.view-resolver-prefix property in application.properties. The extension .zul is added automatically by the default value of zk.view-resolver-suffix.

zul files can be referenced like this:

<include src="~./zul/mvvm-page1.zul"/>
<apply templateURI="~./zul/mvvm-page1.zul"/>
General resource folders are:

src/main/resources/static Spring Boot's resource folder
src/main/resources/web ZK's class-web-resource folder
Spring Boot resources are referenced by urls starting with '/' ZK resources (including zul files) are prefixed with '~./'

So "static" folder is the Spring Boot's resource folder and "web" folder is ZK's class-web-resource folder:
<image src="/img/zklogo1.png"/>      <!-- src/main/resources/static/img/zklogo1.png -->
<image src="~./img/zklogo1.png"/>    <!-- src/main/resources/web/img/zklogo3.png -->

Examples how to access resources from either resource folder are:
from a zul file: src/main/resources/web/zul/resources.zul
global resources: src/main/resources/metainfo/zk/lang-addon.xml

