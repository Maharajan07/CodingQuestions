class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        int max = arr[n-1];
        
        res.add(max);
        
        for (int i=n-2; i>=0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                res.add(max);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>(); 
        
        for (int i=res.size()-1; i>=0; i--) {
            ans.add(res.get(i));
        }
        return ans;
        
    }
}


/*  Instead of creating ans and reversing manually,
    imply use: Collections.reverse(res); 
               return res;
*/