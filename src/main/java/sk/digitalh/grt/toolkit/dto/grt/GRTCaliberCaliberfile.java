package sk.digitalh.grt.toolkit.dto.grt;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

public class GRTCaliberCaliberfile {


    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "var")
    List<GRTCaliberCaliberfileVar> grtCaliberCaliberfileVars;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("grtCaliberCaliberfileVars", grtCaliberCaliberfileVars)
                .toString();
    }

}
