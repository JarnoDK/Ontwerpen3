package domein;

import exception.InformationRequiredException;

// toevoegen van extra restricties aan een appointment 
// retourneert appointment door deze eerst op te vragen, dan aan te passen en dan terug te geven
public class MeetingBuilder extends AppointmentBuilder {

	public Appointment getAppointment() throws InformationRequiredException {
		
		
		try {
			super.getAppointment();	
		}finally {
			if(appointment.getEndDate() == null) {
				requiredElements.add(RequiredElement.EndDateRequired);
			}
			if(!requiredElements.isEmpty()) {
				throw new InformationRequiredException(requiredElements);
			}
		}
		
		return appointment;
		
	}
}
