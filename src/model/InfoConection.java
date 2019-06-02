package model;

public class InfoConection {
	
	public InfoConection(
	String driver,
	String host,
	String user,
	String pass,
	String database) {
		setDriver(driver);
		setHost(host);
		setUser(user);
		setPass(pass);
		setDatabase(database);
	}
	
	public InfoConection(){}

	private String driver;
	private String host;
	private String user;
	private String pass;
	private String database;

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
