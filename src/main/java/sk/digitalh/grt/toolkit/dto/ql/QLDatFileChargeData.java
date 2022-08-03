package sk.digitalh.grt.toolkit.dto.ql;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.ini4j.Ini;

public class QLDatFileChargeData {

    /**
     * [chargedata]
     * pulver=Lovex D073.4
     * abkof0= .523
     * abkof1= 1.8216
     * exwarm= 3710
     * kappax= 1.241
     * powden= 1.54
     * prodeg= 3.5
     * powwht= 61.1
     * limiz1= .34
     * anfdru= 26000000
     * anfpul= .014096457850288
     * bulkdn= .986
     * powtmp= 21
     * primer=
     * PrimerLot=
     * BulletLot=
     * PowderLot=
     * CaseMfg=
     * MuzzleVel_meas=
     * MVel_meas_std=
     * MVel_meas_unit=
     * Press_meas=
     * Press_meas_std=
     * Press_meas_unit=
     */

    private String pulver;//=Lovex D073.4
    private Double abkof0;//= .523
    private Double abkof1;// = 1.8216
    private Double exwarm;// = 3710
    private Double kappax;// = 1.241
    private Double powden;// = 1.54
    private Double prodeg;// = 3.5
    private Double powwht;// = 61.1
    private Double limiz1;// = .34
    private Double anfdru;// = 26000000
    private Double anfpul;// = .014096457850288
    private Double bulkdn;// = .986
    private Double powtmp;// = 21
    private Double primer;// =
    private Double PrimerLot;// =
    private Double BulletLot;// =
    private Double PowderLot;// =
    private Double CaseMfg;// =
    private Double MuzzleVel_meas;// =
    private Double MVel_meas_std;// =
    private Double MVel_meas_unit;// =
    private Double Press_meas;// =
    private Double Press_meas_std;// =
    private Double Press_meas_unit; //=

    public QLDatFileChargeData() {
        super();
    }

    public QLDatFileChargeData(Ini.Section chargedata) {

    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("pulver", pulver)
                .append("abkof0", abkof0)
                .append("abkof1", abkof1)
                .append("exwarm", exwarm)
                .append("kappax", kappax)
                .append("powden", powden)
                .append("prodeg", prodeg)
                .append("powwht", powwht)
                .append("limiz1", limiz1)
                .append("anfdru", anfdru)
                .append("anfpul", anfpul)
                .append("bulkdn", bulkdn)
                .append("powtmp", powtmp)
                .append("primer", primer)
                .append("PrimerLot", PrimerLot)
                .append("BulletLot", BulletLot)
                .append("PowderLot", PowderLot)
                .append("CaseMfg", CaseMfg)
                .append("MuzzleVel_meas", MuzzleVel_meas)
                .append("MVel_meas_std", MVel_meas_std)
                .append("MVel_meas_unit", MVel_meas_unit)
                .append("Press_meas", Press_meas)
                .append("Press_meas_std", Press_meas_std)
                .append("Press_meas_unit", Press_meas_unit)
                .toString();
    }
}
