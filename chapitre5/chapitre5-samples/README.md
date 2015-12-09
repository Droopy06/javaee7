http://activemq.apache.org/integrating-apache-activemq-with-glassfish.html

> sudo /usr/local/glassfish4/bin/asadmin deploy --type rar --name activemq-rar activemq-rar-5.12.1.rar
> sudo /usr/local/glassfish4/bin/asadmin create-resource-adapter-config --property ServerUrl='failover\:(tcp\://localhost\:61616)' activemq-rar
> sudo /usr/local/glassfish4/bin/asadmin create-connector-connection-pool --raname activemq-rar --connectiondefinition javax.jms.ConnectionFactory --ping true --isconnectvalidatereq true jms/myConnectionPool
> sudo /usr/local/glassfish4/bin/asadmin create-connector-resource --poolname jms/myConnectionPool jms/myConnectionFactory
> sudo /usr/local/glassfish4/bin/asadmin create-admin-object --raname activemq-rar --restype javax.jms.Queue --property PhysicalName=MY.MAGIC.OUT jms/queue/MY.MAGIC.OUT
