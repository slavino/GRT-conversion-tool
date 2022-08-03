package sk.digitalh.grt.toolkit.dto.ql;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.ini4j.Ini;
import org.ini4j.Profile;

public class QLDatFileStartup {
    /**
     * [startup]
     * commen=TikkaT3_9,3x62_StyriaArmsECO_170gr_LovexD073_4_SEATED_AS_MAYERL
     * pricomment=
     */

    private String comment;
    private String priComment;

    public QLDatFileStartup() {
        this.comment = "";
        this.priComment = "";
    }

    public QLDatFileStartup(Ini.Section startup) {
        this.comment = startup.get("commen");
        this.priComment = startup.get("pricomment");
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("comment", comment)
                .append("priComment", priComment)
                .toString();
    }
}
