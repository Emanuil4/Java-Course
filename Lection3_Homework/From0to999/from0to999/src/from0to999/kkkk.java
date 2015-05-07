package from0to999;
import java.util.Scanner;
public class kkkk {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter a number:");
		int a= input.nextInt();
		int b = a / 100;
		String ch="teen";
		String ch12=null;
		String ch13=null;
		switch(a){
		case 0:
			System.out.print("Zero");
			break;
		case 1:
			System.out.print("One");
			break;
		case 2:
			System.out.print("Two");
			break;
		case 3:
			System.out.print("Three");
			break;
		case 4:
			System.out.print("Four");
			break;
		case 5:
			System.out.print("Five");
			break;
		case 6:
			System.out.print("Six");
			break;
		case 7:
			System.out.print("Seven");
			break;
		case 8:
			System.out.print("Eight");
			break;
		case 9:
			System.out.print("Nine");
			break;
		case 10:
			System.out.print("Ten");
			break;
		case 11:
			System.out.print("Eleven");
			break;
		case 12:
			System.out.print("Twelve");
			break;
		}if (a>12 && a<=20){
			switch (a){
			case 13:
				System.out.print("Thir");
				System.out.print(ch);
				break;
			case 14:
				System.out.print("Four");
				System.out.print(ch);
				break;
			case 15:
				System.out.print("Fif");
				System.out.print(ch);
				break;
			case 16:
				System.out.print("Six");
				System.out.print(ch);
				break;
			case 17:
				System.out.print("Seven");
				System.out.print(ch);
				break;
			case 18:
				System.out.print("Eigh");
				System.out.print(ch);
				break;
			case 19:
				System.out.print("Nine");
				System.out.print(ch);
				break;
			case 20:
				System.out.print("twenty");
				break;
			}
		}if (a>20 && a<=99){
			int p= a/10;
			int r = a % 10;
			String ch4=null;
			if(r==1){
				ch4="-one";
			}else if(r==2){
				ch4="-two";
			}else if(r==3){
				ch4="-three";
			}else if(r==4){
				ch4="-four";
			}else if(r==5){
				ch4="-five";
			}else if(r==6){
				ch4="-six";
			}else if(r==7){
				ch4="-seven";
			}else if(r==8){
				ch4="-eight";
			}else if(r==9){
				ch4="-nine";
			}if (p==2){
				System.out.print("twenty" + ch4 );
			}else if (p==3){
				System.out.print("thirty" + ch4 );
			}else if (p==4){
				System.out.print("fourty" + ch4 );
			}else if (p==5){
				System.out.print("fifty" + ch4 );
			}else if (p==6){
				System.out.print("sixty" + ch4 );
			}else if (p==7){
				System.out.print("seven" + ch4 );
			}else if (p==8){
				System.out.print("eighty" + ch4 );
			}else if (p==9){
				System.out.print("ninety" + ch4 );
			}}if(a==100){
				System.out.print("One hundred");
			}if (a>100 && a<=999){
			String ch2="hundred";
				int c = a % 100;
				String k2=null;
				if (c>=1 && c<=20){
	           switch(c){
	           	case 1: 
	           	    k2 = "one";
	           		 break;
	           	case 2: 
	           		k2 = "two";
	           		break;
	           	case 3:
	           		k2 = "three";
	           		break;
	           	case 4: 
	          	    k2 = "four";
	           		break;
	       		case 5:
	           		k2 = "five";
	                break;
	           	case 6: 
	         		k2 = "six";
	           		break;
	           	case 7: 
	           		k2 = "seven";
	           		break;
	           	case 8: 
	           		k2 = "eight";
	           		break;
	           	case 9: 
	           		k2 = "nine";
	           		break;
	           	case 10: 
	           	   k2 = "ten";
	        	   break;
	           	case 11: 
	           		k2 = "eleven";
	         		break;
	         	case 12: 
	         		k2 = "twelve";
	         		break;
	         	case 13:
	         		k2 = "thirteen";
	         		break;
	       		case 14: 
	         		k2 = "fourteen";
	         		break;
	         	case 15: 
	         		k2 = "fifteen";
	         		break;
	         	case 16:
	         		k2 = "sixteen";
	         		break;
	         	case 17: 
	         		k2 = "seventeen";
	         		break;
	         	case 18: 
	         		k2 = "eighteen";
	         		break;
	         	case 19: 
	         		k2 = "nineteen";
	         		break;
	         	case 20:
	         		k2="twenty";
	         		break;
	           		}
	           if (b==1){
	        	   System.out.print("One " + ch2 +  " and " + k2);
	           }else  if (b==2){
	        	   System.out.print("Two " + ch2 + " and " + k2);
	           }else  if (b==3){
	        	   System.out.print("Three " + ch2 + " and " + k2);
	           }else  if (b==4){
	        	   System.out.print("Four " + ch2 + " and " + k2);
	           }else  if (b==5){
	        	   System.out.print("Five " + ch2 + " and " + k2);
	           }else  if (b==6){
	        	   System.out.print("Six " + ch2 + " and " + k2);
	           }else  if (b==7){
	        	   System.out.print("Seven " + ch2 + " and " + k2);
	           }else  if (b==8){
	        	   System.out.print("Eight " + ch2 + " and " + k2);
	           }else  if (b==9){
	        	   System.out.print("NIne " + ch2 + " and "+ k2);
	           }
				}if(c > 20 && c <= 99){
					int i = c / 10;
					int f = c % 10;
					if(f==1){
						ch12="-one";
					}else if(f==2){
						ch12="-two";
					}else if(f==3){
						ch12="-three";
					}else if(f==4){
						ch12="-four";
					}else if(f==5){
						ch12="-five";
					}else if(f==6){
						ch12="-six";
					}else if(f==7){
						ch12="-seven";
					}else if(f==8){
						ch12="-eight";
					}else if(f==9){
						ch12="-nine";
					}if(i==2){
						ch13="twenty"+ch12;
					}else if(i==3){
						ch13="thirty"+ch12;
					}else if(i==4){
						ch13="fourty"+ch12;
					}else if(i==5){
						ch13="fifty"+ch12;
					}else if(i==6){
						ch13="sixty"+ch12;
					}else if(i==7){
						ch13="seventy"+ch12;
					}else if(i==8){
						ch13="eighty"+ch12;
					}else if(i==9){
						ch13="ninety"+ch12;
					}if(b==1){
						System.out.print("One "+ ch2+ " " + ch13);
					}else if(b==2){
						System.out.print("Two "+ ch2+ " " + ch13);
					}else if(b==3){
						System.out.print("Three "+ ch2+ " " + ch13);
					}else if(b==4){
						System.out.print("Four "+ ch2+ " " + ch13);
					}else if(b==5){
						System.out.print("Five "+ ch2+ " " + ch13);
					}else if(b==6){
						System.out.print("Six "+ ch2+ " " + ch13);
					}else if(b==7){
						System.out.print("Seven "+ ch2 + " "+ ch13);
					}else if(b==8){
						System.out.print("Eight "+ ch2 + " "+ ch13);
					}else if(b==9){
						System.out.print("Nine "+ ch2+ " " + ch13);
					}
				}
				}
					
				
			}
			}
	
