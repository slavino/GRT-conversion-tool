package sk.digitalh.grt.toolkit.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class GRTLoadGunLeakageGroup {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "leakage")
    private List<GRTLoadGunLeakageGroupLeakage> grtLoadGunLeakageGroupLeakages;

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("grtLoadGunLeakageGroups", grtLoadGunLeakageGroupLeakages)
                .toString();
    }
}
