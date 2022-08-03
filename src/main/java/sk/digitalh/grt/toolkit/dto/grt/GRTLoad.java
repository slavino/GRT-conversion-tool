package sk.digitalh.grt.toolkit.dto.grt;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.apache.commons.lang3.builder.ToStringStyle;

@JacksonXmlRootElement(localName = "GordonsReloadingTool")
public class GRTLoad {

    @JacksonXmlProperty(isAttribute = true, localName = "version")
    private String version;

    @JacksonXmlProperty(localName = "InnerBallistikInput")
    private GRTLoadInteriorBallisticInput grtLoadInteriorBallisticInput;


    //impl
    public GRTLoad() {
        super();
    }

    public GRTLoad(String version) {
        this();
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("version", version)
                .append("grtLoadInteriorBallisticInput", grtLoadInteriorBallisticInput)
                .toString();
    }
}
