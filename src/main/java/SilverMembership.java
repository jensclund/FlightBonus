
/**
 * The Silver membership level.
 *
 * @author jensl
 */
public class SilverMembership extends Membership{
    private final float POINTS_SCALING_FACTOR = 1.2f;

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
        return Math.round(bonusPointsBalance + (newPoints * this.POINTS_SCALING_FACTOR));
    }

    /**
     * Gets membership name of the current level of the membership.
     *
     * @return The name of the membership
     */
    @Override
    public String getMembershipName() {
        return "Silver";
    }
}
