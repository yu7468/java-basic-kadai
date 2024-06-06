package JavaKadai;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean[] judge = new boolean[101];
		//配列初期化
		for(int i = 2; i < 101; i++) {
			judge[i] = true;
		}
		//非素数判定
		for(int j = 2; j < 101; j++) {
			for(int k = 2; k*k <= j; k++) {
				if(j % k == 0) {
					judge[j] = false;
					break;
				}
			}
		}
		// 素数を出力
        for (int i = 2; i < 101; i++) {
            if (judge[i]) {
                System.out.println(i);
            }
        }
	}

}
