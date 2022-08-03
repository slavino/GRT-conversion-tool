package sk.digitalh.grt.toolkit.dto.grt;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JacksonXmlRootElement(localName = "GordonsReloadingTool")
public class GRTCaliber {

    @JacksonXmlProperty(localName = "caliberfile")
    private GRTCaliberCaliberfile grtCaliberCaliberfile;

    public GRTCaliber() {
        super();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("grtProjectileProjectilefile", grtCaliberCaliberfile)
                .toString();
    }
}
