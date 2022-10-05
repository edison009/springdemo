FROM openjdk:8-jre-alpine

EXPOSE 8081
# Copy war file
COPY springdemo.war /springdemo.war

# run the app
CMD ["/usr/bin/java", "-jar", "/springdemo.war"]


