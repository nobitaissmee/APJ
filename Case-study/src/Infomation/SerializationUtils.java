package Infomation;

import java.io.*;

public class SerializationUtils {
    private static final String DATA_DIR_PATH = System.getProperty("user.dir") + File.separator + "Personal_Information" + File.separator;

    static {
        File dataFolder = new File(DATA_DIR_PATH);
        if (!dataFolder.exists()) {
            dataFolder.mkdirs();
        }
    }
    /**
     * Serialize the given object and save it to given file
     */

    public static void serialize(Object obj, String fileName) throws IOException {
        File newFile =getToFile(fileName);
        FileOutputStream fos = new FileOutputStream(newFile);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(obj);
        oos.close();
    }

    /**
     * Deserialize to Object from given file
     */
    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
        File newFile =getToFile(fileName);
        if (!newFile.exists()) return null;
        FileInputStream fis = new FileInputStream(newFile);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }

    public static File getToFile(String fileName){
        File fileObject=new File(DATA_DIR_PATH,fileName);
        return fileObject;
    }
}