class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        List<Integer> st = new ArrayList<>();
        int n = asteroids.length;

        for(int i=0; i<n; i++){
            int k = asteroids[i];

            if(k>0){
                st.add(k);
            }
            else{
                while (!st.isEmpty() && st.get(st.size() - 1) > 0 && st.get(st.size() - 1) < -k) {
                    st.remove(st.size() - 1);
                }
                if (!st.isEmpty() && st.get(st.size() - 1) == -k) {
                    st.remove(st.size() - 1);
                } else if (st.isEmpty() || st.get(st.size() - 1) < 0) {
                    st.add(k);
                }

            }
        }
        int[] result = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            result[i] = st.get(i);
        }
        return result;
    }
}