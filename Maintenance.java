
public class Maintenance implements Runnable {

	String status;
	int countOfClients = 1000;
	int numOfClients;
	int totalNumOfClients;
	
	public Maintenance(String status, int numOfPatients) {
		this.status = status;
		this.numOfClients = numOfPatients;
	}

	@Override
	public void run() {
		try {
			String info;
			for(int i = 0; i <= this.numOfClients; i++) {
				info = this.status + " Client { ID: " + i + ", Name: Client #" + i + "}";
				System.out.println(info);
			}
		}
		catch(Exception e) {
			System.out.println("ERROR");
		}
	}
}
