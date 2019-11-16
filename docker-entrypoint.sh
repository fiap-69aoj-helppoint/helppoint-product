#!/bin/sh

echo 'Sleeping 20s...'
sleep 15

echo 'Starting...'
java -jar -Dspring.profiles.active=prod /product.jar