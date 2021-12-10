package learn.spring.annotation.sample.drivers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:/learn/spring/annotation/sample/postgredb.properties")
public class PostgreDriver implements DatabaseDriver {

	/*
	 * @Value("${db.connectionName}") private String connectionName;
	 * 
	 * @Value("${db.user}") private String userName;
	 * 
	 * @Value("${db.password}") private String password;
	 * 
	 * @Value("${db.host}") private String hostName;
	 * 
	 * @Value("${db.port}") private int port;
	 * 
	 * @Value("${db.service}") private String serviceNameOrSID;
	 * 
	 * public String getConnectionName() { return connectionName; }
	 * 
	 * public void setConnectionName(String connectionName) { this.connectionName =
	 * connectionName; }
	 * 
	 * public String getUserName() { return userName; }
	 * 
	 * public void setUserName(String userName) { this.userName = userName; }
	 * 
	 * public String getPassword() { return password; }
	 * 
	 * public void setPassword(String password) { this.password = password; }
	 * 
	 * public String getHostName() { return hostName; }
	 * 
	 * public void setHostName(String hostName) { this.hostName = hostName; }
	 * 
	 * public int getPort() { return port; }
	 * 
	 * public void setPort(int port) { this.port = port; }
	 * 
	 * public String getServiceNameOrSID() { return serviceNameOrSID; }
	 * 
	 * public void setServiceNameOrSID(String serviceNameOrSID) {
	 * this.serviceNameOrSID = serviceNameOrSID; }
	 * 
	 * @Override public String getDriverInfo() { // TODO Auto-generated method stub
	 * return "[Postgre : Connection : " + connectionName + " User Name : " +
	 * userName + " Host Name : " + hostName + " port : " + port +
	 * " serviceNameOrSID : "+serviceNameOrSID + "]"; }
	 */

	
	@Value("${databaseName}")
    private String databaseName;
    @Value("${disableStatementPooling}")
    private String disableStatementPooling;



    public String getDriverInfo() {
        return "[ Driver: Postgre" +
                ", databaseName: " + databaseName +
                ", disableStatementPooling: " + disableStatementPooling +
                " ]";
    }
}
