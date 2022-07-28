package sk.digitalh.grt.toolkit.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

public class GRTLoadGun {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "input")
    private List<GRTLoadGunInput> grtLoadGunInputs;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "leakagegroup")
    private List<GRTLoadGunLeakageGroup> grtLoadGunLeakageGroups;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("grtLoadGunInputs", grtLoadGunInputs)
                .append("grtLoadGunLeakageGroups", grtLoadGunLeakageGroups)
                .toString();
    }
}
