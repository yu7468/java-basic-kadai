package JavaKadai;
import java.util.HashMap;
public class Dictionary_Chapter20 {

		//英語単語と意味のHashMap
		HashMap<String,String> dictionary = new HashMap<String,String>();
		//キーと値を入力
		public void fruitList() {
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
		}
		
		//検索の準備
		private String searchWord;
		public void setSearchWord(String searchWord) {
			this.searchWord = searchWord;
		}
		
		//辞書にあるかチェック＆通訳
		public void searchDic() {
		String meaning = dictionary.get(searchWord);
		if(dictionary.containsKey(searchWord)) {
			System.out.println(searchWord + "の意味は" + meaning);
		}else {
			System.out.println(searchWord + "は辞書に存在しません");
		}
		}
		
		
		
	

	
}
