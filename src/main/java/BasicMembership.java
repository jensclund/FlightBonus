
/**
 * The Basic membership level.
 *
 * @author jensl
 */
public class BasicMembership extends Membership {

    /**
     * Method for calculating a new balance for bonus points accumulated by the member.
     * Apply membership bonus to calculation.
     *
     * @param bonusPointsBalance The current bonus points balance
     * @param newPoints          New points to register.
     * @return The new bonus points balance.
     */
    @Override
    public int registerPoints(int bonusPointsBalance, int newPoints) {
        return bonusPointsBalance + newPoints;
    }
    /**
     * Gets membership name of the current level of the membership.
     *
     * @return The name of the membership
     */
    @Override
    public String getMembershipName() {
        return "Basic";
    }
}
