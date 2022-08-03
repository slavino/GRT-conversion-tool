package sk.digitalh.grt.toolkit.dto.grt;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.List;

public class GRTLoadAppendixShotGroup {

    //<ShotGroup index="2" hasfocus="false" title="Shot%20group" zoom="0.4" scrollPositionX="202" scrollPositionY="278"
    //  refPoint1X="0.451914893617021" refPoint1Y="0.238404255319149"
    //  refPoint2X="0.437291666666667" refPoint2Y="0.65"
    //  refDistance="160" shootDistance="100" pointSize="0.032027209602376"
    //  statisticSize="1" darkenImageAlpha="0.5" showQuickHelp="true">
    // <picture name="IMG_20220607_163725.jpg" type="jpeg" width="3000" height="4000" data="..."

    @JacksonXmlProperty(localName = "index", isAttribute = true)
    private Integer index;

    @JacksonXmlProperty(localName = "hasfocus", isAttribute = true)
    private Boolean hasfocus;

    @JacksonXmlProperty(localName = "title", isAttribute = true)
    private String title;

    @JacksonXmlProperty(localName = "zoom", isAttribute = true)
    private String zoom;

    @JacksonXmlProperty(localName = "scrollPositionX", isAttribute = true)
    private Integer scrollPositionX;

    @JacksonXmlProperty(localName = "scrollPositionY", isAttribute = true)
    private Integer scrollPositionY;

    @JacksonXmlProperty(localName = "refPoint1X", isAttribute = true)
    private Double refPoint1X;

    @JacksonXmlProperty(localName = "refPoint1Y", isAttribute = true)
    private Double refPoint1Y;

    @JacksonXmlProperty(localName = "refPoint2X", isAttribute = true)
    private Double refPoint2X;

    @JacksonXmlProperty(localName = "refPoint2Y", isAttribute = true)
    private Double refPoint2Y;

    @JacksonXmlProperty(localName = "refDistance", isAttribute = true)
    private Double refDistance;

    @JacksonXmlProperty(localName = "shootDistance", isAttribute = true)
    private Double shootDistance;

    @JacksonXmlProperty(localName = "pointSize", isAttribute = true)
    private Double pointSize;

    @JacksonXmlProperty(localName = "statisticSize", isAttribute = true)
    private Double statisticSize;

    @JacksonXmlProperty(localName = "darkenImageAlpha", isAttribute = true)
    private Double darkenImageAlpha;

    @JacksonXmlProperty(localName = "showQuickHelp", isAttribute = true)
    private Boolean showQuickHelp;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "picture", isAttribute = true)
    private List<GRTLoadAppendixGalleryPicture> grtLoadAppendixGalleryPictureList;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "group", isAttribute = true)
    private List<GRTLoadAppendixShotGroupGroup> grtLoadAppendixShotGroupGroups;

    public String getURLDecodedTitle() {
        return URLDecoder.decode(title, Charset.forName("UTF-8"));
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("index", index)
                .append("hasfocus", hasfocus)
                .append("title", getURLDecodedTitle())
                .append("zoom", zoom)
                .append("scrollPositionX", scrollPositionX)
                .append("scrollPositionY", scrollPositionY)
                .append("refPoint1X", refPoint1X)
                .append("refPoint1Y", refPoint1Y)
                .append("refPoint2X", refPoint2X)
                .append("refPoint2Y", refPoint2Y)
                .append("refDistance", refDistance)
                .append("shootDistance", shootDistance)
                .append("pointSize", pointSize)
                .append("statisticSize", statisticSize)
                .append("darkenImageAlpha", darkenImageAlpha)
                .append("showQuickHelp", showQuickHelp)
                .append("grtLoadAppendixGalleryPictureList", grtLoadAppendixGalleryPictureList)
                .toString();
    }
}
