package domein;

// implement iterator 
public class ChannelSurfer implements Iterator {
	
	// max channel en current channel creatie
	private final int maxChannel;
	private int currentChannel;
	
	// instantieer de methode next channel dat current channel omhoog doet. 
	// neemt modulo indien current channel groter dan max channel
	@Override
	public Channel nextChannel() {
		currentChannel = (currentChannel +1)% maxChannel;
		return new Channel(currentChannel);
	}

	// instantieer de methode next channel dat current channel omlaag doet. 
	// neemt modulo indien current channel kleiner dan 0
	@Override
	public Channel previousChannel() {
		currentChannel = (currentChannel-1 + maxChannel)%maxChannel;
		return new Channel(currentChannel);
	}
	
	// constructor om max channel te bepalen
	public ChannelSurfer(int max) {
		maxChannel = max;
	
	}

	
}
