package domein;

public class File extends AbstractFile {

    private int kbytes;

    public File(String name, int kbytes) {
        super(name);
        setKBytes(kbytes);
    }
    // print file
    public void print(int level) {
        String indent = "";
        // per level voeg een tab toe
        for (int i = 0; i < level; i++) {
            indent += "\t";
        }
        // print name + grootte
        System.out.println(indent + getName() + " (" + getKBytes() + " kb)");
    }

    public int getKBytes() {
        return kbytes;
    }

    private void setKBytes(int bytes) {
        this.kbytes = bytes;
    }
}
