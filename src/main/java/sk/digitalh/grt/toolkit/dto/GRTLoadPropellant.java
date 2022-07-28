package sk.digitalh.grt.toolkit.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

public class GRTLoadPropellant {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "input")
    private List<GRTLoadPropellantInput> grtLoadPropellantInputs;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("grtLoadPropellantInputs", grtLoadPropellantInputs)
                .toString();
    }
}
