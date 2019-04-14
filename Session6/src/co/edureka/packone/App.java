package co.edureka.packone;

public class App {

	public static void main(String[] args) {
			
		One oRef = new One();
		//oRef.pvtShow(); // private isnt accessible outside the class
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		
		Two tRef = new Two();
		//tRef.pvtShow(); // private isnt accessible outside the class
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();

	}

}
