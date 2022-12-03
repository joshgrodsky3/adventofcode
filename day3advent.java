//SOURCE: https://adventofcode.com/2022/day/3

public class Main {
    
    public static int prioritySum(List<String> sList){
        int sum = 0;
        System.out.println( (int) 'p');
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
            //String uppercase = lowercase.toUpperCase();
        
        for(String s : sList){
            String first = s.substring(0, s.length()/2);
            String second = s.substring(s.length()/2, s.length());
            HashSet<Character> charSet = new HashSet<>();
            //add each character to set from first rucksack
            for(int i=0; i<first.length(); i++){
                charSet.add(first.charAt(i));
            }
            
            //check if set contains for second rucksack
            for(int i=0; i<second.length(); i++) {
                if(charSet.contains(second.charAt(i))){
                    System.out.println(second.charAt(i));
                    charSet.remove(second.charAt(i));
                    //check if upper or lower
                    if(lowercase.indexOf(second.charAt(i)) > 0){
                        System.out.println((int) second.charAt(i) - 'a'+1);
                        sum+= (int) second.charAt(i) - 'a'+1;
                    }
                    else{
                        System.out.println((int) second.charAt(i) - 'A'+27);
                        sum+= (int) second.charAt(i) - 'A'+27;
                    }
                }
            }    
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("vJrwpWtwJgWrhcsFMMfFFhFp");
        llist.add("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");
        llist.add("PmmdzqPrVvPwwTWBwg");
        llist.add("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn");
        llist.add("ttgJtRGJQctTZtZT");
        llist.add("CrZsJsPPZsGzwwsLwLmpwMDw");
        System.out.println(prioritySum(llist));
    }
}
