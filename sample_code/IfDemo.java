public class IfDemo {

    // Plato defined "man" as a bipedal animal without feathers.
    // This code will help us determine whether something is a man
    // according to Plato.
    // It could, of course, also be a bird or a griffin.
    
    // Note that Diogenes of Sinope later came to Plato's Symposium
    // holding a plucked chicken and saying "Behold Plato's Man!"
    
    public static void main(String[] args) {

	// || is OR
	// && is AND
	// ! is NOT
	// Note - you can use ^ for XOR but it's technically a bitwise
	// operator, so some people may look at your code askew.
	// You can always do (a && !b) || (!a && b) instead
	
	boolean hasFeathers = true;
	boolean hasTwoLegs = true;

	if (hasFeathers || hasTwoLegs) {
	    System.out.println("It could be either a griffin or a bird.");
	} else {
	    System.out.println("It's not a griffin or a bird.");
	}
	
	if (hasFeathers && hasTwoLegs) {
	    System.out.println("it's a bird");
	} else {
	    System.out.println("it's not a bird");
	}

	if (hasFeathers && !hasTwoLegs) {
	    System.out.println("it's a griffin");
	} else {
	    System.out.println("it's not a griffin");
	}


	if (!hasFeathers && hasTwoLegs) {
	    System.out.println("Behold Plato's man!");
	} else {
	    System.out.println("It's not a man.");
	}   

    }

}