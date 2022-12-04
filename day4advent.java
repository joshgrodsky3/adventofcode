    // Day 4: Camp Cleanup 

public static int overlappedElves(List<String> sList){
    /*  2-4,6-8
        2-3,4-5
        5-7,7-9
        2-8,3-7
        6-6,4-6
        2-6,4-8
    */
        int overlapped = 0;
        
        for(int i=0; i<sList.size(); i++){
            String assign1 = sList.get(i);
            String assign2 = sList.get(++i);
            int middle1 = assign1.indexOf('-');
            int middle2 = assign2.indexOf('-');
            
            int first = Integer.parseInt(assign1.substring(0, middle1));
            int second = Integer.parseInt(assign1.substring(middle1, assign1.length()));
            int third = Integer.parseInt(assign2.substring(0, middle2));
            int fourth = Integer.parseInt(assign2.substring(middle2, assign2.length()));
                                          
            if(first > third && second < fourth){
                overlapped++;
            }
            else if(third > first && fourth < second){
                overlapped++;
            }
            
            
        }
        
        return overlapped;
    }
