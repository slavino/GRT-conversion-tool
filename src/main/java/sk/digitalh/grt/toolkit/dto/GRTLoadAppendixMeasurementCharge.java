package sk.digitalh.grt.toolkit.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

public class GRTLoadAppendixMeasurementCharge {

    /*
    * <charge name="Charge%201" showinreport="true" expanded="true" expandedstats="false"
    * note="EXAMPLE%20ONLY%21%20DO%20NOT%20USE%20THIS%20LOAD" value="0.002462358579991"
    * menu="" menuvalue="" menuunit="m" source="" sourceoptions="%7B%7D">
          <shot name="" velocity="844.60080000000607" pressure="0" />
          <shot name="" velocity="850.08720000000608" pressure="0" />
          <shot name="" velocity="847.95360000000608" pressure="0" />
          <shot name="" velocity="850.39200000000608" pressure="0" />
        </charge>*/

    @JacksonXmlProperty(localName = "name", isAttribute = true)
    private String name;

    @JacksonXmlProperty(localName = "showinreport", isAttribute = true)
    private Boolean showinreport;

    @JacksonXmlProperty(localName = "expanded", isAttribute = true)
    private Boolean expanded;

    @JacksonXmlProperty(localName = "expandedstats", isAttribute = true)
    private Boolean expandedstats;

    @JacksonXmlProperty(localName = "note", isAttribute = true)
    private String note;

    @JacksonXmlProperty(localName = "value", isAttribute = true)
    private String value;

    @JacksonXmlProperty(localName = "menu", isAttribute = true)
    private String menu;

    @JacksonXmlProperty(localName = "menuvalue", isAttribute = true)
    private String menuvalue;

    @JacksonXmlProperty(localName = "menuunit", isAttribute = true)
    private String menuunit;

    @JacksonXmlProperty(localName = "source", isAttribute = true)
    private String source;

    @JacksonXmlProperty(localName = "sourceoptions", isAttribute = true)
    private String sourceoptions;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "shot")
    private List<GRTLoadAppendixMeasurementChargeShot> grtLoadAppendixMeasurementChargeShots;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("name", name)
                .append("showinreport", showinreport)
                .append("expanded", expanded)
                .append("expandedstats", expandedstats)
                .append("note", note)
                .append("value", value)
                .append("menu", menu)
                .append("menuvalue", menuvalue)
                .append("menuunit", menuunit)
                .append("source", source)
                .append("sourceoptions", sourceoptions)
                .append("grtLoadAppendixMeasurementChargeShots", grtLoadAppendixMeasurementChargeShots)
                .toString();
    }
}
