FROM mnadeem/boot-otel-tempo-docker:0.0.1-SNAPSHOT
ENV APP_NAME boot-otel-tempo-mq-consumer

COPY ./target/${APP_NAME}-*.jar ${APP_HOME}/${APP_NAME}.jar

EXPOSE 8091
# OpenTelemetry:
# https://github.com/open-telemetry/opentelemetry-java-instrumentation
ENV JAVA_OPTS "${JAVA_OPTS} \
  -Dotel.traces.exporter=otlp \
  -Dotel.exporter.otlp.endpoint=http://tempo:4317 \
  -Dotel.resource.attributes="service.name=${APP_NAME}" \
  -Dotel.javaagent.debug=false \
  -javaagent:${APP_HOME}/${OTEL_AGENT_JAR_FILE}"