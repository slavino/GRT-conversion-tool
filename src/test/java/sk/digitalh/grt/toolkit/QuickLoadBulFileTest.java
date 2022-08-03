package sk.digitalh.grt.toolkit;

import org.apache.commons.csv.CSVRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import sk.digitalh.grt.toolkit.dto.ql.QLBulFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class QuickLoadBulFileTest {

    private static final Logger LOGGER = LogManager.getLogger(QuickLoadBulFileTest.class.getName());


    // http://ini4j.sourceforge.net/tutorial/IniTutorial.java.html
    @Test
    void testAllResourceFilesForRead() {

        List<File> filesInFolder = null;

        try {
            filesInFolder = Files.walk(Paths.get("target/test-classes/quickload/bul/"))
                    .filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().endsWith(".bul"))
                    .map(Path::toFile)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            LOGGER.error(e);
            throw new RuntimeException(e);
        }

        for (File file : filesInFolder) {
            LOGGER.debug(file.getName());
            Iterable<CSVRecord> records = null;
            try {
                records = QLBulFile.CSV_FORMAT
                        .parse(new FileReader(file));

                for (CSVRecord record : records) {
                    QLBulFile bulFile = new QLBulFile(file.getName(), record);
                    LOGGER.debug(bulFile);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
