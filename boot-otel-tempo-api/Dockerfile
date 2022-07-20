FROM mnadeem/boot-otel-tempo-docker:0.0.1-SNAPSHOT
ENV APP_NAME boot-otel-tempo-api

COPY ./target/${APP_NAME}-*.jar ${APP_HOME}/${APP_NAME}.jar

EXPOSE 8080
# OpenTelemetry:
# https://github.com/open-telemetry/opentelemetry-java-instrumentation
ENV JAVA_OPTS "${JAVA_OPTS} \
  -Dotel.traces.exporter=jaeger \
  -Dotel.exporter.jaeger.endpoint=http://tempo:14250 \
  -Dotel.metrics.exporter=none \
  -Dotel.resource.attributes="service.name=${APP_NAME}" \
  -Dotel.javaagent.debug=false \
  -javaagent:${APP_HOME}/${OTEL_AGENT_JAR_FILE}"