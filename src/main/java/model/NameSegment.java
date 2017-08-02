package model;

import java.text.SimpleDateFormat;
import java.util.Date;

import static model.modelutils.Preconditions.checkNotNull;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class NameSegment extends Segment {
    private final String surname; // M
    private final String patronymicName; // O
    private final String firstName; // M
    private final Integer emptyFieldFirst; // 1 O
    private final Date dateOfBirth; // M
    private final String placeOfBirth; // M
    private final String emptyFieldSecond; // 2 O
    private final Integer emptyFieldThird; // 3 O
    private final Integer emptyFieldFourth; // 4 O
    private final Integer remarks; // O
    private final String oldSurname; // O
    private final String oldFirstName; // 0

    public NameSegment(String segmentTag, String surname,
                       String patronymicName, String firstName,
                       Integer emptyFieldFirst, Date dateOfBirth,
                       String placeOfBirth, String emptyFieldSecond,
                       Integer emptyFieldThird, Integer emptyFieldFourth,
                       Integer remarks, String oldSurname, String oldFirstName) {
        super(segmentTag);
        checkNotNull(surname);
        this.surname = surname;
        this.patronymicName = patronymicName;
        checkNotNull(firstName);
        this.firstName = firstName;
        this.emptyFieldFirst = emptyFieldFirst;
        checkNotNull(dateOfBirth);
        this.dateOfBirth = dateOfBirth;
        checkNotNull(placeOfBirth);
        this.placeOfBirth = placeOfBirth;
        this.emptyFieldSecond = emptyFieldSecond;
        this.emptyFieldThird = emptyFieldThird;
        this.emptyFieldFourth = emptyFieldFourth;
        this.remarks = remarks;
        this.oldSurname = oldSurname;
        this.oldFirstName = oldFirstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getEmptyFieldFirst() {
        return emptyFieldFirst;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getEmptyFieldSecond() {
        return emptyFieldSecond;
    }

    public Integer getEmptyFieldThird() {
        return emptyFieldThird;
    }

    public Integer getEmptyFieldFourth() {
        return emptyFieldFourth;
    }

    public Integer getRemarks() {
        return remarks;
    }

    public String getOldSurname() {
        return oldSurname;
    }

    public String getOldFirstName() {
        return oldFirstName;
    }
}
