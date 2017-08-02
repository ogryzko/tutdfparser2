package model;

import static model.modelutils.Preconditions.checkNotNull;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class PhoneNumberSegment extends Segment {
    private final String number; // M
    private final Integer type; // C

    public PhoneNumberSegment(String segmentTag, String number, Integer type) {
        super(segmentTag);
        checkNotNull(number);
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public Integer getType() {
        return type;
    }
}
