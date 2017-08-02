package model;

import java.util.List;

import static model.modelutils.Preconditions.checkArgument;
import static model.modelutils.Preconditions.checkNotNull;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class TUTDFEntryFiz extends TUTDFEntry {
    private final NameSegment nameSegment;

    public TUTDFEntryFiz(List<IDSegment> idSegmentList, List<PhoneNumberSegment> phoneNumberSegmentList, Segment switchSegment, NameSegment nameSegment) {
        super(idSegmentList, phoneNumberSegmentList, switchSegment);
        checkNotNull(nameSegment);
        this.nameSegment = nameSegment;
        checkArgument(switchSegment instanceof TransactionSegment, "switchSegment must be TR or LE or IP or BC");
    }
}
