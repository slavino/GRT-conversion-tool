package sk.digitalh.grt.toolkit.dto.grt;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GRTLoadAppendixGalleryPicture {

    @JacksonXmlProperty(localName = "name", isAttribute = true)
    private String name;

    @JacksonXmlProperty(localName = "type", isAttribute = true)
    private String type;

    @JacksonXmlProperty(localName = "width", isAttribute = true)
    private Integer width;

    @JacksonXmlProperty(localName = "height", isAttribute = true)
    private Integer height;

    @JacksonXmlProperty(localName = "data", isAttribute = true)
    private String data;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("name", name)
                .append("type", type)
                .append("width", width)
                .append("height", height)
                .append("data", "BINARY: "+ data.length())
                .toString();
    }
}
