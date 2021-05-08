package domein;

public class XMLWriter implements Writer {
    @Override
    public void writeDrawing(String filePath, Drawing drawing) {
        System.out.println("Writing drawing in XML format to " + filePath);
    }
}
