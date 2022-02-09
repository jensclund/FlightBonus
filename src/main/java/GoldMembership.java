
/**
 * The Gold membership level.
 *
 * @author jensl
 */
public class GoldMembership extends Membership {
    private final float POINTS_SCALING_FACTOR_1 = 1.3f;
    private final float POINTS_SCALING_FACTOR_2 = 1.5f;


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
        if(bonusPointsBalance > 90000) {
            return Math.round(bonusPointsBalance + (newPoints * this.POINTS_SCALING_FACTOR_2));
        } else {
            return Math.round(bonusPointsBalance + (newPoints * this.POINTS_SCALING_FACTOR_1));
        }
    }

    /**
     * Gets membership name of the current level of the membership.
     *
     * @return The name of the membership
     */
    @Override
    public String getMembershipName() {
        return "Gold";
    }
}
