package sk.digitalh.grt.toolkit;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.net.URLDecoder;
import java.nio.charset.Charset;

public class GRTLoadCaliberFileVar {

    @JacksonXmlProperty(localName = "name", isAttribute = true)
    private String name;

    @JacksonXmlProperty(localName = "value", isAttribute = true)
    private String value;

    public String getURLDecodedValue() {
        return URLDecoder.decode(value, Charset.forName("UTF-8"));
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("name", name)
                .append("value", getURLDecodedValue())
                .toString();
    }
}
