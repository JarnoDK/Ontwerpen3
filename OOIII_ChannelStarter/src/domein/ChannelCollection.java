package domein;

public interface ChannelCollection {

    public void addChannel(Channel c);

    public void removeChannel(Channel c);

    // toevoegen createIterator aan interface
	ChannelIterator createIterator(ChannelType type);

}
