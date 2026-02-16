import java.util.Arrays;

class Main{
    public static void main(String[] args) {

        System.out.println(highAndLow("1 2 3 4 5"));
        
    }

    public static String highAndLow(String numbers) {

        String result = "";

        String[] stringArr = numbers.split(" ");
        
        // 2. int massivi yaradırıq
        int[] intArray = new int[stringArr.length];
        
        // 3. String-ləri int-ə çeviririk
        for (int i = 0; i < stringArr.length; i++) {
            intArray[i] = Integer.parseInt(stringArr[i]);
        }


        Arrays.sort(intArray);
        result = Integer.toString(intArray[intArray.length - 1]) + " " + Integer.toString(intArray[0]);
        
        return result;
    }
    
}