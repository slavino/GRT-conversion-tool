package sk.digitalh.grt.toolkit.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

public class GRTLoadAppendixShotGroupGroup {

    /*
    * <group name="Group%201" expanded="true" expandedNotes="false" expandedOptions="false"
    * showinreport="false" color="#00ff00" showPOA="true" showSD1="true"
    * showSD2="true" showSD3="true" showES="true" showStatsText="true"
    * showOscillationTendency="true" showFlyerTendency="true" showSizeRect="true"
    * showPointCaption="true" statsTextLeft="0" statsTextTop="0" foreColor="#00ff00">
            <point x="0.478181818181818" y="0.455" flyer="false" score="" foreColor="#000000"
            * PointOfAim="true" caption="" />

    */

    @JacksonXmlProperty(localName = "name", isAttribute = true)
    private String name;

    @JacksonXmlProperty(localName = "expanded", isAttribute = true)
    private Boolean expanded;

    @JacksonXmlProperty(localName = "expandedNotes", isAttribute = true)
    private Boolean expandedNotes;

    @JacksonXmlProperty(localName = "expandedOptions", isAttribute = true)
    private Boolean expandedOptions;

    @JacksonXmlProperty(localName = "showinreport", isAttribute = true)
    private Boolean showinreport;

    @JacksonXmlProperty(localName = "color", isAttribute = true)
    private String color;

    @JacksonXmlProperty(localName = "showPOA", isAttribute = true)
    private Boolean showPOA;

    @JacksonXmlProperty(localName = "showSD1", isAttribute = true)
    private Boolean showSD1;

    @JacksonXmlProperty(localName = "showSD2", isAttribute = true)
    private Boolean showSD2;

    @JacksonXmlProperty(localName = "showSD3", isAttribute = true)
    private Boolean showSD3;

    @JacksonXmlProperty(localName = "showES", isAttribute = true)
    private Boolean showES;

    @JacksonXmlProperty(localName = "showStatsText", isAttribute = true)
    private Boolean showStatsText;

    @JacksonXmlProperty(localName = "showOscillationTendency", isAttribute = true)
    private Boolean showOscillationTendency;

    @JacksonXmlProperty(localName = "showFlyerTendency", isAttribute = true)
    private Boolean showFlyerTendency;

    @JacksonXmlProperty(localName = "showSizeRect", isAttribute = true)
    private Boolean showSizeRect;

    @JacksonXmlProperty(localName = "showPointCaption", isAttribute = true)
    private Boolean showPointCaption;

    @JacksonXmlProperty(localName = "statsTextLeft", isAttribute = true)
    private Double statsTextLeft;

    @JacksonXmlProperty(localName = "statsTextTop", isAttribute = true)
    private Double statsTextTop;

    @JacksonXmlProperty(localName = "foreColor", isAttribute = true)
    private String foreColor;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "point")
    private List<GRTLoadAppendixShotGroupGroupPoint> grtLoadAppendixShotGroupGroupPoints;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("name", name)
                .append("expanded", expanded)
                .append("expandedNotes", expandedNotes)
                .append("expandedOptions", expandedOptions)
                .append("showinreport", showinreport)
                .append("color", color)
                .append("showPOA", showPOA)
                .append("showSD1", showSD1)
                .append("showSD2", showSD2)
                .append("showSD3", showSD3)
                .append("showES", showES)
                .append("showStatsText", showStatsText)
                .append("showOscillationTendency", showOscillationTendency)
                .append("showFlyerTendency", showFlyerTendency)
                .append("showSizeRect", showSizeRect)
                .append("showPointCaption", showPointCaption)
                .append("statsTextLeft", statsTextLeft)
                .append("statsTextTop", statsTextTop)
                .append("foreColor", foreColor)
                .append("grtLoadAppendixShotGroupGroupPoints", grtLoadAppendixShotGroupGroupPoints)
                .toString();
    }
}
