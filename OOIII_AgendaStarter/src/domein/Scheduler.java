package domein;

import java.time.LocalDateTime;
import java.util.List;

import exception.InformationRequiredException;
import java.time.*;
import java.util.*;

/**
 * maken van appointment door middel van een builder.
 * 
 * 
 * @author jarno
 *
 */
public class Scheduler {

	public Appointment createAppointment( AppointmentBuilder builder, LocalDateTime startDate, LocalDateTime endDate, String description, List<Contact> attendees, Location location) throws InformationRequiredException {
		
		if(builder == null) {
			builder = new AppointmentBuilder();
		}
		
		builder.createAppointment();
		builder.buildAttendees(attendees);
		builder.buildDates(startDate, endDate);
		builder.buildDescription(description);
		builder.buildLocation(location);
		return builder.getAppointment();

		
	}

}
