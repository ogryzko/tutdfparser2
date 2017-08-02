package model;

import java.text.SimpleDateFormat;
import java.util.Date;

import static model.modelutils.Preconditions.checkNotNull;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class TransactionSegment  extends Segment {
    private final String memberCode; // M
    private final String accountNumber; // M
    private final Integer accountType; // C
    private final Integer accountRelationship; // M
    private final Date dateAccountOpened; // C
    private final Date dateOfLastPayment; // C
    private final Integer accountRating; // C
    private final Date dateAccountRating; // C
    private final Date dateReported; // C
    private final String creditLimit; // C
    private final String balance; // C
    private final String pastDue; // C
    private final String nextPayment; // C
    private final Integer creditPaymentFrequency; // C
    private final String mop; // C
    private final String currencyCode; // C
    private final Integer collateralCode; // C
    private final Date dateOfContractTermination; // C
    private final Date datePaymentDue; // C
    private final Date dateInterestPaymentDue; // C
    private final Integer interestPaymentFrequency; // C
    private final String oldMemberCode; // O
    private final String oldAccountNumber; // O
    private final String amountOutstanding; // C
    private final String guarantorIndicator; // C
    private final String volumeOfDebtSecuredByGuarantee; // C
    private final String guaranteeSum; // C
    private final Date guaranteeTem; // C
    private final String bankGuaranteeIndicator; // C
    private final String volumeOfDebtSecuredByBankGuarantee; // C
    private final String bankGuaranteeSum; // C
    private final String bankGuaranteeTem; // C
    private final String collateralValue; // C
    private final Date collateralDate; // C
    private final Date collateralAgreementExpirationDate; // C
    private final String overallValueOfCredit; // C
    private final String rightOfClaimAcquirersNames; // C
    private final String rightOfClaimAcquirersRegistrationData; // C
    private final Integer rightOfClaimAcquirersTaxpayerID; // C
    private final Integer rightOfClaimAcquirersSocialInsuranceNumber; // C
    private final Date completePerformanceOfObligationsDate; // C

    public TransactionSegment(String segmentTag,
                              String memberCode, String accountNumber,
                              Integer accountType, Integer accountRelationship,
                              Date dateAccountOpened, Date dateOfLastPayment,
                              Integer accountRating, Date dateAccountRating,
                              Date dateReported, String creditLimit,
                              String balance, String pastDue,
                              String nextPayment, Integer creditPaymentFrequency,
                              String mop, String currencyCode,
                              Integer collateralCode, Date dateOfContractTermination,
                              Date datePaymentDue, Date dateInterestPaymentDue,
                              Integer interestPaymentFrequency, String oldMemberCode,
                              String oldAccountNumber, String amountOutstanding,
                              String guarantorIndicator, String volumeOfDebtSecuredByGuarantee,
                              String guaranteeSum, Date guaranteeTem, String bankGuaranteeIndicator,
                              String volumeOfDebtSecuredByBankGuarantee, String bankGuaranteeSum,
                              String bankGuaranteeTem, String collateralValue,
                              Date collateralDate, Date collateralAgreementExpirationDate,
                              String overallValueOfCredit, String rightOfClaimAcquirersNames,
                              String rightOfClaimAcquirersRegistrationData, Integer rightOfClaimAcquirersTaxpayerID,
                              Integer rightOfClaimAcquirersSocialInsuranceNumber, Date completePerformanceOfObligationsDate) {
        super(segmentTag);
        checkNotNull(memberCode);
        this.memberCode = memberCode;
        checkNotNull(accountNumber);
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        checkNotNull(accountRelationship);
        this.accountRelationship = accountRelationship;
        this.dateAccountOpened = dateAccountOpened;
        this.dateOfLastPayment = dateOfLastPayment;
        this.accountRating = accountRating;
        this.dateAccountRating = dateAccountRating;
        this.dateReported = dateReported;
        this.creditLimit = creditLimit;
        this.balance = balance;
        this.pastDue = pastDue;
        this.nextPayment = nextPayment;
        this.creditPaymentFrequency = creditPaymentFrequency;
        this.mop = mop;
        this.currencyCode = currencyCode;
        this.collateralCode = collateralCode;
        this.dateOfContractTermination = dateOfContractTermination;
        this.datePaymentDue = datePaymentDue;
        this.dateInterestPaymentDue = dateInterestPaymentDue;
        this.interestPaymentFrequency = interestPaymentFrequency;
        this.oldMemberCode = oldMemberCode;
        this.oldAccountNumber = oldAccountNumber;
        this.amountOutstanding = amountOutstanding;
        this.guarantorIndicator = guarantorIndicator;
        this.volumeOfDebtSecuredByGuarantee = volumeOfDebtSecuredByGuarantee;
        this.guaranteeSum = guaranteeSum;
        this.guaranteeTem = guaranteeTem;
        this.bankGuaranteeIndicator = bankGuaranteeIndicator;
        this.volumeOfDebtSecuredByBankGuarantee = volumeOfDebtSecuredByBankGuarantee;
        this.bankGuaranteeSum = bankGuaranteeSum;
        this.bankGuaranteeTem = bankGuaranteeTem;
        this.collateralValue = collateralValue;
        this.collateralDate = collateralDate;
        this.collateralAgreementExpirationDate = collateralAgreementExpirationDate;
        this.overallValueOfCredit = overallValueOfCredit;
        this.rightOfClaimAcquirersNames = rightOfClaimAcquirersNames;
        this.rightOfClaimAcquirersRegistrationData = rightOfClaimAcquirersRegistrationData;
        this.rightOfClaimAcquirersTaxpayerID = rightOfClaimAcquirersTaxpayerID;
        this.rightOfClaimAcquirersSocialInsuranceNumber = rightOfClaimAcquirersSocialInsuranceNumber;
        this.completePerformanceOfObligationsDate = completePerformanceOfObligationsDate;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public Integer getAccountRelationship() {
        return accountRelationship;
    }

    public Date getDateAccountOpened() {
        return dateAccountOpened;
    }

    public Date getDateOfLastPayment() {
        return dateOfLastPayment;
    }

    public Integer getAccountRating() {
        return accountRating;
    }

    public Date getDateAccountRating() {
        return dateAccountRating;
    }

    public Date getDateReported() {
        return dateReported;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getBalance() {
        return balance;
    }

    public String getPastDue() {
        return pastDue;
    }

    public String getNextPayment() {
        return nextPayment;
    }

    public Integer getCreditPaymentFrequency() {
        return creditPaymentFrequency;
    }

    public String getMop() {
        return mop;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public Integer getCollateralCode() {
        return collateralCode;
    }

    public Date getDateOfContractTermination() {
        return dateOfContractTermination;
    }

    public Date getDatePaymentDue() {
        return datePaymentDue;
    }

    public Date getDateInterestPaymentDue() {
        return dateInterestPaymentDue;
    }

    public Integer getInterestPaymentFrequency() {
        return interestPaymentFrequency;
    }

    public String getOldMemberCode() {
        return oldMemberCode;
    }

    public String getOldAccountNumber() {
        return oldAccountNumber;
    }

    public String getAmountOutstanding() {
        return amountOutstanding;
    }

    public String getGuarantorIndicator() {
        return guarantorIndicator;
    }

    public String getVolumeOfDebtSecuredByGuarantee() {
        return volumeOfDebtSecuredByGuarantee;
    }

    public String getGuaranteeSum() {
        return guaranteeSum;
    }

    public Date getGuaranteeTem() {
        return guaranteeTem;
    }

    public String getBankGuaranteeIndicator() {
        return bankGuaranteeIndicator;
    }

    public String getVolumeOfDebtSecuredByBankGuarantee() {
        return volumeOfDebtSecuredByBankGuarantee;
    }

    public String getBankGuaranteeSum() {
        return bankGuaranteeSum;
    }

    public String getBankGuaranteeTem() {
        return bankGuaranteeTem;
    }

    public String getCollateralValue() {
        return collateralValue;
    }

    public Date getCollateralDate() {
        return collateralDate;
    }

    public Date getCollateralAgreementExpirationDate() {
        return collateralAgreementExpirationDate;
    }

    public String getOverallValueOfCredit() {
        return overallValueOfCredit;
    }

    public String getRightOfClaimAcquirersNames() {
        return rightOfClaimAcquirersNames;
    }

    public String getRightOfClaimAcquirersRegistrationData() {
        return rightOfClaimAcquirersRegistrationData;
    }

    public Integer getRightOfClaimAcquirersTaxpayerID() {
        return rightOfClaimAcquirersTaxpayerID;
    }

    public Integer getRightOfClaimAcquirersSocialInsuranceNumber() {
        return rightOfClaimAcquirersSocialInsuranceNumber;
    }

    public Date getCompletePerformanceOfObligationsDate() {
        return completePerformanceOfObligationsDate;
    }
}
