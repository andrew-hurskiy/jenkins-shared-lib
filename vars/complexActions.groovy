#!/usr/bin/env groovy

def call(
    String param1,
    String param2
    ) {
   	environment {
		CAT = "${param1}"
	} 
	steps {
		echo "CAT NAME IS ${env.CAT}"
		echo "Param 2 is ${param2}"
	}    
    }
