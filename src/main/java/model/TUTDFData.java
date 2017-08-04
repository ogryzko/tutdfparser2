package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eglushchenko on 04.08.2017.
 */
public class TUTDFData {
    private final HeaderSegment headerSegment;
    private final List<TUTDFEntry> entryList;
    private final TrailSegment trailSegment;

    public TUTDFData(HeaderSegment headerSegment, List<TUTDFEntry> entryList, TrailSegment trailSegment) {
        this.headerSegment = headerSegment;
        this.entryList = entryList;
        this.trailSegment = trailSegment;
    }

    public HeaderSegment getHeaderSegment() {
        return headerSegment;
    }

    public TrailSegment getTrailSegment() {
        return trailSegment;
    }

    public TUTDFEntry getEntry(int i){
        return entryList.get(i);
    }

    public List<TUTDFEntry> getAllEntryes() {
        return new ArrayList<TUTDFEntry>(entryList);
    }
}
