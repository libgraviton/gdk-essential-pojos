# gdk-essential-pojos

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.libgraviton/gdk-essential-pojos/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.libgraviton/gdk-essential-pojos)

## What is it

Based on [gdk-java](https://github.com/libgraviton/gdk-java) this repository provides the essential POJOs that are needed for the [worker-base](https://github.com/libgraviton/graviton-worker-base-java) to work with the gdk integration.

## How to update the POJOs

The prerequisite to be able to generate new / updated POJOs is a running [Graviton](https://github.com/libgraviton/graviton) instance.
Adapt the 'gravitonUrl' tag in the pom.xml with the URL that points to the running Graviton.

A simple `mvn clean install` will clean all previous POJOs and generate new ones.

### Adapt the whitelist

The 'endpoint.whitelist' resource file defines all the endpoints that should be included for the POJO generation. Need a new endpoint? Simply add a new line with the endpoint and all the POJOs belonging to this endpoint will be generated as well.
