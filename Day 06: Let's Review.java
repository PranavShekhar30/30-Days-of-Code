 public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        s.nextLine();
         
        for(int i=0; i<N; i++){
            String S = s.nextLine();
            char[] charArray = S.toCharArray();
            
            for(int j=0; j<charArray.length; j++){
                if(j%2 == 0){
                    System.out.print(charArray[j]);
                }
            }
            System.out.print(" ");
             for (int j = 0; j < charArray.length; j++) {
                if (j % 2 != 0) {
                    System.out.print(charArray[j]);
                }
            }

            System.out.println();
        
        }
    }
}
