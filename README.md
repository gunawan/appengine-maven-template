Google App Engine Maven Project Template 
==========================================

Quick Start
-----------
To simply run the app:

    git clone https://github.com/gunawan/appengine-maven-template.git
    cd appengine-maven-template
    mvn clean install
    mvn appengine:devserver

Issue
-----------
If you are encountering the following error in Eclipse, you may solve it by executing maven goal outside Eclipse, i.e. Terminal.
    Plugin execution not covered by lifecycle configuration: com.google.appengine:appengine-maven-plugin:
     1.8.5:endpoints_get_discovery_doc (execution: default, phase: compile)
This is related to issue logged in https://code.google.com/p/appengine-maven-plugin/issues/detail?id=41

    
Version
-----------
Google AppEngine 1.8.5

Issue
-----------
