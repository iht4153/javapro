package test;

public class TestLotto {
    public static void main(String[] args) {
		lotto();
	}
	public static void lotto() {
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] =(int)(Math.random() * 45) + 1;		//0.0 <= Math.random && Math.random < 1.0
					
			
			
//			for(int j=0; j<i; j++) {
//				if(lotto[j] == lotto[i]) {
//					i--;
//					break;
//				}
//			}
		}
		
		System.out.print("로또 번호는 ?? :: ");
		for(int i=0; i<lotto.length; i++) {
			System.out.print("[" + lotto[i] + "]  ");
		}
	}
}