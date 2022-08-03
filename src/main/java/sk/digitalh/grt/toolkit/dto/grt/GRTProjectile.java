package sk.digitalh.grt.toolkit.dto.grt;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JacksonXmlRootElement(localName = "GordonsReloadingTool")
public class GRTProjectile {

    @JacksonXmlProperty(localName = "projectilefile")
    private GRTProjectileProjectilefile grtProjectileProjectilefile;

    public GRTProjectile() {
        super();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("grtProjectileProjectilefile", grtProjectileProjectilefile)
                .toString();
    }
}
