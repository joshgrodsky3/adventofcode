//--- Day 1: Calorie Counting ---
    public static int[] elfCalories(List<String> calorieList){
        int[] calories = new int[calorieList.size()]; 
        int maxIndex=0;
        for(int i=0; i<calorieList.size(); i++){
            int total=0;
            while(calorieList.get(i) != " "){
                total+= Integer.parseInt(calorieList.get(i));
            }
            calories[i] = total;
            if(total> calories[maxIndex]){
                maxIndex = i;
            }
        }
        
        int[] elf = new int[2]{maxIndex, calories[maxIndex]};
        
        return elf;
    }
