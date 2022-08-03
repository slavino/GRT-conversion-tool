package sk.digitalh.grt.toolkit.dto.grt;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public abstract class GRTAbstractInput {

    @JacksonXmlProperty(localName = "name", isAttribute = true)
    private String name;

    @JacksonXmlProperty(localName = "unit", isAttribute = true)
    private String unit;

    @JacksonXmlProperty(localName = "type", isAttribute = true)
    private String type;

    @JacksonXmlProperty(localName = "descr", isAttribute = true)
    private String descr;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("name", name)
                .append("unit", unit)
                .append("type", type)
                .append("descr", descr)
                .toString();
    }

}
