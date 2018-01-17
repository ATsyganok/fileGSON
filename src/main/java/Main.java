import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "./config.txt";
        File file = new File(filename);
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader(file));
        Config config = gson.fromJson(reader, Config.class);
        System.out.println(config.toString());

        config.param1 = "value6";
        config.param2 = true;

        System.out.println(config.toString());

        FileWriter fw = new FileWriter(file);

            fw.write(gson.toJson(config));
            fw.flush();

    }
}


