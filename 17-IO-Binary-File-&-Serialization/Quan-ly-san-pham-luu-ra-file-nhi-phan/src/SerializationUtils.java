import java.io.*;

public class SerializationUtils {
    private static final String DATA_DIR_PATH = System.getProperty("user.dir") + File.separator + "data" + File.separator;

    static {
        File dataFolder = new File(DATA_DIR_PATH);
        if (!dataFolder.exists()) {
            dataFolder.mkdirs();
        }
    }

    public static void serialize(Object object, String filename) throws IOException {
        FileOutputStream fos = new FileOutputStream(getFileObject(filename));
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(object);
        oos.close();
    }

    public static Object deserialize(String filename) throws IOException, ClassNotFoundException {
        File file = getFileObject(filename);
        if (!file.exists()) return null;
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object object = ois.readObject();
        ois.close();
        return object;
    }

    private static File getFileObject(String filename) {
        return new File(DATA_DIR_PATH + filename);
    }
}
