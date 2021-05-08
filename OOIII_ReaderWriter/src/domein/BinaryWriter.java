package domein;

public class BinaryWriter implements Writer {
    @Override
    public void writeDrawing(String filePath, Drawing drawing) {
        System.out.println("Writing drawing in binary format to " + filePath);
    }
}
