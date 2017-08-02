package model;

import java.util.List;

import static model.modelutils.Preconditions.checkArgument;

/**
 * Created by eglushchenko on 02.08.2017.
 */
public abstract class TUTDFEntry {
    private final List<IDSegment> idSegmentList;
    private final List<PhoneNumberSegment> phoneNumberSegmentList;

    // one of TR/LE/BK/BC/IP
    private final Segment switchSegment;

    public TUTDFEntry(List<IDSegment> idSegmentList, List<PhoneNumberSegment> phoneNumberSegmentList, Segment switchSegment) {
        checkArgument(!idSegmentList.isEmpty(), " There must be at least one IDSegment!");
        this.idSegmentList = idSegmentList;
        this.phoneNumberSegmentList = phoneNumberSegmentList;
        this.switchSegment = switchSegment;
    }
}
