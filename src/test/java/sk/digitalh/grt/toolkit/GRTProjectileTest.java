package sk.digitalh.grt.toolkit;

import com.ctc.wstx.api.WstxInputProperties;
import com.ctc.wstx.stax.WstxInputFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import sk.digitalh.grt.toolkit.dto.grt.GRTProjectile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GRTProjectileTest {


    private static final Logger LOGGER = LogManager.getLogger(GRTLoadTest.class.getName());

    public static class InputFactory extends WstxInputFactory {
        public InputFactory() {
            super();
            setProperty(WstxInputProperties.P_MAX_ATTRIBUTE_SIZE, Integer.MAX_VALUE);
        }
    }

    private GRTProjectileTest() {
        System.getProperties().put("javax.xml.stream.XMLInputFactory", GRTLoadTest.InputFactory.class.getName());
    }

    private String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }

    @Test
    void testWriteAndExistence() {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {
            xmlMapper.writeValue(new File("target/simple_grt_projectile.projectile"),
                    new GRTProjectile());
        } catch (IOException e) {
            LOGGER.error(e);
            throw new RuntimeException(e);
        }
        File file = new File("target/simple_grt_projectile.projectile");
        assertNotNull(file);
    }

    @Test
    void testAllResourceFilesForRead() {

        List<File> filesInFolder = null;

        try {
            filesInFolder = Files.walk(Paths.get("target/test-classes/grt/projectile/"))
                    .filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().endsWith(".projectile"))
                    .map(Path::toFile)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            LOGGER.error(e);
            throw new RuntimeException(e);
        }

        for (File file : filesInFolder) {
            LOGGER.debug(file.getName());
            XmlMapper xmlMapper = new XmlMapper();
            String xml = null;
            try {
                xml = inputStreamToString(new FileInputStream(file));
            } catch (IOException e) {
                LOGGER.error(e);
                throw new RuntimeException(e);
            }

            // *.grtload files
            GRTProjectile grtProjectile = null;

            try {
                grtProjectile = xmlMapper.readValue(xml, GRTProjectile.class);
                assertNotNull(grtProjectile);
            } catch (JsonProcessingException e) {
                LOGGER.error(e);
                throw new RuntimeException(e);
            }

            LOGGER.debug(grtProjectile.toString());
        }
    }

}
