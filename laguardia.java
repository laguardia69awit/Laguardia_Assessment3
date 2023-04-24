package april19;

import java.util.Scanner;
public class laguardia {

	public static void selection() {

		System.out.println("A - SQUARE, B - LeftTriangle, C - Inverted Left Half Triangle, D - Left Hollow Triangle");
		System.out.println("E - Right Triangle, F - Inverted Right Triangle, G - Right Hollow Triangle, H - Inverted Right Hollow Triangle");
		System.out.println("I - Right Hollow Triangle, J - Inverted Right Hollow Triangle, K - Full Triangle, L - , Inverted Full Triangle");
		System.out.println("M - Full Hollow Triangle, N - inverted Full Hollow Triangle, O - Half Left Diamond");
		Scanner sc = new Scanner(System.in);
		System.out.print("select: ");
		String select = sc.next().toUpperCase();
		
		
		int size;
		System.out.println("figure: ");
		while(!sc.hasNextInt()) {
			System.out.println("INVALID INPUT, TRY AGAIN.");
			sc.next();
		}

		
		size = sc.nextInt();	

		switch (select) {
		
		case "A":
			System.out.println(Square(size));
			break;
		case "B":
			System.out.println(LefthalfTriangle(size));
			break;
		case "C":
			System.out.println(invertedLeftHafTriangle(size));
			break;
		case "D":
			System.out.println(LeftHollowHalfTriangle(size));
			break;
		case "E":
			System.out.println(RightTriangle(size));
			break;
		case "F":
			System.out.println(invertedRightHalfTriangle(size));
			break;
		case "G":
			System.out.println(RightHollowHalfTriangle(size));
			break;
		case "H":
			System.out.println(invertedRightHollowHalfTriangle(size));
			break;
		case "I":
			System.out.println(fullTriangle(size));
			break;
		case "J":
			System.out.println(invertedFullTriangle(size));
			break;
		case "K":
			System.out.println(fullHollowTriangle(size));
			break;
		case "L;":
			System.out.println(invertedFullHollowTriangle(size));
			break;
		case "M":
			System.out.println(halfLeftDiamond(size));
			break;
		case "N":
			System.out.println(halfRightDiamond(size));
			break;
		case "O":
			break;
			default:
			System.out.println("NULL");
			
		}
	}
	
	
	public static void main(String[] args) {
		
		selection();

		}
		
	
	public static String Square(int n) {

		String figure = "";
	for (int r = 1; r <=n; r++) {
	
		for (int c = 1; c <=n; c++) {
			figure += "* ";
		}	
		
		figure += "\n";
	}
	
	return figure;
}	
	public static String LefthalfTriangle(int n) {

		String figure = "";
        for(int r=1; r<=n; r++){
        	
        }
            for(int c=1; c<=n; c++){
                figure += "* ";
                
            figure += "\n";
            } 
            
            return figure;
	}
		
