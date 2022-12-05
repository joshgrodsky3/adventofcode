//--- Day 5: Supply Stacks ---    
public static void supplyStacks(List<Stack> stackList, List<String> procedure){
        for(int i=0; i<procedure.size(); i++){
            String[] splitStr = procedure.get(i).split(" ");
            
            int numMove = Integer.parseInt(splitStr[1]);
            Stack fromStack = stackList.get(Integer.parseInt(splitStr[3]));
            Stack toStack = stackList.get(Integer.parseInt(splitStr[5]));
            
            for(int j=0; j<numMove; j++){
                toStack.push(fromStack.pop());
            }
        }
        //outputter loop
        for(int i=0; i<stackList.size(); i++){
            System.out.print(i + " ");
            System.out.println(stackList.get(i).peek());
        }
    }
