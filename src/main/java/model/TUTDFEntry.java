package model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class TUTDFEntry {
    private final LinkedHashMap<SegmentTag, List<ISegment>> segments;

    public TUTDFEntry(LinkedHashMap<SegmentTag, List<ISegment>> segments) {
        this.segments = segments;
    }

    public ISegment getSegment(SegmentTag tag, int i){
        return segments.get(tag).get(i);
    }

    public ISegment[] getAllSegments(){
        ArrayList<ISegment> result = new ArrayList<>();
        for(List<ISegment> segmentsList : segments.values()){
            result.addAll(segmentsList);
        }
        ISegment[] out = new ISegment[result.size()];
        return result.toArray(out);
    }
}
