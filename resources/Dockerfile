FROM centos:centos8

# Fix CentOS repos
RUN sed -i 's/mirrorlist/#mirrorlist/g' /etc/yum.repos.d/CentOS-* \
 && sed -i 's|#baseurl=http://mirror.centos.org|baseurl=http://vault.centos.org|g' /etc/yum.repos.d/CentOS-* \
 && yum update -y \
 && yum install -y httpd \
 && yum clean all

# Set ServerName to avoid warnings
RUN echo "ServerName localhost" >> /etc/httpd/conf/httpd.conf

# Expose Apache default port
EXPOSE 80

# Run Apache in foreground
CMD ["httpd", "-D", "FOREGROUND"]
