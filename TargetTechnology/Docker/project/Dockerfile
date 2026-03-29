# Base image
FROM registry.access.redhat.com/ubi9/ubi:latest

# Maintainer/Author information
LABEL maintainer="Anuj Gahra anujgahra244304@gmail.com"
LABEL description="This is a custom Docker image for hosting simple webpage using Apache on RHEL 9."
LABEL version="latest"

# Install Apache (httpd)
RUN dnf update -y && dnf install -y httpd && dnf clean all

# Expose port 80
EXPOSE 80

# Add a simple index.html
RUN echo "Nehra Classes Are Awesome!!!" > /var/www/html/index.html

# Start Apache in the foreground
CMD ["/usr/sbin/httpd", "-D", "FOREGROUND"]
