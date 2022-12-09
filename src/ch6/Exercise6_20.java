

class Exercise6_20
{
    static int[] shuffle(int[] arr){
        int temp = 0;
        int randomIdx = 0;
        for(int i = 0; i < arr.length; i++){
            randomIdx = (int)(Math.random() * arr.length);
            temp = arr[randomIdx];
            arr[randomIdx] = arr[0];
            arr[0] = temp;
        }
        
        return arr; 
    }
    public static void main(String[] args)
    {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}

// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// [4, 6, 8, 3, 2, 9, 7, 1, 5]