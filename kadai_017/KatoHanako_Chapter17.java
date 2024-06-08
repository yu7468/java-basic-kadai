package JavaKadai;

public class KatoHanako_Chapter17 extends Kato_Chapter17 {
	public void setGivenName() {
		this.givenName = "花子";
	}
	public void execIntroduce() {
		System.out.println("名前は" + familyName + this.givenName + "です");
		commonIntroduce();
		eachIntroduce();
	}
	
	public void eachIntroduce() {
		System.out.println("趣味は読書です"+ "\n");
	}

}
