import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class Main {

    public static void unzipFile(String source, String destination) {
        try {
            ZipFile zipFile = new ZipFile(source);
            //if (zipFile.isEncrypted()) {
            //    zipFile.setPassword(password);
            //}
            zipFile.extractAll(destination);
        } catch (ZipException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // unzip a file
        String source = "C:\\Users\\ncooke\\Downloads\\zip\\zip4j-master.zip";
        String destination = "C:\\Users\\ncooke\\Downloads\\zip";
        unzipFile(source, destination);
    }

}
