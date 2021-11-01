#!/bin/bash

mvn clean package
java -cp target/core-1.0.jar Startup
