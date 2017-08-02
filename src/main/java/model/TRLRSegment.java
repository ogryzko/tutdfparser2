package model;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class TRLRSegment extends Segment {
    private final Integer Counter;

    public TRLRSegment(String segmentTag, Integer counter) {
        super(segmentTag);
        Counter = counter;
    }
}
