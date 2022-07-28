package sk.digitalh.grt.toolkit.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

public class GRTLoadAppendixMeasurement {

    @JacksonXmlProperty(localName = "index", isAttribute = true)
    private Integer index;

    @JacksonXmlProperty(localName = "showinreport", isAttribute = true)
    private Boolean showinreport;

    @JacksonXmlProperty(localName = "title", isAttribute = true)
    private String title;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "charge")
    private List<GRTLoadAppendixMeasurementCharge> grtLoadAppendixMeasurementCharges;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("index", index)
                .append("showinreport", showinreport)
                .append("title", title)
                .append("charge", grtLoadAppendixMeasurementCharges)
                .toString();
    }
}
