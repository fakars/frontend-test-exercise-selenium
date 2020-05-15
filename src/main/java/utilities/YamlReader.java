package utilities;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

public class YamlReader {

    public static <T> void setProperties(Class<T> type, String file) {
        try (InputStream input = type.newInstance().getClass().getClassLoader()
                .getResourceAsStream(file)) {
            new Yaml().load(input);
        } catch (IOException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
