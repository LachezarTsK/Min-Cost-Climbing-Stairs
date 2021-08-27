public class Solution {

    public int minCostClimbingStairs(int[] cost) {

        if (cost.length == 1) {
            return cost[0];
        }

        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }

        int[] climbingCost = new int[cost.length];
        climbingCost[0] = cost[0];
        climbingCost[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            climbingCost[i] = cost[i] + Math.min(climbingCost[i - 1], climbingCost[i - 2]);
        }

        return Math.min(climbingCost[cost.length - 1], climbingCost[cost.length - 2]);
    }

}
