package interview.question.singleton;

public class MysqlConnection {
	private static MysqlConnection connection;
	private  String mysqUrl;
	private  String username;
	private  String password;
	
	private MysqlConnection() {
		
	}
	
	public static synchronized MysqlConnection getInstance() {
		
		if(connection==null) {
			connection= new MysqlConnection();
			return connection;
		}
		return connection;
	}



	public final String getMysqUrl() {
		return mysqUrl;
	}

	public final void setMysqUrl(String mysqUrl) {
		this.mysqUrl = mysqUrl;
	}

	public final String getUsername() {
		return username;
	}

	public final void setUsername(String username) {
		this.username = username;
	}

	public final String getPassword() {
		return password;
	}

	public final void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MysqlConnection [mysqUrl=" + mysqUrl + ", username=" + username + ", password=" + password + "]";
	}
	 
	
}
