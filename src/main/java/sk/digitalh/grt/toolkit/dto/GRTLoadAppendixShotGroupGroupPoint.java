package sk.digitalh.grt.toolkit.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GRTLoadAppendixShotGroupGroupPoint {
    /*
    * <point x="0.478181818181818" y="0.455" flyer="false" score="" foreColor="#000000" PointOfAim="true" caption="" />
                <point x="0.528125" y="0.41625" flyer="false" score="" foreColor="#000000" caption="" />
                <point x="0.511041666666667" y="0.454375" flyer="false" score="" foreColor="#000000" caption="" />
                <point x="0.507083333333333" y="0.47828125" flyer="false" score="" foreColor="#000000" caption="" />
    */
    @JacksonXmlProperty(localName = "x", isAttribute = true)
    private Double x;

    @JacksonXmlProperty(localName = "y", isAttribute = true)
    private Double y;

    @JacksonXmlProperty(localName = "flyer", isAttribute = true)
    private Boolean flyer;

    @JacksonXmlProperty(localName = "score", isAttribute = true)
    private String score;

    @JacksonXmlProperty(localName = "PointOfAim", isAttribute = true)
    private Boolean PointOfAim;

    @JacksonXmlProperty(localName = "foreColor", isAttribute = true)
    private String foreColor;

    @JacksonXmlProperty(localName = "caption", isAttribute = true)
    private String caption;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("x", x)
                .append("y", y)
                .append("flyer", flyer)
                .append("score", score)
                .append("PointOfAim", PointOfAim)
                .append("foreColor", foreColor)
                .append("caption", caption)
                .toString();
    }

}
