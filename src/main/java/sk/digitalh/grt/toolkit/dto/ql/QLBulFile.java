package sk.digitalh.grt.toolkit.dto.ql;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static sk.digitalh.grt.toolkit.dto.ql.QLBulFileCSVHeader.*;

public class QLBulFile {

    private static final Logger LOGGER = LogManager.getLogger(QLBulFile.class.getName());
    private String manufacturer;

    private String name;

    private Double weight; //grains
    private Double length; //inches

    private Double smallDiameterOfTaper;
    private Double largeDiameterOfTaper;
    private Double lengthOfTaper;
    private QLBulBallisticCoeficientEnum ballisticCoefName; //G1
    private QLBulTailTypeEnum tailType; // empty = flatbase, 2 = boattail, 1=hollowBase
    private Double diameter;
    private Double ballisticCoefValue;
    private Double ballisticCoefValue1;
    private Double ballisticCoefValue2;
    private Double ballisticCoefValue3;
    private Double ballisticCoefValue4;
    private Double ballisticCoefValue5;
    private Double ballisticCoefValue1Velocity;
    private Double ballisticCoefValue2Velocity;
    private Double ballisticCoefValue3Velocity;
    private Double ballisticCoefValue4Velocity;
    private String unknown9;
    private Double unknown10;

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

    public QLBulFile(String fileName, CSVRecord record) {

        this.manufacturer = fileName; //virtual field to keep info about manufacturer or at least filename

        if (record.size() == 21) {
            this.name = record.get(NAME.getFieldName()).trim(); //1
            this.weight = assignValue(record.get(WEIGHT.getFieldName())); //2
            this.length = assignValue(record.get(LENGTH.getFieldName())); //3

            this.smallDiameterOfTaper = assignValue(record.get(SMALL_DIAMETER_OF_TAPER.getFieldName())); //4
            this.largeDiameterOfTaper = assignValue(record.get(LARGE_DIAMETER_OF_TAPER.getFieldName())); //5
            this.lengthOfTaper = assignValue(record.get(LENGTH_OF_TAPER.getFieldName())); //6

            this.ballisticCoefName = QLBulBallisticCoeficientEnum.fromString(record.get(BALLISTIC_COEF_NAME.getFieldName())); //7

            this.tailType = QLBulTailTypeEnum.fromString(record.get(TAIL_TYPE.getFieldName())); //8
            this.diameter = assignValue(record.get(DIAMETER.getFieldName())); //9

            this.ballisticCoefValue = assignValue(record.get(BALLISTIC_COEF_VALUE.getFieldName())); //10

            this.ballisticCoefValue1 = assignValue(record.get(BALLISTIC_COEF_VALUE1.getFieldName())); //11
            this.ballisticCoefValue2 = assignValue(record.get(BALLISTIC_COEF_VALUE2.getFieldName())); //12
            this.ballisticCoefValue3 = assignValue(record.get(BALLISTIC_COEF_VALUE3.getFieldName())); //13
            this.ballisticCoefValue4 = assignValue(record.get(BALLISTIC_COEF_VALUE4.getFieldName())); //14
            this.ballisticCoefValue5 = assignValue(record.get(BALLISTIC_COEF_VALUE5.getFieldName())); //15
            this.ballisticCoefValue1Velocity = assignValue(record.get(BALLISTIC_COEF_VALUE1_AT_VELOCITY.getFieldName())); //16
            this.ballisticCoefValue2Velocity = assignValue(record.get(BALLISTIC_COEF_VALUE2_AT_VELOCITY.getFieldName())); //17
            this.ballisticCoefValue3Velocity = assignValue(record.get(BALLISTIC_COEF_VALUE3_AT_VELOCITY.getFieldName())); //18
            this.ballisticCoefValue4Velocity = assignValue(record.get(BALLISTIC_COEF_VALUE4_AT_VELOCITY.getFieldName())); //19
            this.unknown9 = record.get(UNKNOWN9.getFieldName()); //20
            this.unknown10 = assignValue(record.get(UNKNOWN10.getFieldName())); //21
        }
    }

