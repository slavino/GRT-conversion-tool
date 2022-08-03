package sk.digitalh.grt.toolkit.dto.grt;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public abstract class GRTAbstractNote {


    @JacksonXmlProperty(localName = "index", isAttribute = true)
    private Integer index;

    @JacksonXmlProperty(localName = "hasfocus", isAttribute = true)
    private Boolean hasfocus;

    @JacksonXmlProperty(localName = "showinreport", isAttribute = true)
    private Boolean showinreport;

    @JacksonXmlProperty(localName = "reporttemplate", isAttribute = true)
    private Boolean reporttemplate;

    @JacksonXmlProperty(localName = "title", isAttribute = true)
    private String title;

    @JacksonXmlProperty(localName = "text", isAttribute = true)
    private String text;

    @JacksonXmlProperty(localName = "selstart", isAttribute = true)
    private Integer selstart;

    @JacksonXmlProperty(localName = "sellength", isAttribute = true)
    private Integer sellength;

    @JacksonXmlProperty(localName = "scrollposition", isAttribute = true)
    private Integer scrollposition;

    @JacksonXmlProperty(localName = "config", isAttribute = true)
    private String config;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("index", index)
                .append("hasfocus", hasfocus)
                .append("showinreport", showinreport)
                .append("reporttemplate", reporttemplate)
                .append("title", title)
                .append("text", text)
                .append("selstart", selstart)
                .append("sellength", sellength)
                .append("scrollposition", scrollposition)
                .append("config", config)
                .toString();
    }
}
