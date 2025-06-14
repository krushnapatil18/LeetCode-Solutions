class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int ple[] = new int[n];
        int nle[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        //ple
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            ple[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Next Less Element
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nle[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        long sum = 0;
        int mod = (int) 1e9+7;

        for(int i = 0; i<n;i++){
            long left = i-ple[i];
            long right = nle[i]-i;
            sum = (sum + (arr[i] * left * right) % mod) % mod;
        }
        return  (int) sum;
    }
}