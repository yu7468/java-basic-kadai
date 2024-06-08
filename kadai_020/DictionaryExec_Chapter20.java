package JavaKadai;

public class DictionaryExec_Chapter20 {
	public static void main(String[] args) {
		
		//初期化
		Dictionary_Chapter20 transWord = new Dictionary_Chapter20();
		transWord.fruitList();
		
		//順番に検索結果を出す
		String[] inputWord = {"apple", "banana", "grape", "orange"};
		for (int i=0; i<inputWord.length; i++) {
			transWord.setSearchWord(inputWord[i]);
			transWord.searchDic();
		}
	}

}
