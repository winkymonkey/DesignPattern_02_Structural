package facade;


public class MyClient {
	public static void main(String[] args) {
		ServerFacade facade = new ServerFacade(new Server());
		facade.startServer();
		facade.stopServer();
	}
}

