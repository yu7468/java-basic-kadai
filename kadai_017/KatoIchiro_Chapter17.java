package JavaKadai;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	public void setGivenName() {
		this.givenName = "一郎";
	}
	public void execIntroduce() {
		System.out.println("名前は" + familyName + this.givenName + "です");
		commonIntroduce();
		eachIntroduce();
	}
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです" + "\n");
	}
}
