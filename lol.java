public class alphabetanimals {
    //get last letter from first word
    //line 2 = int, which is the index of target letter
    //(first letter in the next word)
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //next word in input
        String prev = sc.next();
        int n = sc.nextInt();
        
        ArrayList<String> animals = new ArrayList<>();
        
        for (int i = 0; i<n; i++) {
            animals.add(sc.next());
        }
        
        System.out.println(solve(prev, animals));
    }
    
    public static String solve(String prev, ArrayList<String> animals) {
        String winningWord = getWinning(prev, animals);
        if(winningWord != "") {
            return winningWord + "!";
        }
        for (String animal : animals) {
            if(animal.charAt(0) == getLast(prev)) {
                return animal;
            }
        }
        
        return "?";
    }
    
    
    public static char getLast(String s) {
        return s.charAt(s.length() - 1);
    }
    
    public static String getWinning(String prev, ArrayList<String> animals){ 
        
        HashMap <Character, String> startsWith;
        
        for(String animal : animals) {
        if (animal.charAt(0) == getlast(prev)) {
            for (String animal2 : animals) {
                if (!animal2.equals(animal) && animal2.charAt(0) == getLast(animal)){
                    return animal2;
                    }
                }
            }
        }
    } 

}



