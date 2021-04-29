package agendaStarter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import domein.Appointment;
import domein.Contact;
import domein.Location;
import exception.InformationRequiredException;

public class TestDrive {

    private final static Contact contactData[] = {
        new Contact("Van Schoor", "Johan", "Lector", "Hogeschool Gent"),
        new Contact("Samyn", "Stefaan", "Lector", "Hogeschool Gent"),
        new Contact("Malfait", "Irina", "Lector", "Hogeschool Gent"),
        new Contact("De Donder", "Margot", "Lector", "Hogeschool Gent"),
        new Contact("Decorte", "Johan", "Lector", "Hogeschool Gent"),
        new Contact("Samyn", "Karine", "Lector", "Hogeschool Gent")
    };
    private Appointment appt;

    public static void main(String[] args) {
        new TestDrive().run();
    }
    
    private List<Contact> createAttendees(int numberToCreate) {
        List<Contact> group = new ArrayList<>();
        for (int i = 0; i < numberToCreate; i++) {
            group.add(getContact(i));
        }
        return group;
    }

    private Contact getContact(int index) {
        return contactData[index % contactData.length];
    }
    
    private void run() {

        System.out.println("Creating an Appointment ");
        //TODO maak gewone afspraak zonder fout:
        //
//        Start datum = LocalDateTime.of(2021, 7, 22, 12, 30)
//        Locatie = new Location("Hogeschool Gent, D2.014")
//        Beschrijving = "Project Demo"
//        uitgenodigden = createAttendees(4)
        
        try {

        	appt = new Appointment.Builder() // in klasse appointment, roep de inner klasse builder aan met de jusite methode
        			.startDate(LocalDateTime.of(2021, 7, 22, 12, 30))
        			.description("Project Demo")
        			.attendees(createAttendees(4))
        			.location(new Location("Hogeschool Gent, D2.014"))
        			.build(); // om terug een appointment te verkrijgen
        	

            
        //Afdruk resultaat
            System.out.println("Successfully created an Appointment.");
            System.out.println("Appointment information:");
            System.out.println(appt);
            System.out.println();
        //vervolg...(als fouten)
       
        }catch (InformationRequiredException ex) {
			printExceptions(ex);
		}

        System.out.println("Creating a meeting : enddate is missing");
        //TODO maak een meeting met fout:
        //
        //Start datum = LocalDateTime.of(2021, 3, 21, 12, 30)
        //Locatie = new Location("Hogeschool Gent, B3.020")
        //Beschrijving = "OOO III"
        //uitgenodigden = createAttendees(4)
        
        try {

        	appt = new Appointment.MeetingBuilder() // inner klasse meetingbuilder in klasse appointment 
        			.location(new Location("Hogeschool Gent, B3.020"))
        			.attendees(createAttendees(4))
        			.description("OOO III")
        			.startDate(LocalDateTime.of(2021, 3, 21, 12, 30))
        			.build(); // verkrijgen appointment

           
                    
            
       //Afdruk resultaat (zal falen)
            System.out.println("Successfully created an Appointment.");
            System.out.println("Appointment information:");
            System.out.println(appt);
            System.out.println();
       //vervolg... (als fouten)
        }catch(InformationRequiredException ex) {
        	printExceptions(ex);
        }
       

        
        System.out.println("Meeting : all items are provided");
        //TODO maak een meeting zonder fout:
        //
        //Start datum =LocalDateTime.of(2021, 4, 1, 10, 00)
        //Eind datum = LocalDateTime.of(2021, 4, 1, 11, 30),
        //Locatie = new Location("Hogeschool Gent, B1.032")
        //Beschrijving = "Project II Meeting"
        //uitgenodigden = createAttendees(2)

        
            try {

            	appt = new Appointment.MeetingBuilder()
            			.attendees(createAttendees(2))
            			.startDate(LocalDateTime.of(2021, 4, 1, 10, 00))
            			.endDate(LocalDateTime.of(2021, 4, 1, 11, 30))
            			.location(new Location("Hogeschool Gent, B1.032"))
            			.description("Project II Meeting")
            			.build();

           
                
                    
            
        //Afdruk resultaat
            System.out.println("Successfully created an Appointment.");
            System.out.println("Appointment information:");
            System.out.println(appt);
            System.out.println();
        //vervolg...(als fouten)
       
            }catch(InformationRequiredException ex) {
            	printExceptions(ex);
            }
        
        //
    }

        

    public void printExceptions(InformationRequiredException ex) {
    	
    	System.out.println(ex.getMessage());
    	ex.getInformationRequired().forEach(System.out::println);
    }
        


}