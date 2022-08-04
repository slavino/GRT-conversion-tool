package sk.digitalh.grt.toolkit.dto.ql;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ini4j.Ini;

public class QLDatFileMetrics {

    private static final Logger LOGGER = LogManager.getLogger(QLDatFileMetrics.class.getName());

    /**
     * [metrics]
     * pattyp=9.3 x 62
     * laflen= 22.4409448818898
     * patlan= 3.02913385826772
     * sdepth= .331889763779528
     * hullen= 2.44015748031496
     * kalzug= .366141732283465
     * sebert= .5
     * volful= 77.9931637741928
     * wirkqu= 66.31986736
     * wirktr= 0
     * brennr= 69.1556284735344
     * gesweg= 516.45
     * maxzul= 390
     * pmetho=Piezo CIP
     * bultyp=.366, 170, AERO ECO - smax:10,4
     * bulgew= 170.002859616648
     * bullen= .920866141732284
     * conlen= 0
     * condia= 0
     * condid= 0
     * ausinn= 0
     * buldia= .366141732283465
     * c1icao= .1965
     * mulbc1= .1965
     * trvel1= 0
     * mulbc2=0
     * trvel2=0
     * mulbc3=0
     * trvel3=0
     * mulbc4=0
     * trvel4=0
     * mulbc5=0
     * friyes= 0
     * fripas= 20001698.76
     * molyco= .66
     * molydo= 0
     * l1_in= 0
     * l2_in= 0
     * Ri_in= 0
     * R1_in= 0
     * P1_in= 0
     * P2_in= 0
     * H1_in= 0
     * H2_in= 0
     * Shape= 0
     * caswht= 0
     * ZD_in= 0
     * FD_in= 0
     * FB_in= 0
     * ZZ_no= 0
     * ZB_in= 0
     * Polyg= 0
     */

    private String pattyp; //=9.3 x 62
    private Double laflen; //= 22.4409448818898
    private Double patlan; //= 3.02913385826772
    private Double sdepth; //= .331889763779528
    private Double hullen; //= 2.44015748031496
    private Double kalzug; //= .366141732283465
    private Double sebert; //= .5
    private Double volful; //= 77.9931637741928
    private Double wirkqu; //= 66.31986736
    private Double wirktr; //= 0
    private Double brennr; //= 69.1556284735344
    private Double gesweg; //= 516.45
    private Double maxzul; //= 390

    //FIXME adept for enum
    private String pmetho; //=Piezo CIP
                            // - Piezo SAAMI
    private String bultyp; //=.366, 170, AERO ECO - smax:10,4
    private Double bulgew; //= 170.002859616648
    private Double bullen; //= .920866141732284
    private Double conlen; //= 0
    private Double condia; //= 0
    private Double condid; //= 0
    private Double ausinn; //= 0
    private Double buldia; //= .366141732283465
    private Double c1icao; //= .1965
    private Double mulbc1; //= .1965
    private Double trvel1; //= 0
    private Double mulbc2; //=0
    private Double trvel2; //=0
    private Double mulbc3; //=0
    private Double trvel3; //=0
    private Double mulbc4; //=0
    private Double trvel4; //=0
    private Double mulbc5; //=0
    private Double friyes; //= 0
    private Double fripas; //= 20001698.76
    private Double molyco; //= .66
    private Double molydo; //= 0
    private Double l1_in; //= 0
    private Double l2_in; //= 0
    private Double ri_in; //= 0
    private Double r1_in; //= 0
    private Double p1_in; //= 0
    private Double p2_in; //= 0
    private Double h1_in; //= 0
    private Double h2_in; //= 0
    private Double shape; //= 0
    private Double caswht; //= 0
    private Double zD_in; //= 0
    private Double fD_in; //= 0
    private Double fB_in; //= 0
    private Double zZ_no; //= 0
    private Double zB_in; //= 0
    private Double polyg; //= 0

    private static Double assignValue(String recordValue) {
        if (recordValue == null || recordValue.isEmpty()) {
            return null;
        } else {
            try {
                return Double.parseDouble(recordValue.replace(",","."));
            } catch (NumberFormatException nfEx) {
                LOGGER.error(nfEx);
                return null;
            }
        }
    }
    public QLDatFileMetrics() {
        super();
    }

