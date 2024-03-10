#!/usr/bin/env groovy

def call(
    String app_name,
    String repo_type = "release",
    Boolean is_debug_on = false
    ) {
        
    String base_url = 'https://nexus.taf.nl:8443/service/rest/repository/browse/docker-private/v2/taf/'
    String final_url = base_url + app_name + '/' + repo_type + '/tags/'

    String latest_tag = sh(
        script: "curl -s $final_url | grep -Eo '[a-z-]*[^?\/][[:digit:]]+\\.[[:digit:]]+\\.[[:digit:]]+' | tr -d '>' | sort -rVu | head -n 1",
        returnStdout: true
    ).trim()
    
    if (is_debug_on) {
        echo "final_url -> ${final_url}"
        echo "latest_tag -> ${latest_tag}"
    }

    return latest_tag
    }
