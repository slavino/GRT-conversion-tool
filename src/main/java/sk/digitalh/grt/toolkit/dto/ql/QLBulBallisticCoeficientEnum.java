package sk.digitalh.grt.toolkit.dto.ql;

public enum QLBulBallisticCoeficientEnum {

    // empty = flatbase, 2 = boattail, 1=hollowBase

    BC_G7("G7"),
    BC_G1("G1");


    private String value;

    QLBulBallisticCoeficientEnum(String tailTypeId) {
        this.value = tailTypeId;
    }

    public String getValue() {
        return value;
    }

    public static QLBulBallisticCoeficientEnum fromString(String tailType) {
        switch (tailType) {
            case "G7" : return BC_G7;
            case "G1" : return BC_G1;
            default : return BC_G1;
        }
    }

}
