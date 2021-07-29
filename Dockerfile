FROM openjdk:11.0.9-jdk-slim
WORKDIR /usr/src/app

RUN apt-get update && apt-get install -qy --no-install-recommends \
    zip \
    curl \
    unzip \
    vim \
    && curl -s https://get.sdkman.io | bash

SHELL ["/bin/bash", "-c"]
RUN alias ll='ls -lh'
RUN chmod a+x "${HOME}/.sdkman/bin/sdkman-init.sh"
RUN . "${HOME}/.sdkman/bin/sdkman-init.sh" && sdk install kotlin

