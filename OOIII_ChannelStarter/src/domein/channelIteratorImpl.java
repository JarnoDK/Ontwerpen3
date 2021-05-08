package domein;

import java.util.List;

public class channelIteratorImpl implements ChannelIterator {
	
	private int positie;
	private ChannelType type;
	private List<Channel> channellist;
	
	// constructor voor het instantiëren van variabelen (positie moet 0 zijn)
	public channelIteratorImpl(ChannelType type, List<Channel> channelList) {
		this.type = type;
		this.channellist = channelList;
		positie = 0;
	}
	
	// controleer of er een volgend element is
	public boolean hasNext() {

		int temppositie = positie;
		while(temppositie < channellist.size()) {
			if(isNextChannel(temppositie)) {
				return true;
			}
			temppositie ++;

		}
		return false;
	}

	// verkrijg het volgende element
	public Channel next() {

		while(!isNextChannel(positie)) {
			positie++;
		}
		Channel channel = channellist.get(positie);
		positie++;

		return channel;
	}
	
	// controleert of het type overeenkomt met een channel type of met type ALL 
	private boolean isNextChannel(int positie) {
		
		Channel channel = channellist.get(positie);
		if(channel.getTYPE() == type || type == ChannelType.ALL ) {
			return true;
		}
		return false;
	}




}
