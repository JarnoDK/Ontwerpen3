package domein;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import exception.InformationRequiredException;


public class Appointment {

	private final LocalDateTime startDate;
	private final LocalDateTime endDate;
	private final String description;
	private Set<Contact> attendees = new HashSet<>();
	private final Location location;

	// weghalen setters, werken met builders
	// PRIVATE constructor (enkel builder kan eraan)
	// instantiëren van variabelen op basis van meegegeven builder
	private Appointment(Builder builder) {
		
		startDate = builder.startDate;
		endDate = builder.endDate;
		description = builder.description;
		this.attendees = new HashSet<Contact>(builder.attendees);
		location = builder.location;

	}
	
	public void addAttendee(Contact attendee) {
		attendees.add(attendee);
	}

	public void removeAttendee(Contact attendee) {
		attendees.remove(attendee);
	}

	@Override
	public String toString() {
		return String.format("  Description: %s%n Start Date: %s%n End Date: %s%nLocation: %s%n Attendees: %s%n",
				description, startDate != null ? startDate : "", endDate != null ? endDate : "", location, attendees);
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public String getDescription() {
		return description;
	}

	public Set<Contact> getAttendees() {
		return Collections.unmodifiableSet(attendees);
	}

	public Location getLocation() {
		return location;
	}
//
//	public void setDescription(String newDescription) {
//		description = newDescription;
//	}
//
//	public void setLocation(Location newLocation) {
//		location = newLocation;
//	}
//
//	public void setStartDate(LocalDateTime newStartDate) {
//		startDate = newStartDate;
//	}
//
//	public void setEndDate(LocalDateTime newEndDate) {
//		endDate = newEndDate;
//	}
//
//	public void setAttendees(List<Contact> newAttendees) {
//		if (newAttendees != null) {
//			for (Contact contact : newAttendees) {
//				attendees.add(contact);
//			}
//		}
//	}
	
	public static class Builder{

	// Lijst met public variabelen
	public Location location;
	public List<Contact> attendees = new ArrayList<Contact>();
	public String description;
	public LocalDateTime endDate;
	public LocalDateTime startDate;
	protected Set<RequiredElement> requiredElements;
	
	
	// definieer variabele en retourneer hele builder
	public Builder startDate(LocalDateTime start) {
		this.startDate = start;
		
		return this;
	}
	// definieer variabele en retourneer hele builder

	public Builder endDate(LocalDateTime end) {
		this.endDate = end;
		
		return this;
	}
	// definieer variabele en retourneer hele builder

	public Builder location(Location loc) {
		this.location= loc;
		
		return this;
	}
	// definieer variabele en retourneer hele builder

	public Builder description(String description) {
		this.description= description;
		
		return this;
	}
	// definieer variabele en retourneer hele builder

	public Builder attendees(List<Contact> contacten) {
		if(attendees != null) {
			this.attendees = contacten;
		}
		
		return this;
	}
	
	// controleren requirements en retourneren nieuwe appointment op basis van zichzelf

	public Appointment build() throws InformationRequiredException {
		requiredElements = new HashSet<RequiredElement>();
		if(startDate != null && startDate.isBefore(LocalDateTime.now())) {
			startDate = null;
		}
		
		if(startDate != null && endDate != null && endDate.isBefore(startDate) || startDate == null) {
			endDate = null;
		}
		
		Appointment appointment = new Appointment(this);
		if(appointment.getStartDate() == null) {
			requiredElements.add(RequiredElement.StartDateRequired);
		}

		if(appointment.getLocation() == null) {
			requiredElements.add(RequiredElement.LocationRequired);
		}

		if(appointment.getAttendees().isEmpty()) {
			requiredElements.add(RequiredElement.AttendeeRequired);
		}
		if(!requiredElements.isEmpty()) {
			throw new InformationRequiredException(requiredElements);
		}
		return appointment;
	}
	}
	
	// extensie op builder voor meer requirements
	public static class MeetingBuilder extends Builder {

		private Appointment appointment;
		public Appointment getAppointment() throws InformationRequiredException {
			
			
			try {
				appointment = super.build();	
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
}