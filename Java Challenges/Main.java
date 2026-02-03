
class Main {

    // Challenge 1: Find Maximum
    public Integer maximum(Integer[] numList) {

        Integer result = numList[0];

        for (Integer integer : numList) {
            if (integer >= result) {
                result = integer;
            }
        }

        return result;
    }

    // Challenge 2: Print number in words
    public String printNumberInWord(int num) {

        String result = null;

        if ( num>9){
           result = "OTHER";
        }
        else{
            switch (num) {
                case 1:
                    result = "ONE";
                    break;
                case 2:
                    result = "TWO";
                    break;
                case 3:
                    result = "THREE";
                    break;
                case 4:
                    result = "FOUR";
                    break;
                case 5:
                    result = "FIVE";
                    break;
                case 6:
                    result = "SIX";
                    break;
                case 7:
                    result = "SEVEN";
                    break;
                case 8:
                    result = "EIGHT";
                    break;                
                case 9:
                    result = "NINE";
                    break;                
            }
        }
        return result;
    }

    //Challenge 3: Check Odd/Even
    public void checkOddEven (int num) { 
        if (num % 2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd number");
        }
    }

    //Challenge 4: Calculate the average
    public double average(Integer[] numList) { 

        double result = 0;

        for (Integer integer : numList) {
            result += integer;
        }
        result/= numList.length;

        return result;
    }





}