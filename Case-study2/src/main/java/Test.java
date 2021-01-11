import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Student student = new Student();
            Object obj = parser.parse(new FileReader("Studen.json"));

            // A JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
            JSONArray jsonArray = (JSONArray) obj;
            Iterator<JSONObject> iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject jsonObject = iterator.next();
                student.setFullName((String) jsonObject.get("FullName"));
                Long a = (Long) jsonObject.get("Id");
                student.setId(Integer.parseInt(a.toString()));
                student.setDayOfBirth((String) jsonObject.get("DayOfBirth"));
                student.setGender((String) jsonObject.get("Gender"));


                // A JSON array. JSONObject supports java.util.List interface.
                JSONArray companyList = (JSONArray) jsonObject.get("Point:");

                // An iterator over a collection. Iterator takes the place of Enumeration in the Java Collections Framework.
                // Iterators differ from enumerations in two ways:
                // 1. Iterators allow the caller to remove elements from the underlying collection during the iteration with well-defined semantics.
                // 2. Method names have been improved.
                Iterator<JSONObject> iterator2 = companyList.iterator();
                while (iterator2.hasNext()) {
                    System.out.println(iterator2.next());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
