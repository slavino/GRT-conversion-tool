package sk.digitalh.grt.toolkit.dto.ql;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.ini4j.Ini;

public class QLDatFile {

    private QLDatFileStartup qlDatFileStartup;

    private QLDatFileMetrics qlDatFileMetrics;

    private QLDatFileChargeData qlDatFileChargeData;

    public QLDatFile() {
        this.qlDatFileStartup = new QLDatFileStartup();
        this.qlDatFileMetrics = new QLDatFileMetrics();
        this.qlDatFileChargeData = new QLDatFileChargeData();
    }

    public QLDatFile(Ini qlDatFile) {
        this.qlDatFileStartup = new QLDatFileStartup(qlDatFile.get("startup"));
        this.qlDatFileMetrics = new QLDatFileMetrics(qlDatFile.get("metrics"));
        this.qlDatFileChargeData = new QLDatFileChargeData(qlDatFile.get("chargedata"));
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("qlDatFileStartup", qlDatFileStartup)
                .append("qlDatFileMetrics", qlDatFileMetrics)
                .append("qlDatFileChargeData", qlDatFileChargeData)
                .toString();
    }
}
