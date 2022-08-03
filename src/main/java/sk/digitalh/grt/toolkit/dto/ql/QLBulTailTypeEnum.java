package sk.digitalh.grt.toolkit.dto.ql;

public enum QLBulTailTypeEnum {

    // empty = flatbase, 2 = boattail, 1=hollowBase

    FLAT_BASE(""),
    HOLLOW_BASE("1"),
    BOAT_TAIL("2");


    private String value;

    QLBulTailTypeEnum(String tailTypeId) {
        this.value = tailTypeId;
    }

    public String getValue() {
        return value;
    }

    public static QLBulTailTypeEnum fromString(String tailType) {
        switch (tailType) {
            case "1" : return HOLLOW_BASE;
            case "2" : return BOAT_TAIL;
            default : return FLAT_BASE;
        }
    }

}
