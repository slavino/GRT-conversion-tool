package sk.digitalh.grt.toolkit.dto.ql;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.ini4j.Ini;
import org.ini4j.Profile;

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
    private Double Ri_in; //= 0
    private Double R1_in; //= 0
    private Double P1_in; //= 0
    private Double P2_in; //= 0
    private Double H1_in; //= 0
    private Double H2_in; //= 0
    private Double Shape; //= 0
    private Double caswht; //= 0
    private Double ZD_in; //= 0
    private Double FD_in; //= 0
    private Double FB_in; //= 0
    private Double ZZ_no; //= 0
    private Double ZB_in; //= 0
    private Double Polyg; //= 0

    public QLDatFileMetrics() {
        super();
    }

    public QLDatFileMetrics(Ini.Section metrics) {

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
                .append("Ri_in", Ri_in)
                .append("R1_in", R1_in)
                .append("P1_in", P1_in)
                .append("P2_in", P2_in)
                .append("H1_in", H1_in)
                .append("H2_in", H2_in)
                .append("Shape", Shape)
                .append("caswht", caswht)
                .append("ZD_in", ZD_in)
                .append("FD_in", FD_in)
                .append("FB_in", FB_in)
                .append("ZZ_no", ZZ_no)
                .append("ZB_in", ZB_in)
                .append("Polyg", Polyg)
                .toString();
    }
}
