#!/bin/bash

set -ex

DEL=$1
CONTAINER_NAME=support-microservice

docker stop $CONTAINER_NAME

if [ "${DEL}" == "-d" ]; then
    docker container rm `docker container ls -a|grep $CONTAINER_NAME|awk '{print $1}'`
fi

exit 0;

