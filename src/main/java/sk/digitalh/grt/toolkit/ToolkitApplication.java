package sk.digitalh.grt.toolkit;

import com.ctc.wstx.api.WstxInputProperties;
import com.ctc.wstx.stax.WstxInputFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToolkitApplication {

	// Hack to fix FCPX XML LUT problems with massive attribute data
	public static class InputFactory extends WstxInputFactory {
		public InputFactory() {
			super();
			setProperty(WstxInputProperties.P_MAX_ATTRIBUTE_SIZE, Integer.MAX_VALUE);
		}
	}

	public static void main(String[] args) {
		System.getProperties().put("javax.xml.stream.XMLInputFactory", InputFactory.class.getName());
		SpringApplication.run(ToolkitApplication.class, args);
	}

}
