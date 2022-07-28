package sk.digitalh.grt.toolkit.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GRTLoadAppendixMeasurementChargeShot {

    /* <shot name="" velocity="844.60080000000607" pressure="0" />
     */

    @JacksonXmlProperty(localName = "name", isAttribute = true)
    private String name;

    @JacksonXmlProperty(localName = "velocity", isAttribute = true)
    private Double velocity;

    @JacksonXmlProperty(localName = "pressure", isAttribute = true)
    private Double pressure;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("name", name)
                .append("velocity", velocity)
                .append("pressure", pressure)
                .toString();
    }
}
