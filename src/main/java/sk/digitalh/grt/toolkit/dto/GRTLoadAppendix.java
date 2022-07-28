package sk.digitalh.grt.toolkit.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class GRTLoadAppendix {
    private static final Logger LOGGER = LogManager.getLogger(GRTLoadAppendix.class.getName());

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "gallery")
    private List<GRTLoadAppendixGallery> grtLoadAppendixGalleries;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "note")
    private List<GRTLoadAppendixNote> grtLoadAppendixNotes;


    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "ShotGroup")
    private List<GRTLoadAppendixShotGroup> grtLoadAppendixShotGroups;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Measurement")
    private List<GRTLoadAppendixMeasurement> grtLoadAppendixMeasurements;

    public GRTLoadAppendix() {
        super();
        LOGGER.debug("### Appendix");
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("grtLoadAppendixGalleries", grtLoadAppendixGalleries)
                .append("grtLoadAppendixNotes", grtLoadAppendixNotes)
                .append("grtLoadAppendixShotGroups", grtLoadAppendixShotGroups)
                .append("grtLoadAppendixMeasurements", grtLoadAppendixMeasurements)
                .toString();
    }
}
