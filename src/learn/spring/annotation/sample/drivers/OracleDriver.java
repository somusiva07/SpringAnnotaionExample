package learn.spring.annotation.sample.drivers;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component
//@PropertySource("classpath:oracledb.properties")
public class OracleDriver implements DatabaseDriver {

	private String connectionName;
	
	private String userName;
	
	private String password;
	
	private String hostName;
	
	private int port;
	
	private String serviceNameOrSID;
	
	public String getConnectionName() {
		return connectionName;
	}

	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getServiceNameOrSID() {
		return serviceNameOrSID;
	}

	public void setServiceNameOrSID(String serviceNameOrSID) {
		this.serviceNameOrSID = serviceNameOrSID;
	}

	@Override
	public String getDriverInfo() {
		// TODO Auto-generated method stub
		return "[Oracle : Connection : " + connectionName +
				" User Name : " + userName +
				" Host Name : " + hostName +
				" port : " + port +
				" serviceNameOrSID : "+serviceNameOrSID
				+ "]";
	}

}
