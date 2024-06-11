package JavaKadai;

import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	Scanner scanner = new Scanner(System.in);
	String myChoice = "";
	String comChoice = "";
	String[] jyanken = {"r", "s", "p"};
	
	public String getMyChoice() {
	    //正しいじゃんけん入力を判断
		boolean validInput = false;
		while(!validInput) {
			System.out.println("自分のじゃんけんの手を入力しましょう\n"
					+ "グーはrockのrを入力しましょう\n"
					+ "チョキはscissorsのsを入力しましょう\n"
					+ "パーはpaperのpを入力しましょう");
			myChoice= scanner.next();
			 for (String choice : jyanken) {
			        if (myChoice.equals(choice)) {
			            validInput = true;
			            System.out.println(myChoice);
			            break;
			        }
			    }
			 if (!validInput) {
			        System.out.println("エラー！正しい入力してください");
			    }
				//自分の入力を漢字で取得
				switch(myChoice) {
				case "r":
					System.out.print("自分の手はグー,");
					break;
				case "s":
					System.out.print("自分の手はチョキ,");
					break;
				case "p":
					System.out.print("自分の手はパー,");
					break;
				}
		}
		return myChoice;

	};
	
	//相手のじゃんけん
	public String getRandom() {
		Random random = new Random();
        int num = random.nextInt(3);
 
        //相手の入力を漢字で取得
        	switch(num) {
        	case 0:
        		System.out.println("対戦相手の手はグー");
        		comChoice = "r";
        		break;
        	case 1:
        		System.out.println("対戦相手の手はチョキ");
        		comChoice = "s";
        		break;
        	case 2:
        		System.out.println("対戦相手の手はパー");
        		comChoice = "p";
        		break;
        	}
        return comChoice;
	};

	//じゃんけんゲーム結果を比較
	public void playGame(String myChoice, String comChioce) {
		if (myChoice.equals(comChoice)) {
			System.out.println("あいこです");
		}else if ((myChoice.equals("r") && comChoice.equals("s")) ||
                  (myChoice.equals("s") && comChoice.equals("p")) ||
                  (myChoice.equals("p") && comChoice.equals("r"))) {
         System.out.println("自分の勝ちです");
     } else {
         System.out.println("自分の負けです");
     }
		
	}
	

}
