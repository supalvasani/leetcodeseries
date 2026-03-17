public class containerwithwater {
     public int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1;
        int currentVolume = 0;
       
        while(j>i){
            int h = Math.min(height[i],height[j]);
            int w = j-i;
            currentVolume = Math.max(currentVolume, (h*w));
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return currentVolume;
    }
}
