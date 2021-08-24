#!/bin/bash

set -ex

CONTAINER_NAME=support-microservice
IMAGE_NAME=occp/support-microservice
PORT=3347
PORT_CONTAINER=8080
NETWORK_NAME=occp-net

CONTAINER=`docker container ls -a|grep $CONTAINER_NAME|awk '{print $1}'`
BUILD=$1
if [ "${BUILD}" == "-b" ]; then
    mvn clean package -DskipTests -gs settings.xml
fi
if [ -z "$CONTAINER" ]; then
    docker run --network $NETWORK_NAME --name $CONTAINER_NAME -p $PORT:$PORT_CONTAINER --env-file=.env -d $IMAGE_NAME:$IMAGE_TAG
else
    docker start $CONTAINER_NAME
fi

docker logs -f $CONTAINER_NAME

exit 0;

