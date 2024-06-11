public class Main {
    //Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

    public static void main(String[] args) {

        int[] numbersForTesting={1,2,3,4,5,6,7,8,9};
        //TASK 1
        System.out.println(differenceBetweenValues(numbersForTesting));
        //TASK 2
        twoSmallestNums(numbersForTesting);
        //TASK 3
        System.out.println(equationSolver(7,6)); //Solution: 53.84


    }

    //TASK 1
    /* Write a Java method that returns the difference
    between the largest and smallest values in an array
    of integers. The length of the array must be at least 1.
    */

    static int differenceBetweenValues(int [] nums){
        if (nums.length<1) return -1;

        int smallest=nums[0];
        int largest=nums[0];


        for(int i=0;i<nums.length;i++){
            if(nums[i]<smallest) smallest=nums[i];
            else if(nums[i]>largest) largest=nums[i];
        }

        return largest-smallest;
    }

    //TASK 2
    /* Write a Java method that finds the smallest and
    second smallest elements of a given array and prints
    them to the console.
    */

    static void twoSmallestNums(int[] nums) {
        if (nums.length < 2) {
            return;
        }

        int smallest = Math.min(nums[0], nums[1]);
        int secondSmallest = Math.max(nums[0], nums[1]);

        for (int i=2; i<nums.length; i++) {
            if (nums[i]<smallest) {
                secondSmallest=smallest;
                smallest=nums[i];
            } else if (nums[i]<secondSmallest && nums[i]!= smallest) {
                secondSmallest = nums[i];
            }
        }

        System.out.println("The smallest element of the given array is " + smallest);
        System.out.println("The second smallest element of the given array is " + secondSmallest);
    }

    //TASK 3
    /* Write a Java method that calculates the result of
    the following mathematical expression, where x and y
    are two variables that have been pre-set in your code.
    */

    static double equationSolver(double x, double y){

        return (Math.pow(x,2)+Math.pow((4*(y/5)-x),2));
    }
}
