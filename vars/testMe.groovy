#!/usr/bin/env groovy

def call(
    String name
   ) {
    sh(
        script: "Hello $name",
        returnStdout: false
    ).trim()
    
    }

