package edu.pitt.apollo.apolloversionmigration;

import edu.pitt.apollo.apolloversionmigration.output.EpidemicSetter;
import edu.pitt.apollo.types.v3_1_0.Epidemic;
import edu.pitt.apollo.utilities.JsonDeserializer;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by mas400 on 11/30/16.
 */
public class EpidemicDeserializer {
    public static void main(String[] args) {
        try {
            String jsonEpidemic = readFile("/Users/mas400/Downloads/testEpidemic.json", StandardCharsets.UTF_8);
            Epidemic oldEpidemic = new JsonDeserializer().getObjectFromMessage(jsonEpidemic, edu.pitt.apollo.types.v3_1_0.Epidemic.class);
            EpidemicSetter setter = new EpidemicSetter(edu.pitt.apollo.types.v4_0.Epidemic.class, oldEpidemic);
            setter.set();
            edu.pitt.apollo.types.v4_0.Epidemic newEpidemic = setter.getNewTypeInstance();
            System.out.print(newEpidemic.getCurator());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}
