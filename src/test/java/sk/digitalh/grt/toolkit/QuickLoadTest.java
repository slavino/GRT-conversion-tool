package sk.digitalh.grt.toolkit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ini4j.Ini;
import org.ini4j.Profile;
import org.junit.jupiter.api.Test;
import sk.digitalh.grt.toolkit.dto.ql.QLDatFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class QuickLoadTest {

    private static final Logger LOGGER = LogManager.getLogger(QuickLoadTest.class.getName());


    // http://ini4j.sourceforge.net/tutorial/IniTutorial.java.html
    @Test
    void testAllResourceFilesForRead() {

        List<File> filesInFolder = null;

        try {
            filesInFolder = Files.walk(Paths.get("target/test-classes/"))
                    .filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().endsWith(".dat"))
                    .map(Path::toFile)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            LOGGER.error(e);
            throw new RuntimeException(e);
        }

        for (File file : filesInFolder) {
            LOGGER.debug(file.getName());
            Ini quickloadAmmoFile = new Ini();
            try {
                quickloadAmmoFile.load(file);

                QLDatFile qlDatFile = new QLDatFile(quickloadAmmoFile);
                LOGGER.debug(qlDatFile);

            } catch (IOException ioEx) {
                LOGGER.error(ioEx);
                throw new RuntimeException(ioEx);
            }
        }
    }
}
