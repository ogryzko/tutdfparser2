import model.ISegment;
import model.SegmentTag;
import model.TUTDFData;
import model.TUTDFEntry;

import java.io.BufferedReader;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by eglushchenko on 04.08.2017.
 */
public class TUTDFFileParser {
    Logger logger;
    Map<SegmentTag, IHandler> handlers;

    public ISegment parseLine(String line){
        String currentLine;
        SegmentTag tag = getSegmentTag(line);
        IHandler handler = handlers.get(tag);
        return handler.process(line);
    }

    public TUTDFData parseFile(BufferedReader reader){
        String currentLine;
        while ((currentLine = reader.readLine()) != null){

        }
    }

    public TUTDFEntry parseEntry(BufferedReader reader){
        String currentLine;
        LinkedHashMap<SegmentTag, List<ISegment>> segments = new LinkedHashMap<>();
        while ((currentLine = reader.readLine()) != null){
            SegmentTag tag = getSegmentTag(line);

        }
    }
}
