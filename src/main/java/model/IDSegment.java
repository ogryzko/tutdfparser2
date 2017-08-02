package model;

import java.text.SimpleDateFormat;
import java.util.Date;

import static model.modelutils.Preconditions.checkNotNull;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class IDSegment extends Segment {
    private final Integer idType; // M
    private final String seriesNumber; // C
    private final String idNumber; // C
    private final Date issueDate; // C
    private final String issueAuthority; // C
    private final String issueLocation; // O
    private final String oldIDNumber; // O

    public IDSegment(String segmentTag, Integer idType,
                     String seriesNumber, String idNumber,
                     Date issueDate, String issueAuthority,
                     String issueLocation, String oldIDNumber) {
        super(segmentTag);
        checkNotNull(idType);
        this.idType = idType;
        this.seriesNumber = seriesNumber;
        this.idNumber = idNumber;
        this.issueDate = issueDate;
        this.issueAuthority = issueAuthority;
        this.issueLocation = issueLocation;
        this.oldIDNumber = oldIDNumber;
    }

    public Integer getIdType() {
        return idType;
    }

    public String getSeriesNumber() {
        return seriesNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public String getIssueAuthority() {
        return issueAuthority;
    }

    public String getIssueLocation() {
        return issueLocation;
    }

    public String getOldIDNumber() {
        return oldIDNumber;
    }
}
