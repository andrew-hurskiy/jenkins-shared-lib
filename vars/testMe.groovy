#!/usr/bin/env groovy

def call(
    String name
   ) {
    String latest_tag = sh(
        script: "Hello $name",
        returnStdout: true
    ).trim()
    
    return latest_tag
    }

