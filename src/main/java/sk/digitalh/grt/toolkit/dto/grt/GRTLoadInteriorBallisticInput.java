package sk.digitalh.grt.toolkit.dto.grt;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.net.URLDecoder;
import java.nio.charset.Charset;

public class GRTLoadInteriorBallisticInput {

    @JacksonXmlProperty(localName = "title")
    private String title;

    @JacksonXmlProperty(localName = "config")
    private GRTLoadConfig grtLoadConfig;

    @JacksonXmlProperty(localName = "caliber")
    private GRTLoadCaliber grtLoadCaliber;

    @JacksonXmlProperty(localName = "caliberfile")
    private GRTLoadCaliberFile grtLoadCaliberFile;

    @JacksonXmlProperty(localName = "gun")
    private GRTLoadGun grtLoadGun;

    @JacksonXmlProperty(localName = "projectile")
    private GRTLoadProjectile grtLoadProjectile;

    @JacksonXmlProperty(localName = "propellant")
    private GRTLoadPropellant grtLoadPropellant;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "appendix")
    private GRTLoadAppendix grtLoadAppendix;

    public String getURLDecodedTitle() {
        return URLDecoder.decode(title, Charset.forName("UTF-8"));
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("title", getURLDecodedTitle())
                .append("grtLoadConfig", grtLoadConfig)
                .append("grtLoadCaliber", grtLoadCaliber)
                .append("grtLoadCaliberFile", grtLoadCaliberFile)
                .append("grtLoadGun", grtLoadGun)
                .append("grtLoadProjectile", grtLoadProjectile)
                .append("grtLoadPropellant", grtLoadPropellant)
                .append("grtLoadAppendix", grtLoadAppendix)
                .toString();
    }

}