    public static final CSVFormat CSV_FORMAT = CSVFormat.Builder
            .create(CSVFormat.RFC4180)
            .setCommentMarker(';')
            .setIgnoreEmptyLines(true)
            .setHeader(
                    NAME.getFieldName(), //"name",
                    WEIGHT.getFieldName(), //"weight",
                    LENGTH.getFieldName(), //"length",
                    SMALL_DIAMETER_OF_TAPER.getFieldName(), //"smallDiameterOfTaper",
                    LARGE_DIAMETER_OF_TAPER.getFieldName(), //"largeDiameterOfTaper",
                    LENGTH_OF_TAPER.getFieldName(), //"lengthOfTaper",
                    BALLISTIC_COEF_NAME.getFieldName(), //"ballisticCoefName",
                    TAIL_TYPE.getFieldName(), //"tailType",
                    DIAMETER.getFieldName(), //"diameter",
                    BALLISTIC_COEF_VALUE.getFieldName(), //"ballisticCoefValue",
                    BALLISTIC_COEF_VALUE1.getFieldName(), //"ballisticCoefValue1",
                    BALLISTIC_COEF_VALUE2.getFieldName(), //"ballisticCoefValue2",
                    BALLISTIC_COEF_VALUE3.getFieldName(), //"ballisticCoefValue3",
                    BALLISTIC_COEF_VALUE4.getFieldName(), //"ballisticCoefValue4",
                    BALLISTIC_COEF_VALUE5.getFieldName(), //"ballisticCoefValue5",
                    BALLISTIC_COEF_VALUE1_AT_VELOCITY.getFieldName(), //"ballisticCoefValue1Velocity",
                    BALLISTIC_COEF_VALUE2_AT_VELOCITY.getFieldName(), //"ballisticCoefValue2Velocity",
                    BALLISTIC_COEF_VALUE3_AT_VELOCITY.getFieldName(), //"ballisticCoefValue3Velocity",
                    BALLISTIC_COEF_VALUE4_AT_VELOCITY.getFieldName(), //"ballisticCoefValue4Velocity",
                    UNKNOWN9.getFieldName(), //"unknown9",
                    UNKNOWN10.getFieldName() //"unknown10"
            )
            .build();

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("manufacturer-filename", manufacturer)
                .append(NAME.getFieldName(), name)
                .append(WEIGHT.getFieldName(), weight)
                .append(LENGTH.getFieldName(), length)
                .append(SMALL_DIAMETER_OF_TAPER.getFieldName(), smallDiameterOfTaper)
                .append(LARGE_DIAMETER_OF_TAPER.getFieldName(), largeDiameterOfTaper)
                .append(LENGTH_OF_TAPER.getFieldName(), lengthOfTaper)
                .append(BALLISTIC_COEF_NAME.getFieldName(), ballisticCoefName)
                .append(TAIL_TYPE.getFieldName(), tailType)
                .append(DIAMETER.getFieldName(), diameter)
                .append(BALLISTIC_COEF_VALUE.getFieldName(), ballisticCoefValue)
                .append(BALLISTIC_COEF_VALUE1.getFieldName(), ballisticCoefValue1)
                .append(BALLISTIC_COEF_VALUE2.getFieldName(), ballisticCoefValue2)
                .append(BALLISTIC_COEF_VALUE3.getFieldName(), ballisticCoefValue3)
                .append(BALLISTIC_COEF_VALUE4.getFieldName(), ballisticCoefValue4)
                .append(BALLISTIC_COEF_VALUE5.getFieldName(), ballisticCoefValue5)
                .append(BALLISTIC_COEF_VALUE1_AT_VELOCITY.getFieldName(), ballisticCoefValue1Velocity)
                .append(BALLISTIC_COEF_VALUE2_AT_VELOCITY.getFieldName(), ballisticCoefValue2Velocity)
                .append(BALLISTIC_COEF_VALUE3_AT_VELOCITY.getFieldName(), ballisticCoefValue3Velocity)
                .append(BALLISTIC_COEF_VALUE4_AT_VELOCITY.getFieldName(), ballisticCoefValue4Velocity)
                .append(UNKNOWN9.getFieldName(), unknown9)
                .append(UNKNOWN10.getFieldName(), unknown10)
                .toString();
    }
}
