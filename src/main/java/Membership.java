/**
 * The Superclass Membership.
 *
 * @author jensl
 */
public abstract class Membership {

    /**
     * Method for calculating a new balance for bonus points accumulated by the member.
     * Apply membership bonus to calculation.
     *
     * @param bonusPointsBalance The current bonus points balance
     * @param newPoints          New points to register.
     * @return The new bonus points balance.
     */
    public abstract int registerPoints(int bonusPointsBalance, int newPoints);

    /**
     * Gets membership name of the current level of the membership.
     *
     * @return The name of the membership
     */
    public abstract String getMembershipName();

}
