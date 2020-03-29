package chapter_05;

public class ctci_5_1 {
    
    static int fitMN(int n,int  m,int j,int i){
        int allOnes  = ~0;
        int left = allOnes << (j+i);
        int right = (1<<i)-1;
        int mask = left | right;
        int n_cleared = n & mask;
        int m_shifted = m<<i;
        return n_cleared | m_shifted;
    }
    
    public static void main(String args[]){
        int n = 1024;
        int m = 19;
        int start = 6;
        int end = 2;
        System.out.println("M fitted in N is "+fitMN(n,m,start,end));
    }
}