ARG VERSION="0.0.1-SNAPSHOT"

# Maven base image for building the java code
FROM maven:3-openjdk-11-slim as builder

WORKDIR /usr/share/app
COPY pom.xml .
# Downloads packages defined in pom.xml
RUN mvn clean package
COPY src src
# Build the source code to generate fat jar
RUN mvn clean package -Dmaven.test.skip=true

# Java runtime as final base image
FROM openjdk:11-jre-slim-buster

ARG VERSION
ENV JAR="iudx.data.ingestion.server-cluster-0.0.1-SNAPSHOT-fat.jar"

WORKDIR /usr/share/app
# Copying openapi docs 
COPY docs docs
# Copying cluster fatjar from builder image stage to final image 
COPY --from=builder /usr/share/app/target/${JAR} ./fatjar.jar
# expose http, https and metrics port
EXPOSE 8080 8443 9000 
# create non-root use 1001
RUN useradd -r -u 1001 -g root di-user
# Setting non-root user to use when container starts
USER di-user
