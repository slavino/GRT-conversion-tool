package sk.digitalh.grt.toolkit.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import sk.digitalh.grt.toolkit.GRTLoadCaliberFileVar;

import java.util.List;

public class GRTLoadGunLeakageGroupLeakage {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "var")
    List<GRTLoadGunLeakageGroupLeakageVar> grtLoadGunLeakageGroupLeakageVars;

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("grtLoadGunLeakageGroupLeakageVars", grtLoadGunLeakageGroupLeakageVars)
                .toString();
    }

}
