package sk.digitalh.grt.toolkit.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class GRTLoadAppendixGallery {

    private static final Logger LOGGER = LogManager.getLogger(GRTLoadAppendixGallery.class.getName());

    @JacksonXmlProperty(localName = "index", isAttribute = true)
    private Integer index;

    @JacksonXmlProperty(localName = "hasfocus", isAttribute = true)
    private Boolean hasfocus;

    @JacksonXmlProperty(localName = "showinreport", isAttribute = true)
    private Boolean showinreport;

    @JacksonXmlProperty(localName = "title", isAttribute = true)
    private String title;

    //FIXME WTF?
//    @JacksonXmlProperty(localName = "name", isAttribute = true)
//    private String name;
    //FIXME WTF?
//    @JacksonXmlProperty(localName = "type", isAttribute = true)
//    private String type;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "picture")
    private List<GRTLoadAppendixGalleryPicture> grtLoadAppendixGalleryPictures;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "note")
    private List<GRTLoadAppendixGalleryNote> grtLoadAppendixNotes;

    public GRTLoadAppendixGallery() {
        super();
        LOGGER.debug("### Appendix Gallery");
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("index", index)
                .append("hasfocus", hasfocus)
                .append("showinreport", showinreport)
                .append("title", title)
                .append("grtLoadAppendixGalleryPictures", grtLoadAppendixGalleryPictures)
                .append("grtLoadAppendixNotes", grtLoadAppendixNotes)
                .toString();
    }
}
