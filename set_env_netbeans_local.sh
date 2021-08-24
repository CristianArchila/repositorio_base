#!/bin/bash

set -e

projects=( 
	config-server
	discovery-service
	gateway
	profile-microservice
	company-microservice			
	support-microservice
	audit-microservice
	mailing-microservice
	notification-microservice
	payments-microservice
)
for project in "${projects[@]}"; do
	cp nb.env $project/nb-configuration.xml
	cp nb.env $project/
	cp set_env_netbeans_local.sh $project/
done

exit;
