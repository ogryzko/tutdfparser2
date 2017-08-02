package model;

import java.util.ArrayList;
import java.util.List;

import static model.modelutils.Preconditions.checkNotNull;

/**
 * Created by EGlushchenko on 28.07.2017.
 */
public class TUTDFData {
    private final HeaderSegment headerSegment;
    private final List<TUTDFEntryFiz> tutdfEntryList = new ArrayList<TUTDFEntryFiz>();
    private final TRLRSegment trlrSegment;

    public TUTDFData(HeaderSegment headerSegment, TRLRSegment trlrSegment) {
        checkNotNull(headerSegment);
        this.headerSegment = headerSegment;
        checkNotNull(trlrSegment);
        this.trlrSegment = trlrSegment;
    }
}
