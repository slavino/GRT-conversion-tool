package sk.digitalh.grt.toolkit.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.net.URLDecoder;
import java.nio.charset.Charset;

public class GRTLoadPropellantInput {

    @JacksonXmlProperty(localName = "name", isAttribute = true)
    private String name;

    @JacksonXmlProperty(localName = "unit", isAttribute = true)
    private String unit;

    @JacksonXmlProperty(localName = "type", isAttribute = true)
    private String type;

    @JacksonXmlProperty(localName = "descr", isAttribute = true)
    private String descr;

    @JacksonXmlProperty(localName = "value", isAttribute = true)
    private String value;

    public String getURLDecodedValue() {
        return URLDecoder.decode(value, Charset.forName("UTF-8"));
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("name", name)
                .append("unit", unit)
                .append("type", type)
                .append("descr", descr)
                .append("value", getURLDecodedValue())
                .toString();
    }

}
