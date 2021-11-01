#!/bin/bash

. ~/.bashrc

mvn clean package
cp -v target/*.war $TOMCAT_HOME/webapps/
starttomcat
explorer.exe http://localhost:8080/frontoffice/
