package sk.digitalh.grt.toolkit.dto.ql;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.ini4j.Ini;

public class QLDatFileMetrics {
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
    private String pmetho; //=Piezo CIP
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

    public QLDatFileMetrics() {
        super();
    }

    public QLDatFileMetrics(Ini.Section metrics) {
        this.pattyp = metrics.get("pattyp");
        this.laflen = Double.parseDouble(metrics.get("laflen"));
        this.patlan = Double.parseDouble(metrics.get("patlan"));
        this.sdepth = Double.parseDouble(metrics.get("sdepth"));
        this.hullen = Double.parseDouble(metrics.get("hullen"));
        this.kalzug = Double.parseDouble(metrics.get("kalzug"));
        this.sebert = Double.parseDouble(metrics.get("sebert"));
        this.volful = Double.parseDouble(metrics.get("volful"));
        this.wirkqu = Double.parseDouble(metrics.get("wirkqu"));
        this.wirktr = Double.parseDouble(metrics.get("wirktr"));
        this.brennr = Double.parseDouble(metrics.get("brennr"));
        this.gesweg = Double.parseDouble(metrics.get("gesweg"));
        this.maxzul = Double.parseDouble(metrics.get("maxzul"));
        this.pmetho = metrics.get("pmetho");
        this.bultyp = metrics.get("bultyp");
        this.bulgew = Double.parseDouble(metrics.get("bulgew"));
        this.bullen = Double.parseDouble(metrics.get("bullen"));
        this.conlen = Double.parseDouble(metrics.get("conlen"));
        this.condia = Double.parseDouble(metrics.get("condia"));
        this.condid = Double.parseDouble(metrics.get("condid"));
        this.ausinn = Double.parseDouble(metrics.get("ausinn"));
        this.buldia = Double.parseDouble(metrics.get("buldia"));
        this.c1icao = Double.parseDouble(metrics.get("c1icao"));
        this.mulbc1 = Double.parseDouble(metrics.get("mulbc1"));
        this.trvel1 = Double.parseDouble(metrics.get("trvel1"));
        this.mulbc2 = Double.parseDouble(metrics.get("mulbc2"));
        this.trvel2 = Double.parseDouble(metrics.get("trvel2"));
        this.mulbc3 = Double.parseDouble(metrics.get("mulbc3"));
        this.trvel3 = Double.parseDouble(metrics.get("trvel3"));
        this.mulbc4 = Double.parseDouble(metrics.get("mulbc4"));
        this.trvel4 = Double.parseDouble(metrics.get("trvel4"));
        this.mulbc5 = Double.parseDouble(metrics.get("mulbc5"));
        this.friyes = Double.parseDouble(metrics.get("friyes"));
        this.fripas = Double.parseDouble(metrics.get("fripas"));
        this.molyco = Double.parseDouble(metrics.get("molyco"));
        this.molydo = Double.parseDouble(metrics.get("molydo"));
        this.l1_in = Double.parseDouble(metrics.get("l1_in"));
        this.l2_in = Double.parseDouble(metrics.get("l2_in"));
        this.ri_in = Double.parseDouble(metrics.get("Ri_in"));
        this.r1_in = Double.parseDouble(metrics.get("R1_in"));
        this.p1_in = Double.parseDouble(metrics.get("P1_in"));
        this.p2_in = Double.parseDouble(metrics.get("P2_in"));
        this.h1_in = Double.parseDouble(metrics.get("H1_in"));
        this.h2_in = Double.parseDouble(metrics.get("H2_in"));
        this.shape = Double.parseDouble(metrics.get("Shape"));
        this.caswht = Double.parseDouble(metrics.get("caswht"));
        this.zD_in = Double.parseDouble(metrics.get("ZD_in"));
        this.fD_in = Double.parseDouble(metrics.get("FD_in"));
        this.fB_in = Double.parseDouble(metrics.get("FB_in"));
        this.zZ_no = Double.parseDouble(metrics.get("ZZ_no"));
        this.zB_in = Double.parseDouble(metrics.get("ZB_in"));
        this.polyg = Double.parseDouble(metrics.get("Polyg"));
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
