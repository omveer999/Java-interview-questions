package interview.question.singleton;

public class SingletonClassDemo {

	public  static void main(String[] args) {
		MysqlConnection connection=MysqlConnection.getInstance();
		connection.setMysqUrl("jdbc:mysql://localhost:3306/mydatabase");
		connection.setPassword("admin@123");
		connection.setUsername("root");
		
		MysqlConnection connection2=MysqlConnection.getInstance();
		System.out.println(connection);
		System.out.println(connection2);
		
		if(connection==connection2) {
			System.out.println("both referenced to same instance");
		}
	}
	
}
