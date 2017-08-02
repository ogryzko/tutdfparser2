import model.Segment;

/**
 * Created by eglushchenko on 02.08.2017.
 */
public interface ISegmentHandler {
    public Segment Process(IProcessContext context, String line);
}
