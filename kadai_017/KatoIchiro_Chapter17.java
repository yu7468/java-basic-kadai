package JavaKadai;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public void execIntroduce() {
		System.out.println("名前は" + familyName + this.givenName + "です");
		System.out.println("住所は" + address + "です");
		eachIntroduce();
	}
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです" + "\n");
	}
}
