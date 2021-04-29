package domein;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import exception.InformationRequiredException;
import java.util.*;
import java.time.*;

//builder voor appointment dat bepaalde zaken verplicht
public class AppointmentBuilder {
	
	// bevat appointment om aan te passen
	protected Appointment appointment;
	protected Set<RequiredElement> requiredElements;
	
	
	// maakt nieuwe appointment
	public void createAppointment() {
		appointment = new Appointment();
	}

	// instantieert variabele
	public void buildDescription(String description) {
		appointment.setDescription(description);
	}
	// instantieert variabele
	public void buildLocation(Location location) {
		appointment.setLocation(location);
	}

	// instantieert variabele
	public void buildAttendees(List<Contact> attendees) {
		appointment.setAttendees(attendees);
	}

	// instantieert variabele en controleert geldige datums (niet in verleden en niet leeg)
	public void buildDates(LocalDateTime startDate, LocalDateTime endDate) {
		if(startDate !=null && startDate.isAfter(LocalDateTime.now()) ) {
			appointment.setStartDate(startDate);

		}

		if (endDate !=null && endDate.isAfter(startDate)) {
			appointment.setEndDate(endDate);
		}
	}

	// controleert of appointment alle requirements bevat 
	public Appointment getAppointment() throws InformationRequiredException {
		requiredElements = new HashSet<RequiredElement>();
		// indien startdate = null , toevoegen requirement aan lijst requirements
		if(appointment.getStartDate() == null) {
			requiredElements.add(RequiredElement.StartDateRequired);
		}
		// indien location = null , toevoegen requirement aan lijst requirements

		if(appointment.getLocation() == null) {
			requiredElements.add(RequiredElement.LocationRequired);
		}
		// indien attendees = null , toevoegen requirement aan lijst requirements

		if(appointment.getAttendees().isEmpty()) {
			requiredElements.add(RequiredElement.AttendeeRequired);
		}
		// indien requirements niet leeg is, gooi exception

		if(!requiredElements.isEmpty()) {
			throw new InformationRequiredException(requiredElements);
		}
		
		
		return this.appointment;
	}
}
