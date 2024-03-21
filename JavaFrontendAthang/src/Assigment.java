public class Assigment {

    public static void main(String[] args){
//        firstQue();
//        secondQue();
//        thirdQue();
        fourthQue();
//        fifthQue();
    }
    public static void firstQue(){
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9)%9);
        System.out.println(20+(-3)*5/8);
        System.out.println(5+15/3*2-8%3);
    }

    public static void secondQue(){
        System.out.println(" +\"\"\"\"\"\"\"+ ");
        System.out.println(" [| o o |] ");
        System.out.println("  |  ^  |");
        System.out.println("  | '_' |");
        System.out.println("  _______");
    }

    public static void thirdQue(){
        System.out.println("Divided by 3");
        for(int i = 1; i<=100; i++){
            if(i%3 == 0){
                System.out.print(i+ " ");
                }
        }
        System.out.println();
        System.out.println("Divided by 5");
        for(int i = 1; i<=100; i++){
            if(i%5 == 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        System.out.println("Divided by 3 and 5");
        for(int i= 1; i<=100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.print(i+ " ");
            }
        }
    }

    public static void fourthQue(){
        String[] words = { "Cat", "Flag", "Green", "Test", "Athang"};
        String[] words2 = { "cat", "dog", "red", "is", "am"};

        int index = 0;
        int length = 0;
        for(int i=0; i<words.length; i++){
            if(words[i].length() > length){
                length = words[i].length();
                index = i;
            }
        }
        System.out.println("@@@ First condition ----- The longest word is "+ words[index]);

        for(int i=0; i<words2.length; i++){
            if(words2[i].length() > length){
               length = words2[i].length();
            }
        }

        for(int i=0; i<words2.length; i++){
            if(words2[i].length() == length){
                System.out.print(words2[i]+ " ");
            }
        }
    }


    public static void fifthQue(){
        int[] zeroArr = {0, 3, 4, 0, 1, 2, 5, 0};

        int counter = 1;
        for(int i=0; i<zeroArr.length; i++){
            if(zeroArr[i] == 0){
                if(zeroArr[zeroArr.length - counter] == 0){
                    zeroArr[zeroArr.length - counter] = zeroArr[i];
                    counter++;
                }
            }
        }
        for(int i : zeroArr){
            System.out.print(i+ " ");
        }
    }
}
