package JavaKadai;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	public void execIntroduce() {
		System.out.println("名前は" + familyName + this.givenName + "です");
		commonIntroduce();
		eachIntroduce();
	}
	
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です"+ "\n");
	}
}
