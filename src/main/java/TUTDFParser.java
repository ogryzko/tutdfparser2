import model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by eglushchenko on 02.08.2017.
 */
public class TUTDFParser {
    private static final String NEWLINE = "\n";

    private Map<SegmentTag, ISegmentHandler> segmentHandlersMap;
    private ISegmentHandler defaultSegmentHandler;

    /**
     * Parse a TUTDF file and return TUTDFData object
     * @param inStream an InputStream
     * @return a TUTDFData object
     * @throws IOException
     * @throws ParseException
     */
    public TUTDFData parseTUTDFFile(InputStream inStream) throws IOException, ParseException {
        BufferedReader reader = getBufferedReader(inStream);
        return parseTUTDFFile(reader);
    }

    private TUTDFData parseTUTDFFile(BufferedReader reader) throws IOException {
        String currentLine;
        List<TUTDFEntry> entryList = new ArrayList<TUTDFEntry>();
        IProcessContext context = null;
        while ((currentLine = reader.readLine()) != null) {

            ISegmentHandler handler;
            if(currentLine.equals("") ||
                    currentLine.equals(NEWLINE)){
                continue;
            }

            SegmentTag segmentTag = segmentTagFromLine(currentLine);
            if(segmentTag == null) {
                continue;
            }

            if(segmentHandlersMap.containsKey(segmentTag)){
                handler = segmentHandlersMap.get(segmentTag);
            } else handler = defaultSegmentHandler;
            Segment segment = handler.Process(context, currentLine);
        }
        return null;
    }

    private BufferedReader getBufferedReader(InputStream inStream)
            throws IOException {

        BufferedReader reader;
        if (inStream == null) {
            throw new IOException ("input stream is null!");
        }

        reader = new BufferedReader (new InputStreamReader(inStream, Charset.forName("windows-1251") ));
        return reader;

    }

    public void setSegmentHandlersMap(Map<SegmentTag, ISegmentHandler> segmentHandlersMap) {
        this.segmentHandlersMap = segmentHandlersMap;
    }

    public SegmentTag segmentTagFromLine(String line){
        if(line.startsWith("TUTDF")) return SegmentTag.TUTDF;
        else if(line.startsWith("TRLR")) return SegmentTag.TRLR;
        else if(line.startsWith("ID")) return SegmentTag.ID;
        else if(line.startsWith("NA")) return SegmentTag.NA;
        else if(line.startsWith("PN")) return SegmentTag.PN;
        else if(line.startsWith("TR")) return SegmentTag.TR;
        else return null;
    }
}
