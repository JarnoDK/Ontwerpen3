package domein;

// interface voor de factory
public interface PersistenceFactory {
    abstract Reader createReader();
    abstract Writer createWriter();
}
