package leetcode;

class Container {
    public int maxArea(int[] height) {
        int max_area = Integer.MIN_VALUE;
        int curr_area = 0;
        int i = 0,j = height.length-1;
        while(i<j){
            curr_area = Math.min(height[i] , height[j])*(j-i);
            max_area = Math.max(curr_area , max_area);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max_area;
    }
}

public class ContainerWithMostWater {
    public static void main(String[] args) {

        Container obj = new Container();

        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(obj.maxArea(height)); // 49
    }
}
