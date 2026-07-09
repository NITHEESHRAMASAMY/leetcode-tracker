// Last updated: 7/9/2026, 11:49:20 AM
class Solution {
    public String trafficSignal(int timer) {
            if(timer==0)
            return "Green";
            else if(timer==30){
                return "Orange";
            }
            else if(timer>30 && timer<=90){
                return "Red";
            }
            else 
                return "Invalid";
            
    }
}