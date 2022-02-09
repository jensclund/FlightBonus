import java.time.LocalDate;

/**
 * The class BonusMember
 * Represents a member of the airlines bonus points program.
 *
 * @author jensl
 */
public class BonusMember {
    private final int memberNumber;
    private final LocalDate enrolledDate;
    private int bonusPointsBalance = 0;
    private String name;
    private String eMailAddress;
    private String password;
    private Membership membership;

    private static final int SILVER_LIMIT = 25000;
    private static final int GOLD_LIMIT = 75000;

    /**
     * Instantiates a new Bonus member.
     *
     * @param memberNumber The member number
     * @param enrolledDate The date the member enrolled in the bonus points program
     * @param name         The name of the member
     * @param eMailAddress The e-mail address of the member
     * @param password     The password for the members account
     */
    public BonusMember(int memberNumber, LocalDate enrolledDate, String name, String eMailAddress, String password) {
        this.memberNumber = memberNumber;
        this.enrolledDate = enrolledDate;
        this.name = name;
        this.eMailAddress = eMailAddress;
        this.password = password;

        checkAndSetMembership();
    }

    /**
     * Method for checking the members password
     *
     * @param password The password to be checked
     * @return A boolean, returns true if the passwords are equal, false otherwise
     */
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    /**
     * Method for checking and setting the membership of a member
     *
     */
    private void checkAndSetMembership() {
        if(this.bonusPointsBalance >= GOLD_LIMIT) {
            membership = new GoldMembership();
        } else if(this.bonusPointsBalance >= SILVER_LIMIT) {
            membership = new SilverMembership();
        } else {
            membership = new BasicMembership();
        }
    }

    /**
     * A method for registering bonus points
     * by using the registerPoints method from the Membership class
     *
     * Also sets the membership of the member accordingly
     *
     * @param newPoints The new points to be registered
     */
    public void registerBonusPoints(int newPoints) {
        this.membership.registerPoints(this.bonusPointsBalance, newPoints);
        checkAndSetMembership();
    }

    /**
     * Gets member number.
     *
     * @return the member number
     */
    public int getMemberNumber() {
        return memberNumber;
    }

    /**
     * Gets enrolled date.
     *
     * @return the enrolled date
     */
    public LocalDate getEnrolledDate() {
        return enrolledDate;
    }

    /**
     * Gets bonus points balance.
     *
     * @return the bonus points balance
     */
    public int getBonusPointsBalance() {
        return bonusPointsBalance;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets mail address.
     *
     * @return the mail address
     */
    public String geteMailAddress() {
        return eMailAddress;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }




}