	public static String invertedLeftHafTriangle(int n) {
		
		String figure = "";
		for(int r=n; r>=1; r--){
			
            for(int c=1; c<=r; ++c){
               figure +="* ";
            }
            figure +="\n";
        }
		return figure;
	}
	
public static String LeftHollowHalfTriangle(int n) {
	
	String figure = "";
    for(int r=1; r<=n; r++){
    
        for(int c=1; c<=r; ++c){
            if(c==1 || r==n || c==r){
               	figure += "* ";
            } else {
               figure += "  ";
            }
        }
        figure += "\n";
    }
	return figure;
}		
	

public static String invertedLeftHollowHalfTriangle(int n){
	String figure = "";
	for(int r=n; r>=1; r--){
        for(int c=1; c<=r; ++c){
            if(c==1 || r==n || c==r){
                figure += "* ";
            } else {
                figure += "  ";
            }
        }
        figure += "\n";
    }
    
	return figure;
}


public static String RightTriangle(int n) {
	
	String figure = "";
    for(int r=1; r<=n; r++){
        for(int c=1; c<=n; ++c){
            figure += "* ";
        }
        figure += "\n";
    }
    return figure;
}


public static String invertedRightHalfTriangle(int n) {
	String figure = "";
	 for(int r=n; r>=1; r--){
         for(int s=n; s>=r; s-=1){
        	 figure += "  ";
         }
         for(int o=1; o<=r; ++o){
        	 figure += "* ";
         }
         figure += "\n";
     }
	 return figure;
}

public static String RightHollowHalfTriangle(int n) {
	String figure = "";
	 for(int r=1; r<=n; r++){
         for(int s=n; s>=r; s-=1){
        	 figure += "  ";
         }
         for(int o=1; o<=r; ++o){
             if(o==1 || r==n || o==r){
            	 figure += "* ";
             } else {
            	 figure += "  ";
             }
         }
         figure += "\n";
     }
	 return figure;
}
	
public static String invertedRightHollowHalfTriangle(int n) {
	String figure = "";
	for(int r=n; r>=1; r--){
        for(int s=n; s>=r; s-=1){
        	figure += "  ";
        }
        for(int o=1; o<=r; ++o){
            if(o==1 || r==n || o==r){
            	figure += "* ";
            } else {
            	figure += "  ";
            }
        }
        figure += "\n";
    }
	return figure;
}

public static String fullTriangle(int n) {
	
	String figure = "";
	for(int r=1; r<=n; r++){
        for(int s=n; s>=r; s-=1){
        	figure += "  ";
        }
        for(int o=1; o<=r*2-1; ++o){
        	figure += "* ";
        }
        figure += "\n";
    }
	return figure;
}
	
public static String invertedFullTriangle(int n) {
	String figure = "";
	 for(int r=n; r>=1; r--){
         for(int s=n; s>=r; s-=1){
        	 figure += "  ";
         }
         for(int o=1; o<=r*2-1; ++o){
        	 figure += "* ";
         }
         figure += "\n";
     }
	 return figure;
}

public static String fullHollowTriangle(int n) {
	String figure = "";
	for(int r=1; r<=n; r++){
        for(int s=n; s>=r; s-=1){
            figure += "  ";
        }
        for(int o=1; o<=r*2-1; ++o){
            if(o==1 || r==n || o==r*2-1){
            	figure += "* ";
            } else {
            	figure += "  ";
            }
        }
        figure += "\n";
    }
	return figure;
}
	
public static String invertedFullHollowTriangle(int n) {
	String figure = "";
	for(int r=n; r>=1; r--){
        for(int s=n; s>=r; s-=1){
            figure += "  ";
        }
        for(int o=1; o<=r*2-1; ++o){
            if(o==1 || r==n || o==r*2-1){
                figure += "* ";
            } else {
                figure += "  ";
            }
        }
        figure += "\n";
    }
	return figure;
}	
	
public static String halfLeftDiamond(int n) {
	String figure = "";
	for(int r=1; r<=n/2; r++){
        for(int o=1; o<=r; ++o){
            figure += "* ";
        }
        System.out.print("\n");
    }
    for(int r=n/2+1; r>=1; r--){
        for(int o=1; o<=r; ++o){
            figure += "* ";
        }
        figure += "\n";
    }
	return figure;
}

public static String halfRightDiamond(int n) {
	String figure = "";
	for(int r=1; r<=n/2; r++){
        for(int s=n/2; s>=r; s-=1){
            figure += "  ";
        }
        for(int o=1; o<=r; ++o){
            figure += "* ";
        }
        figure += "\n";
    }
    for(int r=n/2+1; r>=1; r--){
        for(int s=n/2; s>=r; s-=1){
            figure += "  ";
        }
        for(int o=1; o<=r; ++o){
            figure += "* ";
        }
        figure += "\n";
    }
    return figure;
}
	

	}
