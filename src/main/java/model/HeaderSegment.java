package model;

import java.util.Date;

import static model.modelutils.Preconditions.checkNotNull;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class HeaderSegment extends Segment {
    private final String version; // M
    private final Date versionDate; // M
    private final String memberCode; // M
    private final String cycleIdentification; // O
    private final Date reportDate; // M
    private final String authorizationCode; // M
    private final String memberData; // O

    public HeaderSegment(String segmentTag, String version,
                         Date versionDate, String memberCode, String cycleIdentification,
                         Date reportDate, String authorizationCode, String memberData) {
        super(segmentTag);
        checkNotNull(segmentTag, "segmentTag can not be null");
        this.version = version;
        checkNotNull(versionDate, "versionDate can not be null");
        this.versionDate = versionDate;
        checkNotNull(memberCode, "memberCode can not be null");
        this.memberCode = memberCode;
        this.cycleIdentification = cycleIdentification;
        checkNotNull(reportDate, "reportDate can not be null");
        this.reportDate = reportDate;
        checkNotNull(authorizationCode, "authorizationCode can not be null");
        this.authorizationCode = authorizationCode;

        this.memberData = memberData;
    }

    public String getVersion() {
        return version;
    }

    public Date getVersionDate() {
        return versionDate;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public String getCycleIdentification() {
        return cycleIdentification;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public String getMemberData() {
        return memberData;
    }
}
