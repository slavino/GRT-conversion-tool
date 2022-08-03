package sk.digitalh.grt.toolkit.dto.ql;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
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
    private String primer;// =
    private String PrimerLot;// =
    private String BulletLot;// =
    private String PowderLot;// =
    private String CaseMfg;// =
    private String MuzzleVel_meas;// =
    private String MVel_meas_std;// =
    private String MVel_meas_unit;// =
    private String Press_meas;// =
    private String Press_meas_std;// =
    private String Press_meas_unit; //=

    public QLDatFileChargeData() {
        super();
    }

    public QLDatFileChargeData(Ini.Section chargedata) {
        this.pulver = chargedata.get("pulver");
        this.abkof0 = Double.parseDouble(chargedata.get("abkof0"));
        this.abkof1 = Double.parseDouble(chargedata.get("abkof1"));
        this.exwarm = Double.parseDouble(chargedata.get("exwarm"));
        this.kappax = Double.parseDouble(chargedata.get("kappax"));
        this.powden = Double.parseDouble(chargedata.get("powden"));
        this.prodeg = Double.parseDouble(chargedata.get("prodeg"));
        this.powwht = Double.parseDouble(chargedata.get("powwht"));
        this.limiz1 = Double.parseDouble(chargedata.get("limiz1"));
        this.anfdru = Double.parseDouble(chargedata.get("anfdru"));
        this.anfpul = Double.parseDouble(chargedata.get("anfpul"));
        this.bulkdn = Double.parseDouble(chargedata.get("bulkdn"));
        this.powtmp = Double.parseDouble(chargedata.get("powtmp"));
        this.primer = (chargedata.get("primer"));
        this.PrimerLot = (chargedata.get("PrimerLot"));
        this.BulletLot = (chargedata.get("BulletLot"));
        this.PowderLot = (chargedata.get("PowderLot"));
        this.CaseMfg = (chargedata.get("CaseMfg"));
        this.MuzzleVel_meas = (chargedata.get("MuzzleVel_meas"));
        this.MVel_meas_std = (chargedata.get("MVel_meas_std"));
        this.MVel_meas_unit =(chargedata.get("MVel_meas_unit"));
        this.Press_meas = (chargedata.get("Press_meas"));
        this.Press_meas_std = (chargedata.get("Press_meas_std"));
        this.Press_meas_unit = (chargedata.get("Press_meas_unit"));
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
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
