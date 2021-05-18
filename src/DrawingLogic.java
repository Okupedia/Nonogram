public class DrawingLogic {
    public static void main(String args[]){
        int[][] c = {
                {0, 0, 0, 1, 1, 0, 1, 1, 1, 1},
                {0, 1, 0, 0, 1, 0, 1, 1, 0, 1},
                {1, 0, 1, 1, 1, 0, 1, 1, 1, 0},
                {1, 1, 0, 1, 0, 0, 0, 1, 1, 1},
                {0, 1, 1, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 0, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 0, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 0, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 0, 1, 1, 1, 1}
        };
        int[] thisLine = new int[10];
        int[][] result = new int[10][10];

        //xについての処理
        for(int j = 0; j<10; j++){
            for(int i = 0; i<10; i++){
                thisLine[i] = c[j][i];
            }
            result[j] = checkLines(thisLine);

            for(int i = 0 ; i<10; i++){
                System.out.print(" ");
                System.out.print(thisLine[i]);

            }
            System.out.print(" || ");
            for(int i = 0 ; i<10; i++){
                System.out.print(" ");
                System.out.print(result[j][i]);
            }
            System.out.println("");
        }

        System.out.println(" = = = = = = = = = =");

        //yについての処理
        for(int i = 0; i <10; i++){
            for(int j = 0; j<10; j++){
                thisLine[j] = c[j][i];
            }
            result[i] = checkLines(thisLine);
        }
        for(int i = 0; i <10; i++){
            for(int j = 0; j<10; j++){
                System.out.print(" ");
                System.out.print(result[j][i]);
            }
            System.out.println("");
        }
         
    }

    static int[] checkLines(int line[]){
        int[] result = new int[10];
        int resultCount = 0;
        int currentNum = line[0];

        for(int i = 0; i < 10; i++){
            if(line[i] == currentNum){
                result[resultCount]++;
            }else{
                currentNum = line[i];
                resultCount++;
                result[resultCount]++;
            }
        }

        return result;
    }
}
