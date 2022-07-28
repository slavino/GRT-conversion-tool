package sk.digitalh.grt.toolkit.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GRTLoadAppendixNote extends GRTAbstractNote {

    private static final Logger LOGGER = LogManager.getLogger(GRTLoadAppendixNote.class.getName());

    public GRTLoadAppendixNote() {
        super();
        LOGGER.debug("### GRTLoadAppendixNote");
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .toString();
    }
}
