class Solution {
    public boolean isRobotBounded(String instructions) {
        int x =0;
        int y =0;
        int dir =0;
        for(char ch: instructions.toCharArray()){
            if(ch == 'G'){
                // move in current direction
                if(dir == 0){
                    y++;
                }else if(dir == 1){
                    x++;
                }else if(dir == 2){
                    y--;
                }else{
                    x--;
                }
            }else if(ch == 'L'){
                dir =(dir+3)%4; // turn left
            }else{
                dir =(dir+1)%4; // turn right
            }
        }
        // if back at start or not facing North/
        return (x == 0 && y == 0) || dir != 0;
    }
}