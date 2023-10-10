FROM arm64v8/eclipse-temurin:17-jre-ubi9-minimal

ENV OTEL_AGENT_JAR_FILE=opentelemetry-javaagent.jar \
    APP_HOME=/app/bin \
    MIN_HEAP_SIZE="40M" MAX_HEAP_SIZE="512M" THREADSTACK_SIZE="228k" \
    JAVA_GC_ARGS="-XX:MinHeapFreeRatio=20 -XX:MaxHeapFreeRatio=40 -XX:+UseSerialGC -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90" \
    JAVA_OPTS="-server -Duser.timezone=Europe/Berlin -Djava.security.egd=file:/dev/./urandom -XX:CompressedClassSpaceSize=64m -XX:MaxMetaspaceSize=256m" \
    JAVA_DIAG_ARGS="" \
    JAVA_OPTS_APPEND=""

RUN mkdir -p ${APP_HOME}

COPY ./scripts/start-app.sh ${APP_HOME}/
COPY ./target/agent/${OTEL_AGENT_JAR_FILE} ${APP_HOME}/

CMD ["sh", "/app/bin/start-app.sh"]
