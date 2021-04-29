package proxyremoteserver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.concurrent.ThreadLocalRandom;

import domein.GumballMachine;


public class ProxyRemoteServer {

	private final String location;
	private final int count;
	private GumballMachine machine;

	public static void main(String[] args) {
		if (args.length < 2) {
			// arguments nodig in ProxyRemoteServer.java> rechtsklik> run as > runconfigurations > arguments > program arguments>  naam, aantal
			System.out.println("Gumball machine <name> <inventory>"); 
			System.exit(1);
		}
		int count = Integer.parseInt(args[1]);
		new ProxyRemoteServer(args[0], count).run();
	}

	public ProxyRemoteServer(String location, int count) {
		this.location = location;
		this.count = count;
		registerRemoteGumballMachine();
		// machine = new GumballMachine(location, count); <-- hulp methode
//		GumballMonitor monitor = new GumballMonitor(machine);<-- verplaatst naar client 
//		monitor.report(); <-- verplaatst naar client 
	}

	private void registerRemoteGumballMachine() {

		try {
			// start server op poort
			Registry registry = LocateRegistry.createRegistry(1099);

			machine = new GumballMachine(location, count);
			// verbinden gumball machine met registry
			registry.rebind("gumballmachine", machine);

		} catch (RemoteException ex) {
			ex.printStackTrace();
		}

	}

	private void run() {
        System.out.println("GumballMachine Operational.");
        System.out.println(machine);
        while (machine.getCount() > 0) {
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(9000) + 1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            getAGumball();
            System.out.println(machine);
        }
    }

    private void getAGumball() {
        System.out.println(machine.insertQuarter());
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(2000) + 500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(machine.turnCrank());
    }

}
