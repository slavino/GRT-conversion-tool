package sk.digitalh.grt.toolkit.dto.ql;

import org.apache.commons.lang3.builder.ToStringBuilder;

public enum QLBulFileCSVHeader {
    NAME("name"), //1
    WEIGHT("weight"), //2
    LENGTH("length"), //3
    SMALL_DIAMETER_OF_TAPER("smallDiameterOfTaper"), //4
    LARGE_DIAMETER_OF_TAPER("largeDiameterOfTaper"), //5
    LENGTH_OF_TAPER("lengthOfTaper"), //6
    BALLISTIC_COEF_NAME("ballisticCoefName"), //7
    TAIL_TYPE("tailType"), //8
    DIAMETER("diameter"), //9
    BALLISTIC_COEF_VALUE("ballisticCoefValue"), //10
    BALLISTIC_COEF_VALUE1("ballisticCoefValue1"), //11
    BALLISTIC_COEF_VALUE2("ballisticCoefValue2"), //12
    BALLISTIC_COEF_VALUE3("ballisticCoefValue3"), //13
    BALLISTIC_COEF_VALUE4("ballisticCoefValue4"), //14
    BALLISTIC_COEF_VALUE5("ballisticCoefValue5"), //15

    BALLISTIC_COEF_VALUE1_AT_VELOCITY("ballisticCoefValue1Velocity"), //16
    BALLISTIC_COEF_VALUE2_AT_VELOCITY("ballisticCoefValue2Velocity"), //17
    BALLISTIC_COEF_VALUE3_AT_VELOCITY("ballisticCoefValue3Velocity"), //18
    BALLISTIC_COEF_VALUE4_AT_VELOCITY("ballisticCoefValue4Velocity"), //19

    UNKNOWN9("unknown9"), //20
    UNKNOWN10("unknown10"); //21

    private String fieldName;

    QLBulFileCSVHeader(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("fieldName", fieldName)
                .toString();
    }
}
