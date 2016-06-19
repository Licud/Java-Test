package myarraypkg;

/**
 * Created by Mikron.Licud on 16/06/2016.
 */
public class ArrayPivots {

    /*
    * Finding the pivot point with an O(n) complexity.
    * */
    public boolean evaluateArray(int[] myIntArray){
        boolean hasTwoEqualSums = false;

        int firstIndex = 0;
        int secondIndex = myIntArray.length - 1;
        int firstTotal = myIntArray[firstIndex];
        int secondTotal = myIntArray[secondIndex];;
        int possibleNumberOfPivotPoints = (secondIndex - firstIndex)-1;

        while((possibleNumberOfPivotPoints >= 1) && !hasTwoEqualSums){

            if(firstTotal < secondTotal){
                firstIndex++;
                firstTotal += myIntArray[firstIndex];
            }else if(firstTotal > secondTotal){
                secondIndex--;
                secondTotal += myIntArray[secondIndex];
            }else if( firstTotal == secondTotal){
                // Check if there is still more than 1 possible pivot point

                if(possibleNumberOfPivotPoints > 1){
                    firstIndex++;
                    firstTotal += myIntArray[firstIndex];
                }else{
                    hasTwoEqualSums = true;
                }
            }

            possibleNumberOfPivotPoints = (secondIndex - firstIndex)-1;
        }

        return hasTwoEqualSums;
    }

}
