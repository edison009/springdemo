FROM openjdk:8-jre-alpine

EXPOSE 8081
# Copy war file
COPY devops-accelerator.war /devops-accelerator.war

# run the app
CMD ["/usr/bin/java", "-jar", "/devops-accelerator.war"]


