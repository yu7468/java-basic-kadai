package JavaKadai;

public abstract class Kato_Chapter17 {
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区〇×";
	
	
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName +"です");
		System.out.println("住所は" + address + "です");
	};
	abstract public void eachIntroduce();
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	};

}