    public QLDatFileMetrics(Ini.Section metrics) {
        this.pattyp = metrics.get("pattyp");
        this.laflen = assignValue(metrics.get("laflen"));
        this.patlan = assignValue(metrics.get("patlan"));
        this.sdepth = assignValue(metrics.get("sdepth"));
        this.hullen = assignValue(metrics.get("hullen"));
        this.kalzug = assignValue(metrics.get("kalzug"));
        this.sebert = assignValue(metrics.get("sebert"));
        this.volful = assignValue(metrics.get("volful"));
        this.wirkqu = assignValue(metrics.get("wirkqu"));
        this.wirktr = assignValue(metrics.get("wirktr"));
        this.brennr = assignValue(metrics.get("brennr"));
        this.gesweg = assignValue(metrics.get("gesweg"));
        this.maxzul = assignValue(metrics.get("maxzul"));
        this.pmetho = metrics.get("pmetho");
        this.bultyp = metrics.get("bultyp");
        this.bulgew = assignValue(metrics.get("bulgew"));
        this.bullen = assignValue(metrics.get("bullen"));
        this.conlen = assignValue(metrics.get("conlen"));
        this.condia = assignValue(metrics.get("condia"));
        this.condid = assignValue(metrics.get("condid"));
        this.ausinn = assignValue(metrics.get("ausinn"));
        this.buldia = assignValue(metrics.get("buldia"));
        this.c1icao = assignValue(metrics.get("c1icao"));
        this.mulbc1 = assignValue(metrics.get("mulbc1"));
        this.trvel1 = assignValue(metrics.get("trvel1"));
        this.mulbc2 = assignValue(metrics.get("mulbc2"));
        this.trvel2 = assignValue(metrics.get("trvel2"));
        this.mulbc3 = assignValue(metrics.get("mulbc3"));
        this.trvel3 = assignValue(metrics.get("trvel3"));
        this.mulbc4 = assignValue(metrics.get("mulbc4"));
        this.trvel4 = assignValue(metrics.get("trvel4"));
        this.mulbc5 = assignValue(metrics.get("mulbc5"));
        this.friyes = assignValue(metrics.get("friyes"));
        this.fripas = assignValue(metrics.get("fripas"));
        this.molyco = assignValue(metrics.get("molyco"));
        this.molydo = assignValue(metrics.get("molydo"));
        this.l1_in = assignValue(metrics.get("l1_in"));
        this.l2_in = assignValue(metrics.get("l2_in"));
        this.ri_in = assignValue(metrics.get("Ri_in"));
        this.r1_in = assignValue(metrics.get("R1_in"));
        this.p1_in = assignValue(metrics.get("P1_in"));
        this.p2_in = assignValue(metrics.get("P2_in"));
        this.h1_in = assignValue(metrics.get("H1_in"));
        this.h2_in = assignValue(metrics.get("H2_in"));
        this.shape = assignValue(metrics.get("Shape"));
        this.caswht = assignValue(metrics.get("caswht"));
        this.zD_in = assignValue(metrics.get("ZD_in"));
        this.fD_in = assignValue(metrics.get("FD_in"));
        this.fB_in = assignValue(metrics.get("FB_in"));
        this.zZ_no = assignValue(metrics.get("ZZ_no"));
        this.zB_in = assignValue(metrics.get("ZB_in"));
        this.polyg = assignValue(metrics.get("Polyg"));
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("pattyp", pattyp)
                .append("laflen", laflen)
                .append("patlan", patlan)
                .append("sdepth", sdepth)
                .append("hullen", hullen)
                .append("kalzug", kalzug)
                .append("sebert", sebert)
                .append("volful", volful)
                .append("wirkqu", wirkqu)
                .append("wirktr", wirktr)
                .append("brennr", brennr)
                .append("gesweg", gesweg)
                .append("maxzul", maxzul)
                .append("pmetho", pmetho)
                .append("bultyp", bultyp)
                .append("bulgew", bulgew)
                .append("bullen", bullen)
                .append("conlen", conlen)
                .append("condia", condia)
                .append("condid", condid)
                .append("ausinn", ausinn)
                .append("buldia", buldia)
                .append("c1icao", c1icao)
                .append("mulbc1", mulbc1)
                .append("trvel1", trvel1)
                .append("mulbc2", mulbc2)
                .append("trvel2", trvel2)
                .append("mulbc3", mulbc3)
                .append("trvel3", trvel3)
                .append("mulbc4", mulbc4)
                .append("trvel4", trvel4)
                .append("mulbc5", mulbc5)
                .append("friyes", friyes)
                .append("fripas", fripas)
                .append("molyco", molyco)
                .append("molydo", molydo)
                .append("l1_in", l1_in)
                .append("l2_in", l2_in)
                .append("Ri_in", ri_in)
                .append("R1_in", r1_in)
                .append("P1_in", p1_in)
                .append("P2_in", p2_in)
                .append("H1_in", h1_in)
                .append("H2_in", h2_in)
                .append("Shape", shape)
                .append("caswht", caswht)
                .append("ZD_in", zD_in)
                .append("FD_in", fD_in)
                .append("FB_in", fB_in)
                .append("ZZ_no", zZ_no)
                .append("ZB_in", zB_in)
                .append("Polyg", polyg)
                .toString();
    }
}
