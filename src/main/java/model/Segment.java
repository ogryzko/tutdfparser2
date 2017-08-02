package model;

import static model.modelutils.Preconditions.checkArgument;
import static model.modelutils.Preconditions.checkNotNull;

/**
 * Created by eglushchenko on 02.08.2017.
 */
public abstract class Segment {
    protected final String SegmentTag;

    protected Segment(String segmentTag) {
        checkNotNull(segmentTag, "segmentTag cannot be null");
        checkArgument(segmentTag.length() == 4, "segmentTag must be 4 letters long");
        SegmentTag = segmentTag;
    }

    public String getSegmentTag() {
        return SegmentTag;
    }
}
