package domein;

public interface ChannelIterator {

	// check op volgend element
	boolean hasNext();
	// krijg volgend channel
	Channel next();
}
