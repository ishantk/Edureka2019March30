package co.edureka.packtwo;

// We can import the class so as to use it 
import co.edureka.packone.One;   // public is accessible outside the package
//import co.edureka.packone.Two; // error : default means only within the package and not outside the package
//import co.edureka.packone.*; // imports all the public classes

// Inheritance across package.
// Child can access only public and protected members and not private or default
class CA extends One{
	
	void show(){
		protShow(); 	 	// inherited/ accessible i.e. access it internally as it behaves as private after inheritance
		//defShow();	 	// not inherited/ accessible
		//pvtShow(); 		// not inherited/ accessible
	}
	
}

public class App {

	public static void main(String[] args) {

		//One oRef = new One();
		//oRef.pvtShow();  // private isnt accessible outside the class. this is outside the package !!
		//oRef.defShow();  // default isnt accessible outside the package
		//oRef.protShow(); // protected isnt accessible outside the package
		//oRef.pubShow();    // public is accessible anywhere and everywhere
		
		CA cRef = new CA();
		cRef.pubShow();
		//cRef.protShow(); // this is an error as protected access will be like private after inheritance
		cRef.show();
		
	}

}

// VISIBILITY:
// 1. private is only within the class
// 2. default and protected is only within the package
//    2.1 default is not inherited outside the package, but protected is inherited outside the package abd after that it behaves like private
// 3. public is within and outside the package





